
# class employee:
#     company ="Micorsoft"

#     def showdetail(self):
#         print("This is an employee")
# #  SINGLE INHERITANCE
# class programmer(employee):
#     language = "Java"

#     def getlang(self):
#         print(f"The language is {self.language}")
#     def showdetail(self):
#         print("This is an programmer")

# e = employee()
# p = programmer()
# e.showdetail()
# p.showdetail()

# ***********                  MULTIPLE INHERTIANCE

# class Employee:
#     company = "Micorsoft"
#     eCode = 120
# class Freelancer:
#     company = "Google"
#     level = 10
#     def upgradeLevel(self):
#         self.level = self.level +1
#  class programmer(Freelancer,Employee):
#     name="Ruchi"


# p = programmer()
# print(p.company)  # jo aap phele extend kroge whi print hoga pehle
# print(p.level)
# p.upgradeLevel()
# print(p.level)

#  *****************
#                               MULTILEVEL INHERITANCE
# class Person:
#     company = "India"
#     def __init__(self):
#         print("I am the constructor of person")
#     def takeBreadth(self):
#        print("I am breadthing")

# class Employee(Person):
#     # comapny = "Honda"
#     def __init__(self):
#         super().__init__()
#         print("I am a constructor of Employee")
#     def getSalary(self):
#         print(f"Salry is {self.salary}")

#     def takeBreadth(self):
#         super().takeBreadth()
#         print(" I am an Employee so I am lucikly Breathing!!")

# class programmer(Employee):
#     # company = "Fiverr"
#     def __init__(self):
#         super().__init__()
#         print("I am the constructor of programmer")
#     def getsalary(self):
#         print(f"No salary to puepue")
    
#     def takeBreadth(self):
#         super().takeBreadth()
#         print(" I am a Programmer so i am breathing++!!")


# p = Person()
# p.takeBreadth()
# e = Employee()
# e.takeBreadth()
# # e.getSalary()  # wo mw bo hi rha tha ki jab koi attribute hi nhi diya to kese chal jayegaa
# pr = programmer()
# pr.takeBreadth()
# print(pr.company)

#   **************
#                                   CLASS METHODS
# class Employee:
#     company = "Micorsoft"
#     salary = 5000000
#     location = "Hyderabad"

#     @classmethod#(me class ke atrribute change krna chata hu) ye class ke attribute ko chnage krr dega
#     def changesalary(self,sal):
#         # self.salary = sal
#         # self.__class__.salary = sal  # it will change the class attribute also
#         # or
#         self.salary = sal

    
# e = Employee()
# print(e.salary)
# # Employee.salary = 4000000
# print(e.salary)

# e.changesalary(455)
# print(e.salary)
# print(Employee.salary)   # ab hamara ye bhi change hoo gyaa by use of class method

#  ***********  ACCHA PROGRAM HAII YEE        PROPERTY
# class College:
#     Salary = 60000
#     Bonus = 5000

#     def __init__(self,t):
#         self.name = t

#     @property#(ab totalsalary property ki tarah kaam kregaa)
#     def TotalSalary(self):
#         return self.Salary + self.Bonus

#     @TotalSalary.setter
#     def TotalSalary(self,val):
#         self.Bonus = val - self.Salary

# t = input("Enter the name of the teacher")    
# e = College(t)
# print(f"{t}:\n Salary={e.TotalSalary}")
# print(e.Bonus)
# e.TotalSalary = 80000
# print(f"{t}:\n Salary={e.TotalSalary}")
# print(e.Bonus)


#  *********                    OPERATOR OVERLOADING
#  ye jitne bhi constructor hai wo sare well definrd hai phele se hi python me to ye sare override kiya hai or ha inki jagah dusra koi nhi likh sktee
class Number:
    def __init__(self,num):
       self.num=num

    def __add__(self,num2):  # it is a method of operator overloading
        print("Lets add the number")
        return  self.num + num2.num # mtlb wo number add kro jo ek to hamne diya hai or dusraa num2 wala
    def __mul__(self,num2):
        print("Lets Multiply")
        return self.num*num2.num
    def __floordiv__(self,num2):
        return self.num//num2.num

    def __str__(self):  # ye jo hamne object banaya ushme no. diya usee print krr rha hai bss
        return f"Decimal number:{self.num}"
    def __len__(self):
        return 2
n1 = Number(4)
n2 = Number(5)
sum =n1 + n2
print(sum)
mul = n1*n2
print(mul)
floor = n1//n2
print(floor)
print(n1)
print(len(n1))

 