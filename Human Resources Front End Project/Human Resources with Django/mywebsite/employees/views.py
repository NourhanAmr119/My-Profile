from unicodedata import name
from django.http import HttpResponse
from django.shortcuts import render
from .models import Login
from .models import Employee

# Create your views here.
def index(request):
    if request.method=='POST':
         id = request.POST.get('id')
         name = request.POST.get('Name')
         email = request.POST.get('Email')
         address = request.POST.get('Address')
         phonenumber = request.POST.get('PhoneNumber')
         Gender= request.POST.get('gender')
         martual = request.POST.get('Martual')
         noav = request.POST.get('availableVacation')
         noaa = request.POST.get('approvedvacation')
         salary = request.POST.get('salary')
         date = request.POST.get('Date')
         data = Login(id=id, name=name, Email=email, Address=address, PhoneNumber=phonenumber, Gender=Gender,Martual_status=martual,
                NumberOfAvailableVacationDays=noav, NumberOfActualApprovedVacationDays=noaa, Salary=salary, dateOfBirth=date)
         data.save()
    return render(request,'pages/index.html')
def home(request):
    return render(request,'vacation/home.html') 

def form(request):
    return render(request,'vacation/VacationForm.html' , {'emp':Employee.objects.get(name="ahmed")}) 

def user(request):
    return render(request,'vacation/user.html') 
def edit(request):
    return render(request,'vacation/EditPage.html') 

def vacation(request):
    return render(request,'vacation/VacationSearch.html') 
def new(request):
    return render(request,'vacation/AddNewUser.html') 
def search(request):
    return render(request,'vacation/searchphase.html') 
def Newhomepage(request):
    return render(request,'vacation/Newhomepage.html')    

def TableSearch(request):
    return render(request, 'vacation/tableSearch.html')
def table(request):
    if request.method == 'GET':
        query = request.GET.get('empName')
        try:
            emps = Employee.objects.filter(name__contains=query)
            return render(request, 'vacation/table.html', {"emps": emps})
        except:
            return render(request, 'vacation/table.html', {"emps": []})
    else:
        return render(request, 'vacation/table.html', {})

