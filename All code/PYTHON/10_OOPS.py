# class Number:
#     def sum(self):
#         return self.a +self.b

# num = Number()
# num.a = 34;
# num.b = 12;
# r = num.sum()
# print(r)
#   classes apne app me memory nhi leti hai
#  CAMEL CASE-->  isFontCase
#  PASCAL CASE --> PascalCase
 

# dekho bahi tum instance attribute kahi bhi add krr skte ho or ushe fir class me bhi likke access krr skte hoo like tume salary class me nhi likha lekin object me likha hai to tum ushe class ke funstion me bhi likh skte ho self.salary  
# class RailwayForm:
#     formtype ="RailwayForm"
#     def printdata(self):
#         print("name is",self.name)
#         print("Train is",self.train)

# ruchikaform = RailwayForm()
# ruchikaform.name ="Boss Ruchika Yadav"
# ruchikaform.train="Bullet train"
# ruchikaform.printdata()
 
#   remote
# class remote:
#     pass

# class player:
#     def moveright(self):
#         pass
#     def moveleft(self):
#         pass
#     def movetop(self):
#         return True

# remote1 = remote()
# player1 = player()

# if(player1.movetop()):
#     player.moveleft()
        

        # 
# class employee:
#     company = "Google"
#     salary = 10000000

# Ruchika = employee()
# om = employee()
# print(Ruchika.company)
# print(om.company)
# # Ruchika.company="Microsoft"   # om ki company change nhi hue bete
# Ruchika.company="Microsoft"   # yha jab chnage kiya hai to wo objet ke naam se change nhi balki class ke naam se change hua hai
# print(Ruchika.company)
# print(om.company)
# # Ruchika.salary = 400000
# # om.salary= 300000
# print(Ruchika.salary)
# employee.salary = 90000000  # same here also
# print(om.salary)
# print(Ruchika.salary)


# #   *******************************
# SELF(ek aisha parameher ahi jo pass hota ahi automatically app kisi bhi object ko call krte ho to) 
# class employee:
#       salaryy = 34000000  
#       def salary(self):
#           print(f"My salary is{self.salaryy}")

# Ruchika = employee();
# # Ruchika.salaryy=100000
# Ruchika.salary()
 
# employee.salary(Ruchika)  # ye jo upr likha hai or ye likha hai dono ka same hi meaning hai ham jab function ko call krte hai to wo laghbag ish type se call hota hai ki Ruchika ushme pass ho rhi hai to ishliye error aya tha 1 argument

#  ***************************************
#    STATIC(iska mtlb ye hai ki jo hame salf pass krna padta hai fumctions me ish static ki madad se hame ushe pass nhi krna padega)
#   ye jo hamra object ek RGUMENT PASS KRNE LAGTA JESE ish case me ruchika to wo ishe ish form me convert hi nhi hone deta
# class employee:
#     def salary(self,signature):
#         print(f"My salary is:{self.salaryy}\n{signature}")
#         # to agr me yha sign. se phele self  nhi laga skta kyuki wo ek attribute nhi hai wo to ek argument hai
#     @staticmethod
#     def greet():
#         print("Good Morning Ruchi")
#     @staticmethod
#     def time():
#         print("kinta time ho rhaa hai")

# Ruchika = employee();
# Ruchika.salaryy=100000
# Ruchika.greet()  #employee.greet(Ruchika)
# Ruchika.salary("Ruchika Yadav")
# Ruchika.time()

# ************************************************ 
#  CONSTRUCTOR

# class employee:
        
#     def __init__(self,name,salaryy): # constructor
#         self.n = name  # yha ye n whi original attribute rhenge or name orint karanw ke liye n=ruchika.n hi likhna padega
        
#         self.s = salaryy
          
#         print("I am the constructor of the employee class")
#         print(f"Name is {name} and salary is{salaryy}")

#     def salary(self,signature):
#         print(f"My salary is{self.s}\n{signature}")  # dekho agr me attribute constructor ke function me hi likhu to wo jo agument hai hi likh skte hai lekin agr dusre methos me likh rhe  hai to jisse assign kiya hia usee likenge like n and s
#         print(f"I am testing{self.n}")
#     @staticmethod
#     def greet():
#         print("Good Morning Ruchi")
#     @staticmethod
#     def time():
#         print("kinta time ho rhaa hai",)

# Ruchika = employee("Ruchika",1000000)
# print(Ruchika.n)
# Ruchika.salary("Lo bhai signature")
#   ************************************
#   PRACTICE SET

# #   1
# class programmer:
#     company ="Micorsoft"
#     def __init__(self,name,salary,id):
#         self.n = name
#         self.s = salary
#         self.i = id
#         # print(f"The name of the employee is{name}")
#         # print(f"The salary of the employee is{salary}")
#         # print(f"The id of the employee is{id}")
#     def printDetail(self):
#         print(f"The name of the employee is{self.n}")
#         print(f"The salary of the employee is{self.s}")
#         print(f"The id of the employee is{self.i}")

# E1 = programmer("Ruchika",500000,"ru23")
# E2 = programmer("om",200000,"om45")
# E1.printDetail()
# E2.printDetail()
# #  delho bahi agr constructo me hi attribute use krr rhe ho to to rum jo argumrnt tumne method me diya hai sirf whi likh skte ho print krane ke liye
# # lekin agr tume dusra method bana rhe ho to tumne use self.n mtbl jisse bhi banaya hai whi likhna padega

#  2&4
# class calculator:
#     def __init__(self,number):
#         self.suare = number*number  #number**2
#         self.cube = number*number*number  #number**3
#         self.suareroot = number**0.5  
#     def sauree(self):
#             print(f"The suare of the number is{self.suare}")
#     def cubee(self):
#             print(f"The cube of the number is{self.cube}")
#     def suarerrott(self):
#             print(f"The suare root of the number is{self.suareroot}")
#     @staticmethod
#     def greet():
#         print("Welcome to the coding world!!")

# N1 = calculator(5)
# N2 = calculator(6)
# N3 = calculator(4)
# N1.sauree()
# N2.cubee()
# N3.suarerrott()
# N1.greet()

#   3
# class sample:
#     a = "Ruchika yadav"

# obj = sample()
# # obj.a="Om"
# # sample.a="Ruchi" # this will change the class attribute
# print(obj.a)

#   5
class train:
    def __init__(self,name,fare,seats):
        self.name=name
        self.fare=fare
        self.seats=seats
    def fareInfo(self):
        print(f"Train is {self.name} Train\nNo. of seats are {self.seats}\n Fare is {self.fare}")
    def bookTicket(self):
        if(self.seats>0):
            print(f"Your ticket has been booked! and your seat no. is{self.seats}")
            self.seats = self.seats -1
        else:
            print("Sorry seats are full,please try tatkal")

    # def cancleTicket(self,seatNo):
    #     vacantSeat=
    #     self.seats=self.seats +1




Bullet = train("Bullet",300,10)
# sanghai = train("sanghai",500,300)  # behle tum print me name phele likho chahe seats wo print function ke argumetn ke according hi hoga
# sanghai.fareInfo()
Bullet.bookTicket()
Bullet.bookTicket()
Bullet.bookTicket()
Bullet.fareInfo()


#  6
class sample:
    def __init__(ruchi,name):  # yes i can change the name of self with anyone lekin fir haar jagah self ki jagah whi name likhna hoga
        ruchi.name=name

obj = sample("Ruchika")
print(obj.name)