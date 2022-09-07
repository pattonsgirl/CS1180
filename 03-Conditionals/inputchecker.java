import java.util.Scanner;

public class inputchecker {
    public static void main(String[] args) {
        // User can enter a number between 5 and 10.
        Scanner scnr = new Scanner(System.in);

        int userinput = scnr.nextInt();
        // If number is less than 5, then print “Too low”
        if (userinput < 5) {
            System.out.println("Number given was too low");
        }
        // Else if number is between 5 and 10, print “Just right”
        else if (userinput < 11) {
            System.out.println("Just right!");
        }
        /*
         * else if (userinput < 30) {
         * System.out.println("in the ballpark, but too high");
         * }
         */

        // Else print “Too high!”
        else {
            System.out.println("Too high");
        }

        // After, print "see you later!"

    }
}
