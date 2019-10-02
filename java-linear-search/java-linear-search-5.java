import java.util.Scanner;



class LinearSearch{
    int linearSearch(int arr[], int searchNumber){
        int len = arr.length;
        int found = 0; //Assuming that the number doesn't exist
        for(int i =0;i<len;i++){
            if(arr[i] == searchNumber){
                //If found then break
                found = 1;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        //Inputting time inputing numbers: 
        System.out.println("Enter Number of elements: ");
        int n = sc.nextInt();

        //Creating an array to store the numbers
        int arr[] = new int[n];

        //Loop to take the input
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        //Inputing the number to be searched
        System.out.println("Enter number to be searched: ");
        int searchNumber = sc.nextInt();

        //calling a function to perform linear search
        LinearSearch linear = new LinearSearch();
        int found = linear.linearSearch(arr, searchNumber);
        if(found == 1) System.out.println("Number Found!");
        else System.out.println("Number Not Found!");
    }
}