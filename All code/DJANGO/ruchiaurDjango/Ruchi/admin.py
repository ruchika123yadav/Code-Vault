from django.contrib import admin
from .models import ChaiVariety,chaiReview ,Store,chaiCertificate

# Register your models here.
 
class chaiReviewInline(admin.TabularInline):
    model=chaiReview
    extra=2

class chaiVarietyAdmin(admin.ModelAdmin):
    list_display=('name','type','date_added')
    inlines=[chaiReviewInline]

class StoreAdmin(admin.ModelAdmin):
    list_display=('name','location',)
    filter_horizontal=('chai_varities',)


class chaiCertificateAdmin(admin.ModelAdmin):
    list_display=('chai','certificate_number')


admin.site.register(ChaiVariety,chaiVarietyAdmin)
admin.site.register(Store,StoreAdmin)
admin.site.register(chaiCertificate,chaiCertificateAdmin)




 