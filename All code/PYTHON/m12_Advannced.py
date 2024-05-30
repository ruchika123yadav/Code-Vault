# while(True):
#     print("Press z to exit the code")
#     a = (input("Enter the number"))  # dekhp bhai z enter krnana hai na to uske liye yha input pe hi int nhi likh skte ishliye alag se likha hai
#     if (a == 'z'):
#         break
#     try:
#         a =int(a)
#         if a>6:
#             print(f"You Entered {a}")
#     except Exception as e:
#         print(e)
#         # print(f"You Entered a invalid value :{e}"") 

# #  Error ane ke baad bhi ham age game khel skte haii lekin yrr mera error hi print nhi ho rha e se

# print("Thanks for Playing the game")


# try:
#     a = int(input("Enter a number"))
#     c = 1/a
#     print(c)

# except ValueError as e:
#     print("Please Enter a valid value")
#     print(e)
# except ZeroDivisionError as e:
#     print("Any number is not didvied by 0")
#     print(e)

# print("Thanks for using the code")


#***************  ham apne domain ka custom error banake bhi daal skte haii

# def increament(num):
#     try:
#         return num + 1
#     except:
#         raise ValueError("This is our custom error")

# a = increament('sd452ds')  # lekin ha agr tum ishme kuch bhi daloge to hamshe ye hi nhi ayegaa agr string na dali hoti or aishe hi no. likh diya hota to syntax error show krta
# print(a)

# ************  TRY & ELSE
# mtlbelse kause ye hai ki agr hamar code run ho jata hai bina kisi error ke to else me jo likha ahi wo bhi run ho jayegaa or error aa gya to nhi run hoga
# try:
#     i = int(input("Enter a number:"))
#     c = 1/i
# except Exception as e:
#     print(e)
# else:
#     print("We are successful , we didn't get any error")


# # ***************** TRY WITH FINALLY
# try:
#     i = int(input("Enter a number:"))
#     c = 1/i
# except Exception as e:
#     print(e)
#     exit() 
# finally:  # lekin ye exit krr do code chahe kuch krr do print to ho krr rhega
#     print(" dekho chahe tum kuch nhi krr lo me to print honga hii")

# print("dekhte hai print hota hai ki nhi")  # dekho mene exit code krr diya iska mtlb ham chahe kitne bhi print krr le ab niche wo print nhi hoga

#  *********************  if __name__=="__main__":  its like a ending point

# def greet(name):
#     print("good Morning,",name)

# print(__name__)  # yha tak hamara code run hoga dusri file me
# #  ye yha abhi to main hi print hoga lekin inport kri hui file me jab run krayenge to jo file import kra rhe hai wo print hoga
# if __name__=="__main__":  
#     n = input("Enter Your name")
#     greet(n)

#   *************  GLOBAL KEYWORD
#  python contain two types of variable global and local variable

# a= 54 # GLobal  Variable
# def run():
#     global a # iska mtlb global  likh diya hai yha prr to ye khega global wala print kro or age jo  4 hai wo baad me as a global print ho hayega
#     print("Print the statement 1 ",a)
#     a  = 4  # Local Variable
#     #  dekho agr me yha global nhi likha hota to jo hamra 4 hai hai wo ish function ke bhr print nhi hota wo siirf ish funtion tak hi siit rhta
#     # 
#     print("Print the statement 2 ",a)

# run()
# print("Print the statement 3 ",a)


#********************* ENUMERATE
# list1 = [3,45,3,False,6.2,"Ruchika"]
# # index =0
# # for item in list1: 
# #     print(item,index)
# #     index +=1

# # for item in list1:
# #     print(item)

# for index, item in enumerate(list1):
#     print(item,index)


# ************ LIST COMPREHENSION(creative way to create a list)
# a =[2,45,7,8,90,67,43]

# b =[]
# for item in a:
#     if(item%2==0):
#         b.append(item)

# print(b)
# # shorcut to print the same code
# b = [i for i in a if i%2==0] # list comprehension
#  iska mtlb hai ki i  print krr do ek loop me jo i se start hai a list me or ushme condition hai jo if me di hai
# print(b)

# t = [1,2,4,5,3,5,2]
# s = {i for i in t}  # ARE HA CURLY BRESHES LAGAY HAI TO SE HAI
# print(s)

#  *******************************************************
#                       PRACTICE SET

#  1
def readfile(filename):
    try:
        with open(filename,"r") as f:
            print(f.read())
    except:
        print("This file is not found")

readfile("1.txt")
readfile("2.txt")
readfile("3.txt")

# 2
# l = [1,2,3,4,5,6,7,8,9]
# for index, item in enumerate(l):
#     if (index==2 or index ==4 or index == 6):
#         print(item,index)
#         print(f"the {index+1}th element is {item}")


#  3
# n = int(input("Enter the number"))

# table = [n*i for i in range(1,11)]
# print(table)

#  4
# try :
#     a = int(input("enter a number 1:"))
#     b = int(input("enter a number 2:"))
#     c = a/b
#     print(c)
# except ZeroDivisionError as e:
#     print("Infinite")

#  5
# n = int(input("Enter the number"))

# table = [n*i for i in range(1,11)]
# print(table)

# with open("table.txt","a") as f:
#     f.write(str(table))
#     f.write("\n")
#     # ek cheez bss hamesha dhyaan rakhna ki file me list nhi add krr skte ishliye phele string me banana padega ushe