from django.http import HttpResponse
from django.shortcuts import render

def home(request):
    return HttpResponse("Hello world,It's me Ruchika Yadav")

def about(request):
    # return HttpResponse("What you want to know about myself")
    return render(request,'website/index.html')

def contact(request):
    return  render(request,'website/see.html')


    # piping-->{{ name|upper }}
 
#  superuserpassword --> Ruchi@123