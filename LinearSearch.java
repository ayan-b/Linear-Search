public class LinearSearch {
 
    public static int linearSearch(int[] arr, int key){
         
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
     
    public static void main(String a[]){
         
        int[] arr1= {23,45,21,55,234,1,34,90};
        int searchElem = 34;
        System.out.println("Element "+searchElem+" found at index: "+linearSearch(arr1, searchElem));
        
    }
}
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