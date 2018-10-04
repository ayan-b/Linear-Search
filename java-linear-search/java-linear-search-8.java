import java.util.Scanner;

public class JavaLinearSearch8 {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] data;

        System.out.print("Size of data: ");
        data = new Integer[SC.nextInt()];

        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("Adding item (%d/%d): ", i+1, data.length));
            data[i] = SC.nextInt();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.print("Perform sequential search for: ");
        Integer target = SC.nextInt();

        for (int i = 0; i < data.length; i++) {
            if (target.equals(data[i])) {
                System.out.println("Found item at index: " + i);
                return;
            }
        }
        System.out.println("Item not found.");
    }

}
