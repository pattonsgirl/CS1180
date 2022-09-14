import java.util.Scanner;

public class forbiggestgivestring {
    public static void main(String[] args) {

        /*
         * User will provide a list of numbers.
         * The first number will state how many number proceed it.
         * For each iteration of the loop:
         * Checks if the next number in the list is the biggest number given so far
         * Stores the largest value the user has provided… so far
         * Print the largest number the user provided
         * 
         */
        Scanner scnr = new Scanner(System.in);
        int i;
        int biggest = 0;
        System.out.println("Tell me how many numbers followed by the numbers: ");
        // Sample: 4 80 23 72 14
        // read first number to determine how many iterations
        int howMany = scnr.nextInt();
        // create variable to store read values in
        int newNum = 0;

        for (i = 0; i < howMany; ++i) {
            // read next integer
            newNum = scnr.nextInt();
            // for debugging
            // System.out.printf("testing %d against %d\n", newNum, biggest);
            if (newNum > biggest) {
                System.out.println("The biggest so far was " + biggest);
                biggest = newNum;
            }
        }

        System.out.println("The biggest number given was: " + biggest);
    }
}
