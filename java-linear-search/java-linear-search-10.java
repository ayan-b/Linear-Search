import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class JavaLinearSearchUsingStreams {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < numbers; i++) {
            System.out.println("Please enter the number for index " + i);
            array.add(scanner.nextInt());
        }

        System.out.println("Enter the number you want to search for");
        int numberToFind = scanner.nextInt();
        Optional<Integer> isFound = array.stream().filter(i -> i == numberToFind).findFirst();
        if(isFound.isPresent()) {
            System.out.println("Found number at index" + array.indexOf(isFound));
        } else System.out.println("Number not present");
    }
}
