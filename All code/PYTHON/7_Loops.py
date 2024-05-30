#        WHILE LOOP

i = 0
while(i<10):
    print("Yes",i)
    i = i+1;   # abe ishme i++ nhi chlta
print("Done ")


# i =1;
# while(i<=50):
#     print(i)
#     i = i+1;

# fruits  =['banana','mangoes','grapes','papaya','orange']                                                      
# i = 0;
# while(i<len(fruits)):
#     print(fruits[i])
#     i =i+1;
   # # 5:26

            # FOR LOOP        #  
print("My favorite movies name are:")
movies = ["Avengers Endgame", "Avatar","Harry potter","Pirates of the carrabian", "3 Idiots"]
for i in movies:
    print(i)

# for i in range(8):    #ye 0 se 7 tak print hoga
#  dekho bhai ye jo range hai tum idhar range hi likhoge uski jagah kuch nhi likh skte
# for i in range(2,8):      # 2 se 7 tak print hoga
# for i in range(2,8,2):   #step size   # 2 se ek ek number chodke print krega
#     print(i) 
 

#  FOR ELSE AND BREAK
# for i in range(10):
#     print(i)
#     if(i==5):
#        break;
# else:    # dekho bhai yha mene apna loop sucessfully iterrate nhi kraya to ye jo niche else hai wo run nhi hoga wo run tabhi hoga jab hamra loop successfully iterate ho jaye
#     print("I am a else in loop")  # bss ye hi antr hai simple print likhne me or else lagake likhne me

    # CONTINUE(even odd me use krr skte hai)
# for i in range(1,10):
#     if(i==4):
#         continue;
#     print(i);   # ye spaces ka bhi dhyaan dena inme wo continue ke niche nhi ana chahye wrna wo if statement me mana jayega
# else:         # else to print krega
#     print("I am Happy")

#                 PASS
# i = 9;
# if (i<20):
#     pass;

# while (i<10):
#     pass;

# print("Its just a pass statement")

#     PRACTICE SET

#   1
# t = int(input("Enter the number whose table you want to know"))
# for i in range(1,11):
#     # print(t,"X",i,"=",t*i)  ye nhi krr skte ishmee
#     print(str(t), "X" , str(i) , "=", str(t*i))
#     # print(f"{t}X{i}={t*i}")    # ye hai f string

    # 2
# l = ["Ruchika","Salman","Sachin","Rahul"]

# for name in l:
#      if(name.startswith("S")):
#         print("Hello",name)  


#    4(****Important uestion****)
num = int(input("Enter the Number"))
prime = True
for i in range(2,num):
    if(num%i==0):
        prime=False;
if prime:
    print(num,"is the prime number")
else:
    print(num,"is not a prime number")

#    5
# sum = 0;
# i = 1;
# n = int(input("Enter the number "))
# while(i<=n):
#       sum +=i;
#       i = i+1;
# print(sum);

#   6
#  by while loop
# fact = 1;
# n = int(input("Enter the number whose factorial you want to know"))
# while(n>0):
#     fact*=n
#     n = n-1;
# print(fact)

# by for loop
n = int(input("Enter the number whose factorial you want to know"))
fact = 1;
for i in range(1,n+1):
    fact*=i
print(fact)
