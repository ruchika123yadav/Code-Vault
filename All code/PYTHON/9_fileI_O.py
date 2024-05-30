import os

# use open function to read the content of a file!!
# f = open('samplefile.txt','r')
# # data = f.read()  #yha jo mode hai r hai means read by default agr aap koi mode nhi likhte to wo r hi lelega mode
# data = f.read(5)   # ye phele 5 characters hi read krega 
# print(data)
# f.close()
 

#  ******
# #         READ LINE(mtlb phele line print krta ha)
# t = open('sample.txt')
# data = t.readline()
# print(data)
# #  read second line
# data = t.readline()   # ahr dubara print krunga to wo dusri line print krege
# print(data)
# t.close()

# writing the file(ishme dusri baar likhe pe \ lagana padta hai new line me lane ke liye)

 
# w.write("\nI am also writing this to the file")
# w = open('another .txt','r')
# data = w.read()
# w = open('another .txt','w')
# w.write("Please write this to the file")
# w =open('another .txt','a')
# w.write("Now i am uing the appending method")
# w.write("I am appeneding")
# print(data)
 
# # data.read() --> not work
# # print(data)
 
# w.close()

#   ******* --> kese use krna hai + ko
# f = open('another .txt','+')
# data =f.write('I am udatinf something')
# print(data)
# f.close()

#****  agr mene 'w' ka use dubara kiya to pehel sari file khali ho jayegi suke baad ushme koi bhi data add hoga 

# w = open('another .txt','w')
# w.write("writning something")
# w = open('another .txt','r')
# data = w.read()
# # print(data)
# print(data)
# w.close()

#  **********  WITH USE(do not use close file )

# with open('samplefile.txt','r') as f:
#        a=  f.read()
       

# with open('samplefile.txt','w') as w:
#         w.write("Ruchika is the best coder in the world")

# print(a)  # are yrr isse to apne app read write dono hi ho jayega fir kya yrr read method phele use krr lo k=uske baad likte rhhna jo lkihna hai

#  *********************** PRACTICE SET
#  1
 
# a = open('poem.txt','r')
# data =a.read()
# # a = open('poem.txt','w')
# # a.write("she is the best")
# # a.write("\nstar is twinkling")
# print(data)
# t =data.find("twinkling")
# if(0<t<100):
#         print("Twinkling word is present in the file")
# if(t==-1):
#         print("twinkling word is not present in the file")

# a.close()

#  2
# def game():
#         a=int(input("Enter your high score"))
#         return a;
# score = game()
# with open('highscore.txt','r') as f:
#         highscore =int(f.read())
# if(highscore<score):
#         with open('highscore.txt','w') as w:
#                 w.write(str(score))


#     3(majedaar ueestion hai yeeee)
# for i in range(2,21):
#         with open(f"tables/Multiplication_tables_of_{i}",'w') as f:
#                 for j in range(1,11):
#                         f.write(f"{i} X{j} = {i*j}")
#                         if(j!=10):
#                                 f.write('\n')

#   4
# f =open('vulgur.txt','r')
# data =f.read()
# f = open('vulgur.txt','w')
# f.write("you such a bloody baster \n")
# f.write("baster your mind always")

# data =data.replace("baster","####")  # abe bhuddhu usko kisi ke assign to krr
 
# print(data)

#    5
# words = ["baster","mote","kaddu","donkey"]
# with open('vulgur.txt') as f:
#         data =f.read()
# for word in words:  # are ,mtlb word to i ki tarah hai iski value phele 1 hogi mtlb words ka phele word ab samaj aya 
#         data = data.replace(word,'####')
#         with open('vulgur.txt','w') as w:
#                 w.write(data)

# print(data)

# 6
# # log file(kis tim pe kya hua , kisi tarah ki wrning hai ,message hai ya fir koi duebug message hai hai ya error message hai kya hai
# with open('log.txt') as l:
#         data = l.read()

# # n=data.find('Python')
# # if(0<n<10000):  # aishe bhi likh skta the if 'python' in data
# if 'python' in data.lower():
#         print("yes it conatain python")
# else:
#         print("No this word is not in this file")

#  7
# content = True
# i =1
# with open("log.txt") as f:
#     i+=1
#     while content:
#         print(content)

#         if 'python' in content.lower():
#             print("yes python is present ")
#         else:
#             print("No python is not present")
# #  7:58

#    8
# with open('poem.txt') as f:
#     data = f.read();
# with open('copy.txt','w') as f:
#     f.write(data)

#   9
# file1="poem.txt"
# file2="copy.txt"

# with open(file1) as f:
#    f1= f.read();
# with open(file2,) as f:
#     f2 = f.read()
# if(f1==f2):
#     print("yes these files are euals")
# else:
#     print("No these are not euals")


#   10
# with open('vulgur.txt','w') as f:
#     f.write("")

#  11
# oldname = "sample2.txt"
# newname = "renamed_by_pythin.txt"

# with open(oldname) as f:
#     data = f.read()
# with open(newname,'w') as f:
#     f.write(oldname)

# os.remove(oldname)

def man(meme):
    print("we are the best in this world bit you know one thing is that ki you are also adumbest gut in this whole world",meme)

def sum(num1 , num2):
    return num1 + num2

print("you",man("Ruchika"))
print("You",sum(2,3))