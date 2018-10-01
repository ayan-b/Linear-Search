/**
 * @author Andrew Joshua Loria
 * @version October 1, 2018
 */
public class LinearSearch {

    /**
     * The main method of the program.
     * This contains a specific case of hardcoded values.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
       int [] theArray = {1,2,3,4,5,6}; // an arbitrary array of numbers
       int theNum = 5; // value to search for 
       System.out.println("Output is: " + doLinearSearch(theArray, theNum));
    }

    /**
     * This method contains the linear search algorithm.
     *
     * @param arr the array of numbers to search.
     * @param target  the number to look for.
     * @return if number present in array, its index is returned. If not, return -1.
     */
    private static int doLinearSearch(int arr[], int target) { 
        int value = -1; //return value initialized to not found
        for (int index = 0; index < arr.length; index++) {
          if (arr[index] == target){
            value = index; 
          }
        }
        return value;
     } 
    
}
