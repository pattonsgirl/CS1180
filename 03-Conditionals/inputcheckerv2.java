import java.util.Scanner;

public class inputcheckerv2 {
    public static void main(String[] args) {
        // use logical operators to "shorten" the other input checker
        // User can enter a number between 5 and 10.
        // import scanner, create a scanner object, read an int from the user
        Scanner scnr = new Scanner(System.in);
        int userinput = scnr.nextInt();

        // Check if user entered a number between 5 and 10, inclusive
        // inclusive means include 5 AND 10 as a possible value.

        // If number is lower than 5 and greater than 10, print “Out of range”
        // in english, this reads as follows:
        // if the userinput is less than 5 OR greater than 11
        if ((userinput < 5) || (userinput > 11)) {
            System.out.println("Out of range");
        }
        // Else print “Just right!”
        else {
            System.out.println("Just right");
        }

        // Here is an example of INCORRECT use of a logical operator
        // by using AND, what happens if the user enters 7?
        if ((userinput < 5) && (userinput > 11)) {
            System.out.println("Out of range");
        }
        // Else print “Just right!”
        else {
            System.out.println("Just right");
        }

        // the first correct solution looked to see if the user was
        // wrong first. Here, we look to see if the user was RIGHT first
        // in english, this reads as:
        // if the userinput is greater than or equal to 5 AND less than or equal to 10
        if ((userinput >= 5) && (userinput <= 10)) {
            System.out.println("Just right");
        }
        // Else print “Out of Range”
        // valid numbers would have resulted in true above
        else {
            System.out.println("Out of range");
        }

    }
}
