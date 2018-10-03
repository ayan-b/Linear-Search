import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * Implements the linear search algorithm in Java.
 * Created on 2018/09/30 by Craxy.
 *
 * @author Craxy
 * @version 1.1
 */
public class LinearSearch {

    /**
     * The entry point for the program.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        System.out.println("How many number are you going to enter? ");
        Random rand = new Random()
        //Create the scanner instance and the array of numbers
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for(int x=0; x<len; x++){
            array[x] = rand.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter a number to search for");
        int find = scanner.nextInt();
        //Linear search
        boolean found = false;
        for(int x=0; x<len; x++){
            if(array[x]==find){
                found = true;
                System.out.println("Found at index: "+x);
            }
        }
        if(!found){
            System.out.println("Not found");
        }
        //Close the scanner
        scanner.close();
    }
}
