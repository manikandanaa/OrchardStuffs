#include<string.h>
#include<stdlib.h>
#include<stdio.h>

main()
{
struct employee
{
	char name[20];
	long ph;
	int age;
}a[10];
int n,i;
do{
	printf("enter the number od details:");
	scanf("%d" &n);
} while (n <= 0);
for (i = 0; i < n; i++)
{
	printf("\n enter the name:");
}

	void sort(struct employee a[], int n)
	{
		int i, j, k;
		struct employee t;
		for (i = 1; i<n; i++)
		{
			for (j = 0; j<n; j++)
			{
				if (strcmp(a[j].name, a[i].name)>0)
				{
					t = a[j];
					a[j] = a[i];
					for (k = i; k>j; k--)
						a[k] = a[k - 1];

					a[k + 1] = t;
				}
			}
		}
	}
	void input(struct employee[], int n)
	{
		int i;
		for (i = 0; i<n; i++)
		{
			printf("\n enter the name");
			gets_s(a[i].name);
			printf("\n enter the telephone no:");
			scanf_s("%ld ", &a[i].ph);
			printf("\n enter the age:");
			scanf_s("%d", &a[i].age);
			sort(a, i);
		}
	}
	void print(struct employee a[], int n)
	{
		int i;
		printf("\n details of employee sorted::");
		for (i = 0; i<n; i++)
		{
			printf("\n NAME=%s", a[i].name);
			printf("\n TELEPHONE NO:%ld", a[i].ph);
			printf("\n AGE:%d", a[i].age);
		}
	}
}