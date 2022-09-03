import java.util.Scanner;

public class calculatorv1 {
    public static void main(String[] args) {
        // create scanner object (make sure Scanner was imported)
        Scanner scnr = new Scanner(System.in);
        // prompt user for two values
        System.out.println("Give me two numbers");
        // think here about data types you want from user
        int num1 = 0; // initializing so there is a default value
        int num2 = 0;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        /// scnr.close();
        // show user the two values in the following ways:
        // added
        double added = num1 + num2;
        // printed the values concatenated together
        System.out.println("Values added togther: " + num1 + num2);
        // parenthesis around the math expression would fix it
        System.out.println("Values added togther: " + (num1 + num2));
        // so would storing the result of the operation in another variable
        System.out.println("Values added togther: " + added);
        // subtracted
        System.out.println("Values subtracted from each other: " + (num1 - num2));
        // multiplied
        System.out.println("Values multiplied with each other: " + (num1 * num2));

        // integer division & type conversion
        System.out.println("Dividing " + num1 + " and " + num2 + " results in " + (num1 / num2));
        // 90 / 4 does not equal 22, it should be 22.5
        // Since both values were ints, the result in an int
        // to get a double (the real result) we can type cast to temporarily use
        // a data type the results in the precision desired
        System.out.println(
                "Dividing " + num1 + " and " + num2 + " with typecasting results in " + ((double) num1 / num2));
        // the result would need to be stored in a double (again, to keep precision)
        double divanswer = (double) num1 / num2;
        System.out.println(divanswer);
        // think about here what level of precision the user wants
        // see in result / output. Formatting with printf can help
        System.out.printf("Dividing %d with %d results in %.2f", num1, num2, divanswer);

        // Challenge:
        // Have user enter a length and width
        // Print the perimeter of a rectangle of that length and width.

        // Things to watch for:
        // Good prompts and output messages
        // Logical variable names
        // Expected output matches program output
        // create test cases so you can compare what you expect
        // versus what your program gave as output
        // scnr.close();
    }
}
