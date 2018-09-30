import java.util.Scanner;

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

        //Create the scanner instance and the array of numbers
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        System.out.println("Enter the numbers and press enter after each line: ");

        //Fill the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the target: ");

        //Use the linear search algorithm to find the index of the target in the array
        int indexOfTarget = linearSearch(numbers, scanner.nextInt());

        //Ouput the result
        if (indexOfTarget >= 0) {
            System.out.println("Successful Search! The index of your target is: " + indexOfTarget);
        } else {
            System.out.println("The array of numbers does not contain your desired number!");
        }

        //Close the scanner
        scanner.close();
    }

    /**
     * Implements the linear search algorithm.
     *
     * @param numbers the array of numbers to search.
     * @param target  the number to look for.
     * @return the index of the number in the array, if the array contains the given number, otherwise -1.
     */
    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}