def percentage(marks):
    p= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5
    return p

marks1 =[90,87,98,99,97]
# percentage1 =(marks1[0],marks1[1],marks1[2],marks1[3],marks1[4])/5
 
marks2 =[90,99,98,97,99]
# percentage2 =(marks2[0],marks2[1],marks2[2],marks2[3],marks2[4])/5
percentage2 = percentage(marks2)

print(percentage2)

# uik uiz
# def greet(name):
#      s = print("Good Morning",name);
#      return s;

# n = input("Enter your name")
# greet(n)

#  
# def mysum(num1,num2):
#     return num1+num2;

# s = mysum(34,2)
# print(s)

#   DEFAULT FUNCTION

# def greet(name ="Rcuhiiiii"):
#     return print("Good day",name)

# greet("Ruchika")
# greet()   # agr mene kuch nhi diya to default mw wo chala jayega

#  RECURSSION
# fact =1;
#                   NORMAL WAY
# def factorial(n):
#     fact =1;
#     # i =1; # dekho agr tumne yha i ki value de bhi di tab bhi wi 0 se hi chalegaa
#     for i in range(n):
#          fact *=(i+1);
#     return fact;

# f =factorial(5)
# print(f)

    # BY RECURSSION

# def fact(n):
#     if(n==0 or n ==1):
#         return 1;
#     return n*fact(n-1)

# f = fact(5)
# print(f)

#                       PRACTICE SET
#  1
# def great(a,b,c):
#     if(a>b and a>c):
#         print(a,"is the greates number")
#     if(b>a and b>c):
#       print(b,"is the greates number")
#     if(c>b and c>a):
#         print(c,"is the greates number")
    
# great( 90,87,99);

# 2
# def converter(c):
#     f =  (c*(9/5)) + 32
#     return f

# # t = int(("Enter the temperature in celsius"))   # yrr ishne bada dimmag khaya isse to wo isse int hi nhi maan rha error show or krr rha ahi to alg se int value hi dene hogi tem ke liye
# t = 34
# h = converter(t)
# print("fahreheit temperature is",str(h))

#   3(ye hai bina next line se print karana)
# print("hello",end="")   
# print("how",end="")
# print("are",end="")
# print("you",end="")

#   4
# def sum(n):
#     if(n==1):
#         return 0
#     return n + sum(n-1);

# n = sum(5);
# print(n)
  
#      5
# def pattern(n):
#     for i in range(n):
#       s=  print("*" * (n-i))
#     return s

# p = int(input("Enter the any number"))
# pattern(p)

#    6
# def convert(inch):
#     cm = (inch*2.54)
#     return cm

# i = int(input("Enter the temperature into inches"))
# print(convert(i))

#   7
# def strip_r(String, Word):
#     news = String.replace(Word,"")
#     return news.strip()

# s = ("Ruchika is nice")
# print(strip_r(s,"Ruchika"))

#    8
def table(t):
    for i in range(1,11):
        print(f"{t} X {i} = {t*i}")
 
table(8)


# def greet(name):
#    print("I am very happy",name)
# def mysum(num1,num2):
#    return num1 +num2

# greet("Ruchika")
# s =mysum(23,45)
# print("the sum of the two numbers is",mysum)