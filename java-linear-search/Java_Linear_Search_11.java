package LinearSearch;

import java.util.Scanner;

public class Java_Linear_Search_11 {
    /**
     *
     * @param numToFind is the number that we have to find in the Array
     * @param arrayOfIntegers is the array of integers entered by the user
     * @return if the number is not found in the array we return -1
     *          which is also the default value
     *          else we return 1
     */
    private static final int linearSearch(int numToFind, int[] arrayOfIntegers){
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] == numToFind){
                return (i + 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        //declaring vars to measure time elapsed
        long endTime, timeElapsed, startTime;
        startTime = System.nanoTime();

        //declaring required Integer Variables
        int arrayLength = 0;
        int numToFind = 0;

        //initializing Scanner Class
        Scanner scanner = new Scanner(System.in);

        // input number of elements in the array
        System.out.println("Enter the number of Integers in array >");
        arrayLength = scanner.nextInt();

        //declaring array with the num of elements
        int[]  arrayOfIntegers = new int[arrayLength];

        //getting array elements from the user
        System.out.println("Enter array of Integers > ");
        for (int i = 0; i < arrayLength; i++){
            System.out.println("Enter element " + (i +1));
            arrayOfIntegers[i] = scanner.nextInt();
        }

        //getting number to find
        System.out.println("Enter number to find > ");
        numToFind = scanner.nextInt();

        int numPresentInArrayAt = -1;
        numPresentInArrayAt = linearSearch(numToFind, arrayOfIntegers);

        if (numPresentInArrayAt == -1){
            System.out.println(numToFind + " is not found in the entered array...");
        }else {
            System.out.println(numToFind + " is present at position " + numPresentInArrayAt);
        }

        scanner.close();
        endTime = System.nanoTime();

        //calculating time elapsed
        timeElapsed = endTime - startTime;
        System.out.println("Time elapsed in nanoSeconds is " + timeElapsed);
    }
}
