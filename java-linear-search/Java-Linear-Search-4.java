/**
 * @author Ana Carolina Ferreira (github.com/anacdf)
 * @version October 5, 2018
 */

import java.util.*;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class JavaLinearSearch {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the limit of your array (from 1 to 1000): ");
        int size = in.nextInt();
        ArrayList list = new ArrayList(size);

        System.out.println("Great! Now Java is selecting some random numbers for you...");
        for(int i=0; i<=size; i++) {
            list.add(i, random.nextInt(size+1));
        }

        System.out.print("Please, enter the number to be searched, from 0 to 99: ");
        int search = in.nextInt();

        int index = -1;
        index = list.indexOf(search);

        if(index==-1){
            System.out.print("Number Not Found:");
            System.out.print(" "+list);
        } else {
            System.out.print("Number found at position " + index + "!");
        }
    }
}

