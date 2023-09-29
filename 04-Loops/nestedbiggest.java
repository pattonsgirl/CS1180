import java.util.Scanner;

public class nestedbiggest {
    public static void main(String[] args) {
        /*
         * User will keep providing a list of numbers until a list starts with 0.
         * The first number will state how many numbers are after it.
         * For each iteration of the loop:
         * Checks if the next number in the list is the biggest number given so far
         * Stores the largest value the user has provided… so far
         * Print the largest number the user provided in that line of input
         * 
         * Sample:
         * 4 80 23 72 14
         * The biggest number this round was 80
         * 3 90 2 23
         * The biggest number this round was 90
         * 9 56 777 20 8 900 4 87 43 32
         * The biggest number this round was 777
         * 0
         * Program over
         * 
         */
        Scanner scnr = new Scanner(System.in);
        // create iterator
        int i;
        // create storage for biggest number seen
        int biggest = 0;
        // create storage for how many numbers to scan
        int howMany = 0;
        // create storage for values read in
        int newNum = 0;

        // think about: I used do-while loop.
        // How would this need to be changed for while loop?
        do {
            // read first number to determine how many iterations
            // Sample: 4 80 23 72 14

            // what if howMany == 0?

            for (i = 0; i < howMany; ++i) {
                // read next integer
                newNum = scnr.nextInt();
                // for debugging
                // System.out.printf("testing %d against %d\n", newNum, biggest);
                if (newNum > biggest) {
                    // System.out.println("The biggest so far was " + biggest);
                    biggest = newNum;
                }
            }

            System.out.println("The biggest number this round was: " + biggest);
            // reset biggest to analyze next input set
            biggest = 0;

        } while (howMany != 0);

    }
}