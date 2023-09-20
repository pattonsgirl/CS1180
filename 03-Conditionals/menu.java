import java.util.Scanner;
import java.lang.Math;

public class menu {
    public static void main(String[] args) {
        // calculator

        // user to choose: mult, exp, add, sub
        // user enters operation 
        //      user to give a letter.  
        //      DONE: can we handle single letters & whole word
        // let user enter two numbers

        // initialize
        int x,y,result;
        char userChoice = 'a';
        Scanner scnr = new Scanner(System.in);
        String options = "Which calc function would you like to perform? \n" +
            "a for add\n" +
            "s for subtraction\n" +
            "m for multiply\n" +
            "e for exponent\n";
        System.out.println(options);

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
                //System.out.println("user selected add");
                // add two numbers
                // output a result of the operation    
                result = x + y;
                System.out.printf("%d and %d added together = %d", x, y, result);
                break;
            case 's':
                result = x - y;
                //System.out.println("user selected subtract");
                System.out.printf("%d minus %d = %d", x, y, result);
                break;
            case 'm':
                result = x * y;
                System.out.printf("%d and %d multiplied together = %d", x, y, result);
            case 'e':
                //System.out.println("user selected exponent");
                result = (int)Math.pow((double)x, (double)y);
                System.out.printf("%d to the power of %d = %d", x, y, result);
                break;
            
            default:
                System.out.println("Invalid choice");
                break;
        }
        scnr.close();    
    }
}
