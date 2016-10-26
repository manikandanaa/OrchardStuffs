#include<stdio.h>
#include"stdafx.h"
void main(){
	int n,i,j,select;
	struct details{
		int age;
		int phno;
		String name;
	}d[100];
	details temp;
	printf("enter the num of records");
	scanf_s("%d", n);
	for (i = 0; i < n; i++){
		printf("enter the age");
		scanf("%d",& d.age[i]);
		printf("enter the phno");
		scanf("%d",& d.phno[i]);
		printf("enter the name");
		scanf("%s",& d.name[i]);
	}
	printf("enter the choice for sorting 1.age 2. name 3.phno");
	scanf("%d", select);
	if (select == 1)
	{
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				if (d.age[j]>d.age[j + 1])
				{
					temp = d[j+1];
					d[j + 1] = d[j];
					d[j] = temp;
				}
			}
		}
	}
	else if (select == 2)
	{
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				if (strcmp(d[j], d[j+1]))
				{
					temp = d[j + 1];
					d[j + 1] = d[j];
					d[j] = temp;
				}
			}
		}
	else if (select == 3)
	{
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				if (d.phno[j]>d.phno[j + 1]))
				{
					temp = d[j + 1];
					d[j + 1] = d[j];
					d[j] = temp;
				}
			}
		}
	else
		printf("sorry invalid choice");
	}
}