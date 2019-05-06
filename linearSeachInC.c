#include <stdio.h>

int main()
{
      int n, i, num, found = 0,times;

      scanf("%d",&n);           //enter the no. of elements to search from

      int *arr = (int *)malloc(n * sizeof(int));  //dynamically allocating space to the array

      for(i = 0; i < n; i++)
      {
            scanf("%d",&arr[i]);        //enter the elments into the array
      }
      
      scanf("%d",&times);       //how many times do you want to search
      
      while(times--)        //looping 
      {
            scanf("%d",&num);       //which element do you want to search for
            
            for(i = 0; i < n; i++)
            {
                if(arr[i] == num)
                {
                    found = 1;      //flag of being found or not (1 -> found and 0 -> not found)
                    break;          //no need to check more, if found
                }
            }
            
            if(found)
            {
                printf("Found\n");      //printing the results
            }
            
            else
            {
                printf("Not Found\n");
            }
      }
