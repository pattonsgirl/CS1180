import java.util.Scanner;

public class inputcheckerv2 {
    public static void main(String[] args) {
        // use logical operators to "shorten" the other input checker
        // User can enter a number between 5 and 10.

        Scanner scnr = new Scanner(System.in);

        int userinput = scnr.nextInt();
        // If number is lower than 5 and greater than 10, print “Out of range”
        if ((userinput < 5) && (userinput > 11)) {
            System.out.println("Out of range");
        }
        // Else print “Just right!”
        else {
            System.out.println("Just right");
        }

    }
}
