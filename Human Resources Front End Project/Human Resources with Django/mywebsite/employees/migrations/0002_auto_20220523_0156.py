# Generated by Django 3.2.13 on 2022-05-22 23:56

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('employees', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Employee',
            fields=[
                ('name', models.CharField(max_length=25)),
                ('id', models.CharField(max_length=10, primary_key=True, serialize=False)),
                ('salary', models.DecimalField(decimal_places=2, max_digits=6)),
                ('email', models.EmailField(max_length=25)),
                ('address', models.CharField(max_length=50)),
                ('phone', models.CharField(max_length=11)),
                ('available_vacation', models.IntegerField()),
                ('acual_approved_vacation', models.IntegerField()),
                ('date_of_birth', models.DateField()),
            ],
        ),
        migrations.DeleteModel(
            name='Student',
        ),
    ]
