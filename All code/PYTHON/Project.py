import random
randNumber = random.randint(1,100)
# print(randNumber)

userGuess = None  # jab loop chalega phele tan ushe kuch kuch to dena padega naa , agr kuch nhi denge to error dikhayegaa
Guess = 0

while(userGuess!=randNumber):
    userGuess= int(input("Enter your Guess:"))
    Guess+=1

    if(userGuess==randNumber):
        print("You Guess it Right!!")
    
    else:
        if(userGuess>randNumber):
            print("You guessed it wrong! Enter a Smaller number")
        else:
            print("You Guessed it wrong! Enter a larger Number")

print(f"You guessed the number in {Guess} guesses")

with open("MaxScore.txt","r") as f:
    highScore = int(f.read())

if(Guess<highScore):
    print("You have just brken the high score!")
    with open("MaxScore.txt","w") as f:
        f.write(str(Guess))  # actually wo integer add nhi krr rha tha ishliye ushe String Banana pada