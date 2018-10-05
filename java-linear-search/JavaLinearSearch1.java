import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by SpaceDigi
 * Implementing Linear Search on java with better performance and testing
 **/

/**
 * This class demosntrate working linear search in collection
 * Using buffered reader for more quick parsing text and LinkedList for using iterators
 */
public final class JavaLinearSearch1 {

    private static final String STOP_SIGNAL = "STOP";

    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        //change to false for automatic testing
        boolean manualTest = true;
        //boolean manualTest = false;
        try {
            if(manualTest) {
                String line = bfr.readLine();
                LinkedList<Long> list = new LinkedList<>();
                while (!stop(line)) {
                    addNumber(line, list);
                    line = bfr.readLine();
                }
                long randomFinder = (long) (Math.random() * Long.MAX_VALUE);
                System.out.println("Number for found: " + randomFinder + " was found: " + linearSearch(list, randomFinder));
            }else{
                LinkedList<Long> list = new LinkedList<>();
                int numOfTest =5000;
                for(int k =0;k<numOfTest;k++) {
                    long valueForAdd = (long) (Math.random() * Long.MAX_VALUE);
                    list.add(valueForAdd);
                    System.out.println(valueForAdd);
                }
                long randomFinder = (long) (Math.random() * Long.MAX_VALUE);
                System.out.println("Number for found: " + randomFinder + " was found: " + linearSearch(list, randomFinder));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long linearSearch(LinkedList<Long> list, long randomFinder) {
        for(long value: list)
            if(value==randomFinder)
                return randomFinder;
        return -1;
    }

    private static void addNumber(String line, LinkedList<Long> list) {
        try {
            long value = Long.parseLong(line.trim());
            list.add(value);
        } catch (NumberFormatException e) {
            //User value isn't correct
        }
    }

    private static boolean stop(String line) {
        return line == null ||line.equals("")|| line.contains(STOP_SIGNAL);
    }
}
