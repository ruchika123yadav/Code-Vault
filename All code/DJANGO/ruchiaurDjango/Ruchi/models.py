from django.db import models
from django.utils import timezone
from django.contrib.auth.models import User

# Create your models here.

class ChaiVariety(models.Model):
    CHAI_TYPE_CHOICE=[
        ('ML','Masala'),
        ('GI',"ginger"),
        ('KI','kiwi'),
        ('PL','plain'),
        ('EL',"elaichi")

    ]
    name=models.CharField(max_length=100)
    # images me hame ek 3 party pluhin bhi lana padta haii
    image=models.ImageField(upload_to='Ruchii/')
    date_added= models.DateTimeField(default =timezone.now)
    type=models.CharField(max_length=2 ,choices=CHAI_TYPE_CHOICE)
    Desciption=models.TextField(default=" ")

    def __str__(self):
       return self.name # ye ham jo bhi name denge chai ko wo show kareyega ka kuch hame show krna ho wo show krega 


# ek magic method hai jo Python me kisi object ka human-readable (yaani string) representation return karne ke liye use hota hai.
 
#  *****ONE TO MANY********

class chaiReview(models.Model):
    # ISHME HAMRE JO reviews honge wo ksis chai se associated hi honge
    # foreign key me batana hoga ki kis model se baat krr rhe hmae ye bhi attach nhi krna padta kis field ke sath attach krr rhe
    chai=models.ForeignKey(ChaiVariety,on_delete=models.CASCADE,related_name='reviews')
    # The CASCADE option is used to automatically delete related objects when the referenced object is deleted.
    user=models.ForeignKey(User,on_delete=models.CASCADE)
    rating = models.IntegerField()
    comment=models.TextField()
    date_addedd=models.DateTimeField(default=timezone.now)
#     DUNDER STRING
    def __str__(self):
        return f'{self.user.username} review for {self.chai.name}'


# *********MANY TO MANY*******

class Store(models.Model):
    name=models.CharField(max_length=100)
    location=models.CharField(max_length=100)
    # ishem sotore to chai variety hi present karayenge
    chai_varities=models.ManyToManyField(ChaiVariety,related_name='stores')
    # related_name wo hota hai ki dusre table me kis naam se jana jaou

    def __str__(self):
        return self.name
    
    # *******ONE TO ONE*******
    
class chaiCertificate(models.Model):
    # ek certificate ek hi chai ko milega
    chai=models.OneToOneField(ChaiVariety,on_delete=models.CASCADE,related_name="certificate")
    certificate_number=models.CharField(max_length=100)
    issue_date=models.DateTimeField(default=timezone.now)
    
    def __str__(self):
        return f'Certificzte for {self.chai}'

