public class LinearSearch {

    public static void main(String[] args) {
        int myList[] = {1,2,3,8,9,12};
        int key = 2;

        String output = linearSearch(myList, key) ? "Successful Search" : "Unsuccessful Search";
        System.out.println(output);

    }

    private static boolean linearSearch(int[] list, int key) {

        for(int i = 0; i < list.length; i++) {
            if(list[i] == key){
                return true;
            }

        }
        return false;
    }
}
