#Nom: Omar Basman 
#Numero d'etudiant: 300406240

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
