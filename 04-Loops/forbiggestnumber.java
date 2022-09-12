import java.util.Scanner;

public class forbiggestnumber {
    public static void main(String[] args) {
        /*
         * Write a for loop that does the following:
         * Stops after 10 iterations
         * Prompts the user for a number
         * Checks if it is the biggest number given so far
         * Stores the largest value the user has provided… so far
         * Print the largest number the user provided
         * 
         */
        Scanner scnr = new Scanner(System.in);
        int i;
        int biggest = 0;
        int userNum = 0;

        for (i = 0; i <= 10; ++i) {
            System.out.println("Give me a number: ");
            userNum = scnr.nextInt();

            if (userNum > biggest) {
                System.out.println("The biggest so far was " + biggest);
                biggest = userNum;
            }
        }

        System.out.println("The biggest number given was: " + biggest);

    }
}
