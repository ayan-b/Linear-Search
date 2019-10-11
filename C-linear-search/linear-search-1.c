#include<stdio.h> 
int ls(int arr[], int l, int r, int x) 
{ 
	if (r < l) 
	{
		return -1; 
	}
	if (arr[l] == x)
	{
		return l; 

	} 
	if (arr[r] == x)
	{
		return r;
	} 
	else 
	{
		return ls(arr, l+1, r-1, x);	
	}	 
	 
} 

int main() 
{ 
	int n;
	// int arr[] = {12, 34, 54, 2, 3}; 
	printf("Enter the size of array\n");
	scanf("%d",&n);
	int arr[n];
	// scanf("%d",&n);
	printf("Enter the element in the array\n");
	for(int i=0;i<n;i++)
	{
		
		scanf("%d",&arr[i]);
	}
	int len = sizeof(arr)/sizeof(arr[0]); 
	printf("Enter the no.");
	int x ;
	scanf("%d",&x);
	int index = ls(arr, 0, len-1, x); 
	if (index != -1) 
	{
		printf("Element %d is present at index %d", x, index); 
	}
	else
	{
		printf("Element %d is not present", x); 
	}
	
	return 0; 
} 

