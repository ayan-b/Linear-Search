import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This is an implementation of the linear search algorithm.
 * @author Ryan Smolik
 *
 */
public class LinearSearch {
	
	/**
	 * Linear search implementation.
	 * @param arr the array to be searched.
	 * @param target the target being looked for in the array.
	 * @return the index at which the target was first found or -1 if not found.
	 */
	public static int linearSearch(int[] arr, int target) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("How many numbers would you like in your list?");
		Scanner in = new Scanner(System.in);
		
		Random random = new Random();
		int n = in.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = random.nextInt(n + 1);
		}
		System.out.println("An array of size " + n + " has been created.");
		System.out.println("What number should be searched for int the list?");
		
		int target = in.nextInt();
		in.close();
		
		int index = linearSearch(array, target);
		if(index == -1) {
			System.out.println("Your number is not in the list.");
		} else {
			System.out.println("Your number was found at index: " + index);
		}
		
		System.out.println("The list was: " + Arrays.toString(array));
	}

}
