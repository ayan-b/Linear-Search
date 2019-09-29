import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch9 {
    public static void main(String args[]){

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the integer arraylist");
        int length = scanner.nextInt();
        for(int i = 0; i<length; i++){
            System.out.println("Insert integer: ");
            integerArrayList.add(scanner.nextInt());
        }
        System.out.println("The arraylist is filled, now insert the element tho search: ");
        int s = scanner.nextInt();
        searchElement(s, integerArrayList);
    }

    private static int searchElement(int s, ArrayList<Integer> integerArrayList) {
        for (int i = 0; i<integerArrayList.size(); i++){
            if(s==integerArrayList.get(i)){
                System.out.println("Element "+s+" found in position "+i+"!");
                return 0;
            }
            else {
                System.out.println("Not found!");
                return 1;

            }
        }
        return 1;
    }
}
