from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

def all_chai(req):
    return render(req,'Ruchi/all_chai.html')

def order(req):
    return HttpResponse("here it is my order")

# now find url