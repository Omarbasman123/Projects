#Nom: Omar basman 
#Numero d'etudiant: 300406240

#test Q1
def triangle(n, current=1):
    if current > n:  
        return
    print('*' * current)
    triangle(n, current + 1)  

#Application 
triangle(5)

#test Q2
def etoiles(n, current=None):
    if current is None:  
        current = n

    if current > 0:  
        print('*' * current)
        etoiles(n, current - 1)  
    else:
        
        for i in range(1, n + 1):  
            print('*' * i)
#Application
etoiles(4)

#test Q3
def prodListePos_rec(lst, n):
    if n == 0:  
        return 1  
    current = lst[n - 1]
    if current > 0:
        return current * prodListePos_rec(lst, n - 1)  
    else:
        return prodListePos_rec(lst, n - 1)
def prodLRec1(lst):
    if not lst:
        return 1  
    current = lst[0]  
    if current > 0:
        return current * prodLRec1(lst[1:])  
    else:
        return prodLRec1(lst[1:])
l = [1, -2, 5, 0, 6, -5]

print(prodListePos_rec(l, len(l)))  
print(prodLRec1(l))                

l = []

print(prodListePos_rec(l, len(l)))  
print(prodLRec1(l))                





                





