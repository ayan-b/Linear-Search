import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int value = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
    }
    linearSearch(n, array, value);
  }

  private static void linearSearch(int n, int[] array, int value) {
    for (int i = 0; i < n; i++) {
      if (array[i] == value) {
        System.out.println(i);
        return;
      }
    }
    System.out.println("Not Found!");
  }
}
