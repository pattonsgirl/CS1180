import java.util.Scanner;
import java.util.Arrays;

public class arraydemos {
    public static void main(String[] args) {
        /*
         * Read user input into an array of 5 integers
         * Print all elements of the array from 0 to 4
         * Print all elements of the array from 4 to 0
         * Find minimum value
         * Find maximum value
         * Bonus: Find average of values
         * 
         */
        Scanner scnr = new Scanner(System.in);
        // prompt user for number of elements for array
        System.out.println("How many elements in array?");
        int size = scnr.nextInt();

        // create array of size specified by user
        int[] numarr = new int[size];

        // populate array with values from user
        for (int i = 0; i < numarr.length; i++) {
            numarr[i] = scnr.nextInt();
            // System.out.println(numarr[i]);
        }

        // print array by index
        for (int i = 0; i < numarr.length; i++) {
            System.out.println(numarr[i]);
        }

        // "convert" array to String to print all values in array
        System.out.print("All values in numarr: " + Arrays.toString(numarr));

        // print array in reverse (n-1 to 0)
        System.out.print("Reverse reverse!");
        for (int i = numarr.length - 1; i >= 0; i--) {
            System.out.println(numarr[i]);
        }

        // find max element
        int biggest = 0;
        for (int i = 0; i < numarr.length; i++) {
            // System.out.println(numarr[i]);
            if (numarr[i] > biggest) {
                biggest = numarr[i];
            }
        }
        System.out.println("Largest value in array is: " + biggest);

        // find min element
        int smallest = numarr[0];
        for (int i = 0; i < numarr.length; i++) {
            // System.out.println(numarr[i]);
            if (smallest > numarr[i]) {
                smallest = numarr[i];
            }
        }
        System.out.println("Smallest value in array is: " + smallest);

        // average of values in an array
        int sum = 0;
        int i;
        for (i = 0; i < numarr.length; i++) {
            sum += numarr[i];
            // sum = sum + numarr[i];
        }
        double avg = (double) sum / numarr.length;
        System.out.printf("Average of array is: %.2f\n", avg);

        // for-each loop style
        // for each index in numarr, store value in variable num
        // can only access values, not modify them.
        for (int num : numarr) {
            System.out.println("value here is " + num);
        }

        // we can manupulate values stored in an array by changing
        // the value stored at the index
        for (i = 0; i < numarr.length; i++) {
            numarr[i] += 5;
        }

        System.out.print("All values in numarr: " + Arrays.toString(numarr));

        // in a for-each, we can only access the value, not modify them
        // (because we aren't accessing via index)
        for (int num : numarr) {
            System.out.println("value here is " + (num + 5));
        }
        System.out.print("All values in numarr: " + Arrays.toString(numarr));

    }
}
