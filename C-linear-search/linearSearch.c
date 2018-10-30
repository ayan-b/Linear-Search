#include <stdio.h>
#include <conio.h>

int main()
{
  int array[100], search, c, n;

  printf("Enter the number of elements in array\n");
  scanf("%d", &n); /* Taking input for no of elements in array*/

  printf("Enter %d integer(s) :\n", n);

  for (c = 0; c < n; c++)
    scanf("%d", &array[c]); /* Taking input for values of array at each index*/

  printf("Enter a number to search\n");
  scanf("%d", &search); /* Taking input for element to search*/

  for (c = 0; c < n; c++)
  {
    if (array[c] == search)    /* If element is found */
    {
      printf("%d is found at location %d.\n", search, c+1);
      break;
    }
  }
  if (c == n)
    printf("%d isn't found in the array.\n", search);

  return 0;
}
