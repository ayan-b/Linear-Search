//Linear search 
//~By Ankush Singh (https://github.com/shad0w1947)~

import java.util.*;
public class linearsearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of element");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		int x;
		System.out.println("enter element to be search");
		x=s.nextInt();
		
		boolean check=true;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x) {
				System.out.println(x+" is found at index "+i);
				check=false;
				break;
			}
				
		}
			if(check)
				System.out.println(x+" is not found in array");

	}

}
