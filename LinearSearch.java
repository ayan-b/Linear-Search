import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		System.out.println("How many number are you going to enter? ");
		int n = scan.nextInt();
		System.out.println("Enter the list of numbers: ");
		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			numbers.add(num);
		}

		System.out.println("Enter the target: ");
		int target = scan.nextInt();

		if (numbers.indexOf(target) >= 0) {
			System.out.println("Successful Search!");
		} else {
			System.out.println("Unsuccessful Search!");
		}
		scan.close();
	}
}
