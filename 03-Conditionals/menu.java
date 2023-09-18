import java.util.Scanner;
import java.lang.Math;

public class menu {
    public static void main(String[] args) {
        // calculator

        // user to choose: mult, exp, add, sub
        // user enters operation 
        //      user to give a letter.  
        //      TODO: can we handle single letters & whole word
        // let user enter two numbers

        // initialize
        int x,y,result;
        char userChoice = 'a';
        Scanner scnr = new Scanner(System.in);

        System.out.println("Which calc function \na for add\n m for multiply\n s for subtraction\n d for divide\n: ");

        String capture = scnr.next();
        userChoice = capture.charAt(0);

        System.out.println("Provide two numbers (num1 num2): ");
        x = scnr.nextInt();
        y = scnr.nextInt();
        //userChoice = scnr.next().charAt(0);
        /*if (userChoice == 'a') {

        }
        else if (userChoice == 's'){

        }
        else {
            System.out.println("Invalid choice");
        }
        */
        switch (userChoice) {
            case 'a':
                System.out.println("user selected add");
                // add two numbers
                result = x + y;
                System.out.printf("%d and %d added together = %d", x, y, result);
                break;
            case 's':
                System.out.println("user selected subtract");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        // output a result of the operation        
    }
}
