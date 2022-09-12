import java.util.Scanner;

public class switchcalc {
    public static void main(String[] args) {
        // scan userinput
        Scanner scnr = new Scanner(System.in);
        // Prompt the user for two numbers
        // Prompt the user for what mathematical operation to do
        // “Enter a to add the numbers, s to subtract, m to multiply, or d to divide”
        // Create a switch statement that evaluates the user’s desired operation, and
        // performs the correct operation in each case.
        // ‘a’, ‘s’, ‘m’, ‘d’
        System.out.println("Welcome to calculator program!");
        System.out.println("Enter two numbers:");
        // let's talk about the Scanner buffer
        // What "defines" a separation between two integers?
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        System.out.printf("Your numbers are: %d and %d%n", num1, num2);
        System.out.println("Enter a to add the numbers, s to subtract, m to multiply, or d to divide");
        String userOpt = scnr.next();
        double result = 0.0;

        switch (userOpt.charAt(0)) {
            case 'a':
                System.out.println("You chose a for add");
                result = num1 + num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case 's':
                System.out.println("You chose s for subtract");
                result = num1 - num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case 'd':
                System.out.println("You chose d for divide");
                // why should I do type casting?
                result = (double) num1 / (double) num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case 'm':
                System.out.println("You chose m for multiply");
                result = num1 * num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            default:
                System.out.println("Not an option.");
                break;
        }
        System.out.println("See you later!");

    }
}
