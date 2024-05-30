# TYPECASTING IS A METHOD IN WHICH ONE DATATYPE CHANGE INTO ANOTHER
#  HAM VALUE KO OVERRIDE BHI KRR KSTE HAI YANI JO MENE YHA A LIKHA HAII
a = "354"  #age tumne niche bhi same type ka variable bana rakha hai to ye niche wala ko manega
# a = "35efwc44"      give an error
a = int(a)    # ham isko yha type cast kar rha huu jisse ye hamra string se int me change ho jaye
print(type(a))
print(a+34)

# INPUT FUNCTION
a = input("Enter your na me: ")
print(a)
a = int(a)  # ab change krega ye integer me
print(type (a))  # bhale hi tum ek numeric number dalo lekin phir bhi ye String hi dega type me

# **** PRACTICE SET

a = 34  # beta dekh rhe ho jiske ab yha a likha to ye wale a ki value lega  ye ab
b = 5
print(a+b)

# 2
d = 45
c = 24  # pata nhi aa rha kyu 21 aa rha hai
print("the remiander of the a and b is",d%c)


#  IMEDIATE MODE MANJE REPEL KHOLO OR BINA FILE BANAYE KOI BHI PROGRAM RUN KRLO

#  4
a = input("Enter the first number:");
b = input("Enter the second number:");
a=int(a)
b=int(b)
c = (a+b)/2;
print( " the value of the average is:",c);

#  5

a=input("Enter the number you want to swuare of")
a = int(a)
print("the aure of the number is:",a*a)
 
d=45
s=66
print("the value of sum of d and s is",d+s)