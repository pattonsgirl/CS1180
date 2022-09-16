import java.util.Scanner;

public class dowhilebiggestnumber {
    public static void main(String[] args) {
        /*
         * Write a loop do while loop that checks user input.
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
        int newNum = 0; // why is this now okay?

        do {
            System.out.println("Give me a number: ");
            newNum = scnr.nextInt();
            System.out.printf("testing %d against %d\n", newNum, biggest);
            if (newNum > biggest) {
                System.out.println("The biggest before now was " + biggest);
                biggest = newNum;
                System.out.println("The new biggest number is " + biggest);

            }
        } while (newNum != 0);

        System.out.println("The biggest number given was: " + biggest);
    }
}
