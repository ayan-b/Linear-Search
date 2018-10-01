#include<stdio.h>
int main()
{
    int n,i,x,flag=0;                       
    int a[100100]; 
    printf("Enter the size of array\n");
    scanf("%d",&n);            //how many numbers in which you want to search
    printf("\nEnter the elements from which you want to search\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);     //Taking input from user 
    } 
    
    printf("Enter the number to be searched\n");
    scanf("%d",&x);            // Number which we want to search
    for(i=0;i<n;i++) //Looping over to the whole array!
    {
        if(a[i]==x)
            {
                flag=1;        //If number is found then set the flag
            }
    }    
    if(flag==1)
        printf("Found the Number\n");      //If number is found then print yes.
    else
        printf("The Number was NOT found\n");       // If number is not there then print no.
return 0;
}
