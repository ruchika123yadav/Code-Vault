m = int(input("Enter the Number"))
prime = True
for i in range(2,num):
    if(num%i==0):
        prime=False;
if prime:
    print(num,"is the prime number")
else:
    print(num,"is not a prime number")
