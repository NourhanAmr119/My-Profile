""" from xml.etree.ElementInclude import include
from django.contrib import admin """
from django.urls import path, include
from . import views

urlpatterns = [
    path('',views.home,name='home'),
    path('Newhomepage.html',views.Newhomepage,name='Newhomepage'),
    path('VacatoinForm.html',views.form,name='form'),
    path('user.html',views.user,name='user'),
    path('EditPage.html',views.edit,name='user'),
    path('VacationSearch.html',views.vacation,name='vacation'),
    path('AddNewUser.html',views.new,name='new'),
    path('searchphase.html',views.search,name='search'),
    path('Newhomepage.html',views.Newhomepage,name='newhome'),
    path('TableSearch', views.TableSearch, name = 'TableSearch'),
    path('table', views.table, name = 'table'),
]