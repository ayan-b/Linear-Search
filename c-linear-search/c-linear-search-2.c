#include<stdio.h>

int main()
{
	int arr[100], i, num, n, c=0, pos; // declaration of array and variables needed
	printf("Enter the array size : ");
	scanf("%d", &n);
	printf("Enter the Array Elements : ");
	for(i=0; i<n; i++) // input of array elements
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the number to be searched: ");
	scanf("%d", &num);
	for(i=0; i<n; i++)
	{
		if(arr[i]==num) //to check given number with each number in the array
		{
			c=1;	//a flagging variable, to check if number has been found
			pos=i+1;
			break;
		}
	}
	if(c==0) //if no occurences of the number are present
	{
		printf("Number cannot be found..!!");
	}
	else
	{
		printf("%d found at the position %d", num, pos);
	}
	
	return 0;
}
