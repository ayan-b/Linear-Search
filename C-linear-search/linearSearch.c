//C program to implement linear search in an array
#include <stdio.h>
#include <conio.h>        /* Adding clrscr() and getch() */

int main()
{
  int array[100], search, c, n;
  clrscr();

  printf("Enter the number of elements in array (max 100) : \n");
  scanf("%d", &n); /* Taking input for no of elements in array*/

  printf("Enter %d integer(s) :\n", n);

  for (c = 0; c < n; c++)
    scanf("%d", &array[c]); /* Taking input for values of array at each index*/

  printf("Enter the element to be searched :\n");
  scanf("%d", &search); /* Taking input for element to be searched*/

  for (c = 0; c < n; c++)
  {
    if (array[c] == search)    /* If element is found */
    {
      printf("%d is found at index %d and location %d.\n", search, c, c+1);
      break;
    }
  }
  if (c == n)
    printf("%d isn't found in the array.\n", search);

  getch();
  return 0;
}
