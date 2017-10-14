import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
	
	public static int lsearch (ArrayList<Integer> numbers, int target) {
		int index = 0;
		for (int num : numbers) {
			if (num == target) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("How many number are you going to enter? ");
		int n = scan.nextInt();
		System.out.println("Enter the list of numbers: ");
		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			numbers.add(num);
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		int foundedIndex = lsearch(numbers, target);
		if (foundedIndex > -1)
			System.out.println("Element found on index " + foundedIndex);
		else
			System.out.println("Element not found!");
		scan.close();
	}
}
