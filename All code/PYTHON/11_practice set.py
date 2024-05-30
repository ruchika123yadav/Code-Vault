#   1 
# class _2d:
#     def __init__(self,i,j):  # __init__() should return None, not 'str
#         self.icap=i
#         self.jcap = j

#     def __str__(self):
#         return f"{self.icap}i + {self.jcap}j"

# class _3d(_2d):
#       def __init__(self,i,j,k):
#         super().__init__(i,j)
#         self.kcap=k
       
#       def __str__(self):
#         # self.tt=t  ????????
#         return f"{self.icap}i + {self.jcap}j + {self.kcap}k"


# vec1 = _2d(2,4)
# vec2 = _3d(8,2,6)
# print(vec1)  # dekh rhe hoo str wala constructor ka use kiya hia mene idhar ki direct object ke name se hi value mil jaye mujhee
# print(vec2)


# 2
# class Animal:
#     carnivours = "These are carnivourous animals"
#     herbivorous = "These are herbivorous animals"

# class pets(Animal):
#     dog="These are the category of dogs class"

# class dogs(pets):
#     #  idhar bhiaya ne ishe static method banaya or reason diya ki ye kisi bhi instance method or class ke method ko use nhi krr rha
#     def bark(self):
#         print("Dogs are barking")


# d = dogs()
# d.bark()
# print(d.dog)
# print(d.herbivorous)


#  3
# class Employee:
#     Salary = 50000
#     Increament = 2
    
#     @property
#     def SalaryAfterInc(self):
#         return self.Salary*self.Increament

#     @SalaryAfterInc.setter
#     def SalaryAfterInc(self,s):
#         self.Increament = s/self.Salary

# e = Employee()
# e.SalaryAfterInc=456789
# print(e.SalaryAfterInc)
# print(e.Increament)

# 4  (a+ib)(c+id) = (ac-bd) + (ad+bc)i
# class Complex:
#     def __init__(self,r,i):
#         self.real = r
#         self.img = i

#     def __add__(self ,r2):
#         return complex(self.real + r2.real , self.img + r2.img)
    
#     def __str__(self):
#         return f"{self.real} + {self.img}i"
  
#     def __mul__(self,r2):
#         real = self.real*r2.real - self.img*r2.img
#         imgi =  self.real*r2.img + self.img*r2.real
#         return  complex(real,imgi)

#     def __str__(self):
#         return f"{self.real}+{self.img}i"
  
# c1 = Complex(3,2)
# c2 = Complex(1,7)
# print(c1+c2)
# print(c1*c2)


#  5
# class Vector:
#     def __init__(self,i,j):
#         self.icap = i
#         self.jcap = j
#         # self.kcap =k
         
#     def __sum__(self,n):
#         return Vector(self.icap +n.icap , self.jcap+n.jcap)

#     def __str__(self):
#         return f"{self.icap}i + {self.jcap}j "


# v1 = Vector(2,3)
# v2 = Vector(5,6)
# print(v1 + v2)

#  or 5 & 7
class Vector :
    def __init__(self,vec):
        self.vec = vec
    
    def __str__(self):
        str1 = ""
        index = 0
        for i in self.vec:
            str1 += f"{i}a{index} +"
            index +=1
        return str1[:-1] # aisha krne se last me + nhi ayega ye whi property hai jo string me padhi thi
     
    def __add__(self,vec2):
        
        newlist = []
        for i in range(len(self.vec)):
            newlist.append(self.vec[i] + vec2.vec[i])
        return Vector(newlist)

    # def __str__(self): abe bhuddhu jab usko list me return kiya hai to  list me hi wapas lee ki liye tabhi to loop chalya haii upr wale str mee
    #     return self.vec


    def __mul__(self,vec2):
        sum = 0
        for i in range(len(self.vec)):
            sum+= self.vec[i]*vec2.vec[i]
        # return Vector(sum) ab ye nhi krr skte the kyuki str iterable hai or ye to ek hi vakue haii to kese ayegii
        # return Vector(sum) -->'int' object is not iterable
        return sum  # prr yrr mujhe ye bhi samaj nhi aa rha ki ye sum kese iterable ho skta haii

    def __len__(self):
        return len(self.vec)

v1 = Vector([1,4,6,2])
v2 = Vector([6,7,8,4])
print(v1+v2)
print(v1*v2)
print(len(v1))
print(len(v2))



#   6

class Vector:
    def __init__(self,vec):
        self.vec= vec

    def __str__(self):
        return f"{self.vec[0]}i + {self.vec[1]}j + {self.vec[2]}k"


v1 = Vector([1,4,6])
v2 = Vector([1,6,9])
print(v1)
print(v2)