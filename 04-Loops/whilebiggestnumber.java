import java.util.Scanner;

public class whilebiggestnumber {
    public static void main(String[] args) {
        /*
         * Write a loop that checks user input.
         * Store the largest value the user has provided… so far
         * Stop loop when user enters “0”
         * The 0 is being used as a sentinel value. We want to stop, we are only
         * scanning integers, so…
         * Print the largest number the user provided
         * 
         */

        Scanner scnr = new Scanner(System.in);
        int i;
        int biggest = 0;
        int userNum = 0;
        // System.out.println("Tell me how many numbers followed by the numbers: ");
        // Sample: 4 80 23 72 14
        // int howMany = scnr.nextInt();
        // int newNum = 0;

        while (userNum != 0) {
            // System.out.println("Give me a number: ");
            // userNum = scnr.nextInt();
            newNum = scnr.nextInt();
            System.out.printf("testing %d against %d\n", newNum, biggest);
            if (newNum > biggest) {
                System.out.println("The biggest so far was " + biggest);
                biggest = newNum;
            }
        }

        System.out.println("The biggest number given was: " + biggest);
    }
}
