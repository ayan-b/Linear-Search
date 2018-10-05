#include<stdio.h>

int main()
{
	int arr[100], i, num, n;
	printf("Enter the array size : ");
	scanf("%d", &n);
	printf("Enter the Array Elements : ");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the number to be searched: ");
	scanf("%d", &num);
	for(i=0; i<n; i++)
	{
		if(arr[i]==num)
		{
			printf("%d found at the position %d", num, i+1);
			return 0;
		}
	}

	printf("Number cannot be found..!!");
	return 0;
}
