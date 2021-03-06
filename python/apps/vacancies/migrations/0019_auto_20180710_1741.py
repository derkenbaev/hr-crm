# Generated by Django 2.0.6 on 2018-07-10 11:41

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('vacancies', '0018_auto_20180710_1718'),
    ]

    operations = [
        migrations.AlterField(
            model_name='vacancy',
            name='working_hours',
            field=models.CharField(choices=[('FULL_TIME', 'Полный рабочий день'), ('PART_TIME', 'Гибкий график'), ('REMOTE_JOB', 'Удаленная работа')], default='FULL_TIME', max_length=10),
        ),
    ]
