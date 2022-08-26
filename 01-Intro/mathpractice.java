
// import the Math class to get access to a bunch of useful functions
import java.lang.Math;

public class mathpractice {
    public static void main(String[] args) {
        // basic math (included in Java base)
        // + - * / %
        int num1 = 8;
        int num2 = 13;
        // PEMDAS - order of operations still applies
        int answer = (num1 * num2) + num1; // = 112
        System.out.println("The answer is " + answer);
        answer = 56;
        System.out.println("The answer is now wrong, because it was overwritten " + answer);

        // don't store the wrong data type in a variable
        // answer = "Hello";

        // playing with division and truncation of results
        int num3 = 8;
        int num4 = 13;
        double divanswer = num3 / num4; // = 0.615384
        System.out.println("The result is: " + divanswer);
        // why 0.0?
        // I divided two INTEGERS which results in an INTEGER
        // Storing the answer in a double did not save me...
        // Options: change num3 and num4 variable data type to double
        // OR change the data type used in the equation
        // This option is called typecasting
        divanswer = (double) num3 / (double) num4;
        System.out.println("The result is: " + divanswer);

        double dnum1 = 8.0;
        double dnum2 = 13.0;
        divanswer = dnum1 / dnum2;
        // Since these started as doubles, a double will be the result
        System.out.println("The result is: " + divanswer);

        // Java Math class contains pre-built functions for common needs
        // when writing equations. Import the java.utils.Math class to use
        // The statement below gets the minimum of two numbers.
        System.out.print("Given " + num2 + " and " + num3 + "/n");
        double minnum = Math.min(num2, num3);
        System.out.println("The minimum value is: " + minnum);

    }
}
