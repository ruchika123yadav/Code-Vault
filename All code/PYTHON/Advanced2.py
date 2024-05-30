
# import flask
# import pandas as pd
#  ye mera system interpreter use krr rha haii abhii
#  lekin mene abhi apna virtula environment banaya
# myprojectenv ke naam se
#  pip freeze command  agr kroge to sare jitne bhi module install hai show ho jayenge


# ************************************
#    LAMDA FUNCTIONS
# def func(a):
#     return a+5

# lamda function
# func = lambda a: a +5
# add = lambda a,b,c : a+b+c
# mul = lambda a,b: a*b

# x = func(54)
# print(x)
# print(add(2,4,6))
# print(mul(4,5))
# ********************

#    JOIN METHOD
# l = ["Camera "," laptop "," Ipad "," Hard Disk "," Virtual Glasses "]

# sentnece = "and".join(l)  # are bhuddhu wha gap dene ki jagah
# #  join ka mtlb ye hai ki jo bhi cheez me join se phele likhunga ow comma ki jagah replace ho jayega list me
# print(sentnece)
# print("My name is",sentnece,"ya ia am cool")
# # ye lo fstring ka kaam mene ishe bhi krr diyaa

# ***********    FORMAT METHOD
# name = "Ruchika Yadav"
# channel = 'Miraco'
# type = "Coding"
# a = "This is {} and her channel is {}".format(name,channel)
# print(a)
# t = "this is {1} and her {2} channel is {0}".format(name,channel,type)
# #  ab yha indexing ke according print hoga
# print(t)

# ************** MAP,FILTER AND REDUCE
def double(num):
    return num * num


l = [1, 2, 3, 4]
for i in l:
    print(double(i))
#  or agr ishe bhi list me hi lana hai to ye
l2 = []
for i in l:
    l2.append(double(i))

print(l2)
#  **** map
print(list(map(double, l))) # hamne kya kiya map kiya double ko l list me uske baad ek ek krr ke sare l list ke item ka method ke according process hota rha or wo ushi list l list me aa gyee

# *****list


def greater_than_5(num):
    if num > 5:
        return True
    else:
        return False

g10 = lambda num: num>18
l = [2, 3, 4, 5, 6, 89, 90, 46, 23,]
print(list(filter(greater_than_5,l)))  # ye sirf filter krta hai values ko jis hossab se hamne condition lagayi hoti haii
print(list(filter(g10,l)))

# reduce
from functools import reduce

sum = lambda a,b :a+b
l=[1,2,3,4,5]
val = reduce(sum,l)  # ishne kya kiya jitna mujhe samaj aya ki jitni bhi values thi unka methos ke according values ko jod jod ke reduce krke ek value me convert krr diya  
# val = filter(sum,l)  in dono se tto ye kaam hone nhi wala
# val = map(sum,l)  
print(val)