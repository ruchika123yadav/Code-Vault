from django.shortcuts import render
from django.http import HttpResponse
from .models import ChaiVariety,Store
from .forms import chaiVarietyForms
from django.shortcuts import get_object_or_404
# Create your views here.

def all_chai(req):
    chais=ChaiVariety.objects.all()
    return render(req,'Ruchi/all_chai.html',{'chais': chais})

def order(req):
    return HttpResponse("here it is my order")

def chai_detail(req,chai_id):
    chai =get_object_or_404(ChaiVariety,pk=chai_id)
    return render(req,'Ruchi/chai_detail.html',{'chai':chai})

def forms(request):
  stores = None
  if request.method == 'POST':
    form = chaiVarietyForms(request.POST)
    # phele method bhi pata krna padta
    if form.is_valid():# ye if jab jab hamra form submit ho rha hai
      chai_variety = form.cleaned_data['chai_variety'] #ye jo ham choice provide krr rhe hai wo hai forms.py file me se
      stores = Store.objects.filter(chai_varities=chai_variety)# mujhe sirf wo chai do jha chai varity availabe ho
    #   or yha hamne sotre wala chai_vairety pass kiya hai jo mene models me banaya tha phelea wala chai_variety odelw ala dusra wo cleaned data wala
  else:
    form = chaiVarietyForms() # yha form banaya upr fi wale me form  bhara

  return render(request, 'Ruchi/chai_form.html', {'form': form, 'stores': stores})

# now find url
# *****************************************************************************
# Function Definition:

# forms(request) ek function hai jo handle karta hai jab koi user form bhar ke submit karta hai ya simply page pe aata hai. request me uska data aata hai, jaise usne form submit kiya ya nahi.
# Initial Setup:

# stores = None matlab shuru me koi stores ki list nahi hai. Baad me ye list us chai variety ke stores se fill hogi jo user ne select ki hogi.
# Form Submission Check:

# if request.method == 'POST': ye check karta hai ki user ne form submit kiya hai ya nahi. POST ka matlab hai user ne form submit kiya hai.
# Form Handling:

# form = chaiVarietyForms(request.POST) me form ko user ke submit kiye data ke saath fill kiya gaya hai.
# if form.is_valid(): ye check karta hai ki form ka data sahi hai ya nahi. Agar form valid hota hai, tabhi aage ki steps follow hongi.
# Chai Variety Handling:

# chai_variety = form.cleaned_data['chai_variety'] is line me user ki select ki gayi chai variety ko form se extract kiya gaya hai.
# Store Filtering:

# stores = Store.objects.filter(chai_varieties=chai_variety) is line me database me search kiya jaa raha hai un stores ko jo us chai variety ko offer karte hain jo user ne select ki hai.
# Else Case (Agar Form Submit Nahi Kiya):

# Agar form submit nahi kiya gaya hai (else block), to ek naya blank form chaiVarietyForms() create kiya jaata hai.
# Rendering the Template:

# Finally, render function use kiya jaata hai chai_form.html page ko show karne ke liye. Isme form aur stores ko template me pass kiya jaata hai.
# Ek simple breakdown:

# User agar form submit karta hai, to uski chai variety ke hisaab se stores search hote hain.
# Agar submit nahi karta, to ek khaali form dikhaya jaata hai.