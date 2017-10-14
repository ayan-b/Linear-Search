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