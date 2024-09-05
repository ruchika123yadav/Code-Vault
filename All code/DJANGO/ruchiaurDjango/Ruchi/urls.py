from django.urls import path
from . import views 
 
urlpatterns = [
     path('',views.all_chai,name='all_home'),
     path('order/',views.order,name='order'),
     path('<int:chai_id>',views.chai_detail,name='chai_detail'),
     path('forms/',views.forms,name='forms'),
    
] 
