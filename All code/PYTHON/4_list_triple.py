# a = [1,2,3,4,5]  # its like a array list yrr
# print(a) 
# a[0]=45;  # aur ham aishe likke value change bhi krr skte hai
# print(a)
# print(a[3])    # aur aishe ham kisi bhi index pe koi bhi value ko access krr skte hai

# # we can create a list with items of different types
# c = [ "Ruchika yadav",23,45.2,True]
# print(c)

# # *******list Sliccing
friends = ["Gadpatti bappa","Bhoomi","Saumya","Varsha","Anam"]
# print(friends[0:4])
# print(friends[-5:])  # indexing bappa se start kro
print(friends[:3])  # to mtlb iska o se strt kro or 3 tak jayoo

# # ******** LIST METHOD
# l1 = [1,6,4,8,2,0,3]
# l1_sorted = l1.sort();
# # print(l1_sorted) -> ab dekho ish jagan none dikhayega bilkul java array list ki trah socho ye pure l1 ko hi change krr dega to ham sirf likke bhi o/p paa skte haii
# print(l1)  #juat like java array  ye l1 ko hi sort krr deta hai

# #  reverse
# l1.reverse();
# print(l1);  #dekh rhe ho ki sort list me hi reverse hua hai original wale me nhii

# # append
# l1.append(45);
# print(l1);

# # insert
# l1.insert(5,44)
# print(l1)

# # pop(are ishme pop mtlb ki jo pop ke andr likhoge ush index pe value hatt jayegoii)
# l1.pop(5);
# print(l1);

# # remove
# l1.remove(0);
# print(l1)

# # entend
# # l1.extend(2);  i don't know what is this, search it when you are free
# # print(l1)

# # *******************************
# #               TUPLES(you can't update tuple )
r =(1,4,3,2,5)
print(r)
r[2]=45;
print(r)

# # t = ();
# # print(t)

# t = (1);
# print(t)  # are yrr bhaiya print ho to rha hai
# t = (1,);  # lekin bhaiya ne bola aishe 1 digit likhe ke baad , lagaoge tab mana jayeg tuple
# print(t);


# #  METHODS OF TUPLE
u = (1,3,5,6,2,4,3)
print(u.count(3))    # ye count krthai hai digits ko

# # index
# print(u.index(4))  # ye bata hai ki ye didgit konse index pe hai naki ye ush index pe uski value batayega

#######################        PRACTICE SET
#  dekha bhot shi example hai yee ye + nhi krr rha in do number ko wo string hai to undono ko bss jod de rha hai unko + krwane le liye intparsent lagana hoga
# y = int(input("enter the value of y"))
# print(type(y));
# u = int(input("Enter the value of u"))
# # u = int(u)
# v = y+u;
# print(v)

# 1
# f1= input("Enter Fruit Number 1")
# f2= input("Enter Fruit Number 2")
# f3= input("Enter Fruit Number 3")
# f4= input("Enter Fruit Number 4")
# f5= input("Enter Fruit Number 5")
# f6= input("Enter Fruit Number 6")
# f7= input("Enter Fruit Number 7")
# MyFruitList = [f1,f2,f3,f4,f5,f6,f7]
# print(MyFruitList)

#  2
# s1 = int(input("Enter the marks of the student 1:"))
# s2 = int(input("Enter the marks of the student 2:"))
# s3 = int(input("Enter the marks of the student 3:"))

# s4 = int(input("Enter the marks of the student 4:"))
# s5 = int(input("Enter the marks of the student 5:"))
# s6 = int(input("Enter the marks of the student 6:"))
# student = [s1,s2,s3,s4,s5,s6]
# student.sort();
# print(student)

#   3
# t = (1,2,3,4,5)
# t[2] = 45;    object does not support item assignment
# print(t)

#  4
n= [23,45,56,78]
# n.pop(2)
# print(n)
print(n[0]+n[1]+n[2]+n[3])
print(sum(n))


#  5
a = (7,0,8,0,0,9)
print(a.count(0))
print(a)