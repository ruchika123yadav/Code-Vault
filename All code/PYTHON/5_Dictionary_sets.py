mydict = {
    "Bulshit":"Bakwass",       #mene bulshit ki meaning bakswass likhi haii  
    "Ruchika":"Dhasuu coder",
    "list":"[2,3,4,5,6]",              #me iske andr ek list bhi store kra skta huu
    "anotherdic":{"hand":"hath",              #uske sath sath dusri dectionary bhi bana skta huu
                     "leg":"per"},
                     1:2
}
   #mujhe janni hai ruchika ki meaning
# print(mydict["list"])

a = {}
print(type(a))   # ye empty dictionary batata hai



# mydict["Ruchika"]= "best coder`` in the world"   #mutable haii
# print(mydict["Ruchika"]) 
# print(mydict["anotherdic"]["leg"])

#        METHODS OF DICTIONARY
#    print the keys of the dictionary
# print(mydict.keys())
# print(list(mydict.keys()))   # typcastinf bhi krr skte hai like mene ishe list me change krr diya
# print(type(mydict.keys()))

#  values
# print(mydict.values())   # ishme jo another dict ke key hai wo bhi likke ayega

# items
# print(mydict.items())    # ye hame dono key value likke de deta hai

# update
updatedict ={
    "om":"Friend",
    "dadi":"Dost",
    "Ruchika":" best Dancer" # ye value bhi update ho jayegi key or value ke add hone ke sath sath
}
# print(mydict.update(updatedict))   #ishme kyu none show krr rha haii chahe phele print  kro ya baad me hoga to ek hi baar
mydict.update(updatedict)  
print(mydict)

# get name
# print(mydict.get("Ruchikaa"))   # --> ye error throw nhi krega agr ham aisha keybhi daal de jo ki dictionary me present nhi hai
# print(mydict["Ruchikaa"])   # ye error through krega lekinn 

# ***************************************************************************
#          SETS(it deosn't conatain repetative itmes)
# ham isko index ki help se access nhi krr skte
 
a = { 1,2,3,4,4,2}
print(a)
print(type(a))  # type bhi set dikhayega

# a = {}  this is not a empty set this is a empty dictionay 

#  an empty set can be created  using the below syntax
b = set()
print(type(b))

#     METHODS OF SETS
b.add(2)
b.add(2)
b.add(5)
b.add(6)
b.add(5)
# b.add({1,2,3,4})   unhashable type:  ham iske content ko chnage krr skte hai
# b.add({4:5})       same to this also
b.add((4,3,2,5,5))  # accha to ham tuple banake ishme same value add krr skte hai
# print(b)

# len(print the length of the set or repitive numbers ko nhi ginega) or jo mene tuple banaya hai ye use ek hi manega
# print(len(b));

# remove
b.remove(2);  # remove 2 int set b
# print(b)

# pop
# print(b.pop())  # random value ko remove krr dega
# print(b)  #accha beta to ishne mera 5,6 dono ko remove krr diya

# **************************************************************
            #  practice set
#  1
# dichindi ={
#     "pankha":"fan",
#     "rasoi":"Kitchen",
#     "chalna":"walk",
#     "khana":"eat",
#     "bolna":"talk"
# }           
# print("Options are:",dichindi.keys())
# a = input("Enter the word you want to know in these keys-")
# print("The meaning of the word is:",dichindi.get(a))  # line error throw nhi kregi bhle hi wo dictionary me word na hoo

#   2
# r1 =int(input("Enter Number1"))
# r2 =int(input("Enter Number2"))
# r3= int(input("Enter Number3"))
# r4= int(input("Enter Number4"))
# r5= int(input("Enter Number5"))
# r6= int(input("Enter Number6"))
# r7= int(input("Enter Number7"))
# r8= int(input("Enter Number8"))
 
# s = {r1,r2,r3,r4,r5,r6,r7,r8}
# print(s)

#  3
s = {18,"18"}
print(s)
print(len(b))  #set' object has no attribute 'len'
# print(s.index())     #same upr wali line

# 4(set ke andr 20 and 20.0 ek hi baar liya jayegaa)
# u = set();
# u.add(20)
# u.add(20.0)
# u.add("20")
# print(u)
# print(len(u))

# 6
d = {};
a = input("Enter your favorite languauge Ruchika")
b = input("Enter your favorite languauge Shanu")
c= input("Enter your favorite languauge Pooza")
e = input("Enter your favorite languauge Shalu")
d["Ruchika"] = a
d["Shanu"] = b
d["Pooza"] = c
d["Shalu"]= e
print(d)