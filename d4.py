# Nom: Omar Basman
# Numero d'etudiant: 300406240 

#test Q1 
# Le dictionnaire
d = {"apple": "pomme", "banana": "banane", "pear": "poire", "plum": "prune"}

def transl(d, s):
    
    if s in d:
        return d[s]
    
    elif s in d.values():
       
        for key, value in d.items():
            if value == s:
                return key
    
    return "Unknown"

# Application
print(transl(d, "pear"))  
print(transl(d, "poire"))  
print(transl(d, "appricot"))


#test Q2

def setOp(list1, list2):
    
    result_set = set(list1) | set(list2)
    return result_set

# Application
print(setOp([1, 2, 2, 3] , [2, -6, 8, 7]))  
print(setOp([], [1,4,2,4,6]))
print(setOp([1,1,1,1],[]))
print(setOp([1],[2,3,2,2]))

#test Q3
def matrixMinMax(m):
    
    flat_list = [item for row in m for item in row]
    return (min(flat_list), max(flat_list))


matrix = [
    [3, 5, 9],
    [1, 7, 2],
    [8, 4, 6]
]  

matrix2 = [
    [10, 20, 30],
    [40, 50, 60],
    [70, 80, 90]
]
#Application
print (matrixMinMax([[1,5],[2,8]]))
print (matrixMinMax([[1,5,10],[2,8,-1]]))
print (matrixMinMax([[2,8,-1]]))
print (matrixMinMax([[1],[1]]))

