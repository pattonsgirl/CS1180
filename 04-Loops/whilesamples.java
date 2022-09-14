import java.util.Scanner;

public class whilesamples {
    public static void main(String[] args) {
        /*
         * while (expression is true) {
         * do these things (condition is evaluated first)
         * }
         */

        Scanner scnr = new Scanner(System.in);

        // char userChoice = scnr.nextLine().charAt(0);
        String userInput = scnr.nextLine();
        char userChoice = userInput.charAt(0);

        // Use a while loop to prompt the user for a character. If the character was
        // ‘y’, continue looping. Otherwise the loop condition will be false

        // in this, the string (whole user input until enter is pressed) can only be "y"
        // while (userInput.equals("y")) {
        // System.out.println("Carrying string compare on");

        // }
        // in this, I am getting the first character of the string
        // then using character operations to check for uppercase or lowercase y
        while (userChoice == 'y' || userChoice == 'Y') {
            System.out.println("Carrying on");
            System.out.println("Would you like to go again?");
            userChoice = scnr.nextLine().charAt(0);
        }
        System.out.println("You entered not y");

        // Use a while loop to print 0 to 10
        int i = 0;
        while (i <= 10) {
            System.out.println("i is " + i);
            i = i + 1;
            // y++i;
        }
        System.out.println("Done counting");

        // Write a loop that is always true and outputs “To infinity!”
        // an infinite loop is one in which the expression is always true
        // while(true){
        // System.out.println("To infinity!");
        // }

        // On a problem of your choice, add a while loop to “continue” running the
        // program if the user wants until a different input is given

    }
}
