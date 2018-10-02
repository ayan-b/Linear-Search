

import java.util.*;

import java.lang.*;

import java.io.*; 

class Codechef
{
 
    static int search(int arr[], int n, int x) 
  
              { 
        for (int i = 0; i < n; i++)
                
        { 
            if (arr[i] == x) 
            
                                       return i; 
        
                         } 
        return -1; 
    } 

     public static void main (String[] args) throws java.lang.Exception

              {
	 
                         Scanner sc=new Scanner(System.in);
      
                         System.out.println("Enter array length");
   
                         int n=sc.nextInt();
    	
                         System.out.println("Enter array Elements");
   
                         int i=0;
                         int a[]=new int[n];
   
  	       for(  ;i<n;i++)
     
                         a[i]=sc.nextInt();
    
                         System.out.println("Enter number to be searched");
   
                         int x=sc.nextInt();
   
                         int d=search(a,n,x);
   
                         if(d!=-1)
  
                                      System.out.println("Found on index "+d);
 
                        else
                                      System.out.println("Not Found");
	
                   } 

}
