#include<stdio.h>

int main()
{
		int size;int k;int key;int j;int flag;
		printf("Input the size of the array:\n");
		scanf("%d",&size);
		int arr[size];
		printf("Input the elements of the array:\n");
		for(k=0;k<size;k++)
		{
			printf("Enter %1d number: ",k+1);
			scanf(" %2d",&arr[k]);
		}
		printf("Enter the number to search:");
		scanf("%d",&key);
		for(j=0;j<size;j++)
		{
			if(key==arr[j])
			{
				printf("Number found to be at location %d\n",j+1);
				flag = 1;
			}
		}
		if(flag==0)
		{
			printf("Number not present in the array");
		}
		return 0;
}
