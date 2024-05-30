#                  STRING

# a =34
# b = "Ruchika"    # me single code bhi bana skta huu
# print(a,b)
# print(type(a))    

# c ="Ruchi's"            # no confusion of single dubble or tripple code
# d = 'om"s'
# f= '''mala"r's'''
# print(c)
# print(d)
# print(f)

# # **************************  CONCATENATING OF TWO STRINGS
# name = "Ruchika yadav"
# Greeting = "Good morning"
# print(name + Greeting)
# print(name[5])   # getting the value of the character at that index
# # print(name[5]) = "sa"  acch ais immutable ki baat hoti rhti hai  you don't change string like this

# print(name[2:5])   # whi java ki trarah last wale ko nhi manege
# print(name[:5])   # is same like [0:5]
# print(name[0:])     # is same like[0:last index]
# print(name[-13:-0]) #ye minus index last wale charackter ko show krega ko jo sabse last negative number hoga wo sanse phele wale character ko show krega
name = "Ruchika"
print(name[1:6:2])  # dekh ishme ishne o se index start kiya to 1 pe u hai to woprint ho jayega uske baad ka jo character hai wo print nhi hoga uska baad ka print hoga fir uske baad ko print nhi hoga
print(name[1:6:3])   # ishme ye u ko print krega 2 ko skip krega fir i ko last print krega
# ek or cheez last 6 pe jo hai a wo bhi print nhi hoga kyuki agr ham 1:6 likhe to 6 wale ko to include hi nhi krte na

# #*************************      STRING FUNCTIONS 

story = "once upona time there is a best coder in the world whose name is Ruchika yadav"

print(len(story))   # len means length

# print(story.endswith("adav"))

# print (story.count("is"))   # ye bata hai ki ye character kitni baar occur hua hai
# print(story.capitalize())          #only phela word capatiliaze krr deta hai
print(story.find("Ruchika"))    # accha to ye batata hai konse index pe hai ye string
print(story.replace("is ","httt "))    # ye jitne bhi hai is sare is ko change krr dega or jiss wrod ko tum dalna chaa rhe ho uske end me thoda espace dedena wrna wo next word se chipak jayega nhi asmaj me aya to code chala ke dekhle

# ****************************         ESCAPE SEUENCES
# sty = "ruchi is the best\n she is also a very good person by naturewise\t and also a very humble in nature"
# sty = "ruchi is the best\n she is also\ a very good person in human nature\t and also a very humble in nature"
#  yha me \ sirf iska use nhi krr skta agr mujhe ishe print krna ho to kyui usko lagrga ki \ character hai

# print(sty)


# ************************ PRACTICE SET

# e = input("Enter your name");  print("Good afternoon\n " +e)

# 2

# name = input("Enter your name");
# date = input("please enter the name")
# letter = print(''' dear '''
# +name  +'''\nyou are selected for the Microsoft!! \n '''
# +date)

    # another to do this program #  
# lettr = ''' dear <|Name|> ,
#     You are selected for the Microsoft!!
#        Have a great day
#         date: <|date|>''' 

# name = input("Enter your name\n")
# date = input("Enter the date please")
# lettr = lettr.replace("<|Name|>",name)
# lettr = lettr.replace("<|date|>",date)
# print(lettr)

# 3
st =  "This is a  double space" 
doublespace = st.find("  ")  # ye string thi to ishe to change krr nhi skte the to isko kisi or string me assign krwake hi krna padega
print(doublespace)
singlespace = st.replace("  " ," ")
print(singlespace)
stt = " Ruchika    "   # ye ek hi character ke liye hi work krega like st me use kroge to nhi kaam krega
print(stt.strip())    

#  5
write ="Dear Ruchika yadav,\n This python course is best for you \n Thanks!!"
print(write)