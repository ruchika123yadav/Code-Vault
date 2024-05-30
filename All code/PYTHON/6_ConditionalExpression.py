a = 8;
# if else if ladder

if(a<3):
    print("The value of a is less than 3")
elif(a>13):
    print("The value of a is greater than 13")
elif(a>7):
    print("The value of a is greater than 7")
elif(a>17):
    print("The value of a is greater than 17")
else:
    print("Hey i am else")

# print("I am done now")  # oo big thing agr ish print ko else ke print ke just niche likha to wo ushe lse ka hi print manega to hamesha starting se hi likhne end wala print

# ***********
#               independent if statement
# if(a<3):
#     print("The value of a is less than 3")
# if(a>13):
#     print("The value of a is greater than 13")
# if(a>7):
#     print("The value of a is greater than 7")
# if(a>17):
#     print("The value of a is greater than 17")
# else:  # ab ye upr wale ka else hai bss mtlb 17 wale ka
#     print("Hey i am else") 

# uick uiz 
# age = int(input("Enter your age please"))   #'>=' not supported between instances of 'str' are bhai ishe int banana padega ki nhi)
# if(age>=18):
#     print("yes")
# else:
#     print("No")


# *****************
#  RELATIONAL OPERATOR(==,>=,<=)
# CONDITIONAL OPERATOR(and,or,not)
a = 5
# if(a>2 and a>5):
#     print("You can work with")

# if(a>2 or a>5):
#     print("You can work with")

# if(not 54):   # ye to print hi nhi ho rha
#     print("You can work with")

#############   IS AND IN

# b = 23
# if(b is 3):  # its like a == operator
#     print("yes")
# else:
#     print("No")

# v = [23,45,2]
# if(45 in v):  # its like ki ye 45 ish list ke andr hai ki nhi
#     print("yes")   # iske do use hai loop me bhi
# else:
#     print("No")


# ***********************************************
#                 PRACTICE SET
#   1
# n1 =int(input("Enter the first number"))
# n2 =int(input("Enter the second number"))
# n3=int(input("Enter the third number"))
# n4 =int(input("Enter the fourth number"))
# if(n1>n2 and n1>n3 and n1>n4):
#     print(n1,"is the gretest number")
# elif(n2>n1 and n2>n3 and n2>n4):
#     print(n2,"is the gretest number")
# elif(n3>n2 and n3>n1 and n3>n4):
#     print(n3,"is the gretest number")
# elif(n4>n2 and n4>n3 and n4>n1):
#     print(n4,"is the gretest number")

#    2
# physics = int(input("Enter the marks of the physics"))
# chemistry = int(input("Enter the marks of the chemistry"))
# maths = int(input("Enter the marks of the maths"))
# percentage = (physics+chemistry + maths)/3;
# if(physics>33 and chemistry>33 and maths>33 and percentage>40):
#     print("Congrats your are pass!!")
# else:
#     print("Sorry,do work hard")

#   3
# c = input("Please enter any comment")
# l = ["make a lot of money","buy now","suscribe this","click this"]
# if(c in l):
#  print("sorry this is a spam comment",l.remove(c))
# else:
#     print("Your comment is",c)
# print(l)

#    4
# u = input("Enter your username")
# # print(len(u))

# if(len(u)<10):
#     print("Your username is",u)
# else:
#     print("Please enter the usnername less than 10 characters")

#    5
# l = ["Ruchika","om","Papa","maummy","Dadi"]
# n = input("Enter any name")
# if(n in l):
#     print("Yes",n, "name is present in the list")
# else:
#     print("This name is not present in the list")

#   6
# e = int(input("Enter your marks please between 1 to 100:"))
# if e>=90 :
#     print("Excellent!!")
# elif e>=80 :
#     print("A")
# elif e>=70 :
#     print("B")
# elif e>=60 :
#     print("C")
# elif e>=50 :
#     print("D")
# else:
#     print("F")


#    7(ye uestion dubara krna galat hai yee)
p = input("Write anything")
if (p.find("Ruchika")):
    print("Yes this post is talking about Ruchika")
else:
    print("No its doesn't contain Ruchika")