#include<string.h>
#include<stdio.h>

void name(int);
void age(int);
void ph(int);
struct employee
{
	char name[20];
	long ph;
	int age;
}a[10], temp;
int main()
{
	int i, j, n, select;
	printf("\n enter the no of records:");
	fflush(stdin);
	while (scanf_s("%d", &n) != 1){
		printf("sorry enter num only");
		scanf("%d", &n);
		fflush(stdin);
	}

	printf("enter details:");
	for (i = 0; i < n; i++)
	{

		printf("enter the age %d:", i + 1);
		fflush(stdin);
		while (scanf("%d", &a[i].age) != 1){
			printf("sorry enter num only");
			scanf("%d", &a[i].age);
			fflush(stdin);
		}
		printf("enter the phno %d:",i+1);
		fflush(stdin);
		while (scanf("%ld", &a[i].ph) != 1){
			printf("sorry enter number ");
			scanf("%ld", &a[i].ph);
			fflush(stdin);
		}
		fflush(stdin);
		printf("enter the name %d:",i+1);
		scanf("%s", &a[i].name);
		//while(scanf("%s", &a[i].name) != 1){
			//printf("enter the valid name");
			//scanf("%s", &a[i].name);
		//}
		fflush(stdin);
	}
	for (i = 0; i < n; i++)
	{
		printf("\n%d\n", a[i].age);
		printf("%ld\n", a[i].ph);
		printf("%s\n", a[i].name);
	}
	fflush(stdin);
	printf("enter the choice:");
	printf("enter the choice for sorting\n 1.age\n 2. name\n 3.ph");
	scanf_s("%d", &select);
	printf("\n n=%d\n", select);
	switch (select)
	{
	case 1:
		name(n);
		break;
	case 2:
		age(n);
		break;
	case 3:
		ph(n);
		break;
	}
	return 0;

	getch();
}
void name(int n)
{
	int i, j;
	for (i = 0; i < n ; i++)
	{
		
		for (j = i+1; j < n; j++)
		{
			
			if (strcmp(a[i].name, a[j].name)>0)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (i = 0; i < n; i++)
	{
		printf("\nrecord %d", i + 1);
		printf("\n %s", a[i].name);
		printf("\n %d", a[i].age);
		printf("\n %ld", a[i].ph);
	}
	printf("\n");
	getch();
}
void age(int n)
{
	int i, j;
	for (i = 0; i < n ; i++)
	{
		
		for (j = i+1; j < n; j++)
		{
			
			if (a[j].age>a[i].age)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (i = 0; i < n; i++)
	{
		printf("\nrecord %d", i + 1);
		printf("\n %d", a[i].age);
		printf("\n %ld", a[i].ph);
		printf("\n %s", a[i].name);
	}
	printf("\n");
}
void ph(int n)
{
	int i, j;
	for (i = 0; i < n ; i++)
	{

		for (j = i+1; j < n; j++)
		{
			
			if (a[j].ph<a[i].ph)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (i = 0; i < n; i++)
	{
		printf("\nrecord %d", i + 1);
		printf("\n %ld", a[i].ph);
		printf("\n %s", a[i].name);
		printf("\n %d", a[i].age);
	}
	printf("\n");
	getch();
}