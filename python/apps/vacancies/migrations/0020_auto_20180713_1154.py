# Generated by Django 2.0.6 on 2018-07-13 05:54

from django.db import migrations, models


class Migration(migrations.Migration):
    dependencies = [
        ('vacancies', '0019_auto_20180710_1741'),
    ]

    operations = [
        migrations.AlterField(
            model_name='publication',
            name='diesel_url',
            field=models.URLField(null=True),
        ),
    ]
