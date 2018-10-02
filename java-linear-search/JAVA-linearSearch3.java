import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class LinearSearch
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the no. of input integers:");
      int n=in.nextInt();
       int arr[] = new int[n];
      
       
       System.out.println("Enter Array Elements : ");
	    for(int i=0; i<n; i++)
       {
           arr[i] = in.nextInt();
       }
       
	    System.out.print("Enter the Number to be Searched...");
       int num = in.nextInt();
	     int c=0;
       int pos=-1;
       for(int i=0; i<n; i++)
       {
           if(arr[i] == num)
           {
               c = 1;
               pos = i+1;
               
           }
           if(c==1)
           break;
       }
       if(c == 0)
       {
           System.out.print("Number Not Found..!!");
       }
       else
       {
           System.out.print(num+ " found at position " + pos);
       }
   }
}
