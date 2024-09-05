from django.http import HttpResponse
from django.shortcuts import render

def home(request):
    return HttpResponse("Hello world,It's me Ruchika Yadav")

def about(request):
    # return HttpResponse("ll you want to know about myself")
    return render(request,'website/index.html')

def contact(request):
    return  render(request,'website/see.html')

def name(req):
    return render(req,'website/name.html')

    # piping-->{{ name|upper }}
 
 