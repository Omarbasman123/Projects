# Nom: Omar Basman
# Numero d'etudiant: 300406240

from jeuSudoku import *

def afficherGrille(grille):
    '''
    (list) -> None
    Affiche le grille de jeu Sudoku
    Preconditions: grille est une reference a une matrice 9x9 qui contient déja des nombres de 1 à 9
    '''
    print("   ", end="")
    col = 0
    while col < len(grille):
      print(col, end="  ")
      col += 1
    print()
    row = 0
    while row < len(grille):
       print(row, end="")
       col = 0
       while col < len(grille[row]):
         print(" ", grille[row][col], end="")
         col += 1
       print()
       row += 1

def jouer(grille, row, col, num):
    '''
    (list, int, int, int) -> Bool
    Jouer une étape de jeu Sudoku
    Preconditions: grille est une réference sur une liste de 9x9 contient seulement des nombres
    grille est modifié (un element est ajouté dans la grille) si la case est valide est correcte.
    '''
    
    def verifierLigne(grille, row, num):
     ''' 
    (list, int, int) -> bool
    Vérifier si le nombre `num` n'existe pas déjà dans la ligne `row`.
    Préconditions : `grille` est une référence à une matrice 9x9 qui contient des nombres de 1 à 9
     '''
    # Parcourir chaque colonne de la ligne spécifiée
    for col in range(9):
        # Si le nombre `num` est trouvé dans la ligne, retourner False
        if grille[row][col] == num:
            return False
    # Si le nombre `num` n'est pas trouvé dans la ligne, retourner True
    return True


def verifierCol(grille, col, num):
    '''
    (list, int, int) -> bool
    Vérifier si le nombre `num` n'existe pas déjà dans la colonne `col`.
    Préconditions : `grille` est une référence à une matrice 9x9 qui contient des nombres de 1 à 9
    '''
    # Parcourir chaque ligne de la colonne spécifiée
    for row in range(9):
        # Si le nombre `num` est trouvé dans la colonne, retourner False
        if grille[row][col] == num:
            return False
    # Si le nombre `num` n'est pas trouvé dans la colonne, retourner True
    return True


def verifierSousGrille(grille, row, col, num):
    '''
    (list, int, int, int) -> bool
    Vérifier si le nombre `num` n'existe pas déjà dans la sous-grille 3x3 contenant la case à la position (row, col).
    Préconditions : `grille` est une référence à une matrice 9x9 qui contient des nombres de 1 à 9
    '''
    # Calculer le début de la sous-grille 3x3 en fonction de la position donnée
    start_row = (row // 3) * 3
    start_col = (col // 3) * 3

    # Parcourir chaque case dans la sous-grille 3x3
    for i in range(3):
        for j in range(3):
            # Si le nombre `num` est trouvé dans la sous-grille, retourner False
            if grille[start_row + i][start_col + j] == num:
                return False
    # Si le nombre `num` n'est pas trouvé dans la sous-grille, retourner True
    return True


def verifierGagner(grille):
    '''
    (list) -> bool
    Vérifie si la grille est complètement remplie avec des nombres de 1 à 9.
    Préconditions : `grille` est une référence à une matrice 9x9 qui contient des nombres de 1 à 9
    '''
    # Parcourir chaque ligne et chaque colonne de la grille
    for row in range(9):
        for col in range(9):
            # Si une case est vide (0 par exemple), retourner False
            if grille[row][col] == 0:
                return False
    # Si toutes les cases sont remplies, retourner True
    return True


def verifierValide(grille, row, col, num):
    '''
    (list, int, int, int) -> bool
    Vérifie si le nombre proposé `num` peut être placé dans la case à la position (row, col)
    en respectant les règles du Sudoku.
    Préconditions : `grille` est une référence à une matrice 9x9 qui contient des chiffres entre 1 et 9
    '''
    # Vérifier que `num` n'est pas déjà présent dans la ligne `row`
    if not verifierLigne(grille, row, num):
        return False

    # Vérifier que `num` n'est pas déjà présent dans la colonne `col`
    if not verifierCol(grille, col, num):
        return False

    # Vérifier que `num` n'est pas déjà présent dans la sous-grille 3x3
    if not verifierSousGrille(grille, row, col, num):
        return False

    # Si `num` respecte toutes les règles, retourner True
    return True

    
grille = [[5, 3, 8, 6, 9, 1, 0, 4, 7],
              [7, 4, 6, 0, 3, 2, 8, 1, 9],
              [1, 9, 2, 0, 8, 4, 3, 5, 6],
              [8, 7, 1, 2, 6, 3, 4, 9, 5],
              [3, 2, 9, 4, 5, 7, 1, 6, 8],
              [4, 6, 5, 9, 1, 8, 7, 2, 3],
              [0, 0, 4, 3, 7, 9, 5, 8, 2],
              [9, 8, 3, 1, 0, 5, 6, 7, 4],
              [2, 5, 0, 8, 4, 6, 9, 3, 1]]

print("Menu: 1- Commencer un nouveau jeu.")
print("     ", "2- Continuer le jeu.")
print("     ", "3- Quitter le jeu.")
choix = int(input("SVP entrez votre choix: 1, 2 ou 3: "))
while choix < 3 and choix > 0:
      if choix == 1:
          # Créer le tableau de jeu (9 x 9)
          grille = [[5, 3, 8, 6, 9, 1, 0, 4, 7],
                    [7, 4, 6, 5, 3, 2, 8, 1, 9],
                    [1, 9, 2, 7, 8, 4, 3, 5, 6],
                    [8, 7, 1, 2, 6, 3, 4, 9, 5],
                    [3, 2, 9, 4, 5, 7, 1, 6, 8],
                    [4, 6, 5, 9, 1, 8, 7, 2, 3],
                    [6, 1, 4, 3, 7, 9, 5, 8, 2],
                    [9, 8, 3, 1, 2, 5, 6, 7, 4],
                    [2, 5, 0, 8, 4, 6, 9, 3, 1]]  # la seule matrice utilisé dans le programme.
      afficherGrille(grille)
      row = int(input("entrez votre choix de case ligne "))
      col = int(input("entrez votre choix de case col "))
      num = int(input("entrez votre choix de case num "))
      if grille[row][col] == 0:
          ajout = jouer(grille, row, col, num)
          if ajout == True:
              print("Bravo!!")
          else:
              print("Echec :(")
      else:
          print("Case deja rempli")
      afficherGrille(grille)
      if verifierGagner(grille) == True:
          print("Bravo!! Vous avez gagne")
          choix = -1
      else:
         print("Menu: 1- Commencer un nouveau jeu.")
         print("     ", "2- Continuer le jeu.")
         print("     ", "3- Quitter le jeu.")
         choix = int(input("SVP entrez votre choix: 1, 2 ou 3: "))
if choix==3:
    print("Au revoir")
