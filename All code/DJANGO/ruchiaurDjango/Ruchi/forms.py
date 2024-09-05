from django import forms
from .models import ChaiVariety

class chaiVarietyForms(forms.Form):
    # ab forms me hamre pass kya hota hai ki ham forms ko existing model se link krr skte mtlb unke ke liye hame khud se dubara model ki tarah cheeze show karane ki jarurt nhii
    chai_variety=forms.ModelChoiceField(
        queryset=ChaiVariety.objects.all(),label="Select chai variety"
        # ab ishme kya hai hamne liya hai choice field to ye kya krega apne aap choice field wala lake hi hame de dega hame dropdown lagane ki koi jarurt nhi padti
    )