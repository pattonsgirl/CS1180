import java.util.Scanner;

public class inputchecker {
    public static void main(String[] args) {
        // User can enter a number between 5 and 10.
        // import scanner, create a scanner object, read an int from the user
        Scanner scnr = new Scanner(System.in);
        int userinput = scnr.nextInt();

        // This method uses *relational* operators only to logically check
        // that the number is 5 or greater AND 10 or less
        // Mentally, check the following user input values
        // and see what slot the input should fall into
        // 3 5 7 10 0 20 42

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

        // Food for thought: If we used logical operators, how could we
        // "shorten" the if statement logic?
        // Head to inputcheckerv2.java

    }
}
