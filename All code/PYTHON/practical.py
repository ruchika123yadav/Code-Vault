def fact(n):
    if(n==0 or n==1):
        return 1
    else:
        return n*fact(n-1)
    
n =fact(4)    
print(n)


def add(a,b):
    return a+b
def sub(a,b):
    return a-b
def mul(a,b):
    return a*b
def div(a,b):
    return a/b

a =int(input("enter the value of a"))
b=int(input("enter the value of b"))
p=int(input("enter the value you want to perform"))
if(p==1):
    print(add(a,b))
if(p==2):
    print(sub(a,b))
if(p==3):
    print(mul(a,b))
if(p==4):
    print(div(a,b))

for i in range(5):
    for j in range(0,i+1):
        print("*",end="")
    print("\n")

 
x = list(input("enter first list"))
y = list(input("enter second list"))
size=len(x)
s=[]
k=0
while k<size:
     s.append((x[k],y[k]))
     k+=1

print(s)
