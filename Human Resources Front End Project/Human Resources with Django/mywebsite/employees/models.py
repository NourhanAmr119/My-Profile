from django.db import models

# Create your models here.

class Employee(models.Model):
    name = models.CharField(max_length=25)
    id = models.CharField(max_length=10,primary_key=True)
    salary = models.DecimalField(max_digits=6,decimal_places=2)
    email =models.EmailField(max_length=25)
    address = models.CharField(max_length=50)
    phone = models.CharField(max_length=11)
    available_vacation = models.IntegerField()
    acual_approved_vacation= models.IntegerField()
    date_of_birth = models.DateField()

class Login(models.Model):
    id = models.CharField(max_length=10, primary_key=True)
    name = models.CharField(max_length=25, null=True)
    Email = models.CharField(max_length=50, null=True)
    Gender = models.CharField(max_length=6,null=True)
    Address = models.CharField(max_length=25,null=True)
    Martual_status = models.CharField(max_length=50,null=True)
    NumberOfAvailableVacationDays = models.CharField(max_length=10,null=True)
    dateOfBirth = models.DateField(null=True)
    PhoneNumber = models.CharField(max_length=11, null=True)
    Salary = models.CharField(max_length=10, null=True)
    NumberOfActualApprovedVacationDays = models.CharField( max_length=10,null=True)

class Empl(models.Model):
    name = models.CharField(max_length=50)
    emp_id = models.IntegerField(null= False, default=0)
    def __str__(self):
        return self.name
