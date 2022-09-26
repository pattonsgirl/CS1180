import java.util.Scanner;

public class biggestmethods {
    // take code from 04-Loops: forbiggestnumber.java

    public static int whichIsBigger(int oldBiggest, int num) {
        /*
         * if (userNum > biggest) {
         * System.out.println("The biggest so far was " + biggest);
         * biggest = userNum;
         * }
         */
        /*
         * APPROACH 1:
         * I could create a placeholder for newBiggest
         * if newBiggest = 0, what happens if num = 1, oldBiggest = 3?
         * int newBiggest = 0;
         * Setting newBiggest to hold oldBiggest would mean I don't need the else
         * newBiggest = oldBiggest;
         * if (num > oldBiggest) {
         * newBiggest = num;
         * } else {
         * if newBiggest = 0, I need to return the oldBiggest
         * if this else is true (what runs)
         * newBiggest = oldBiggest;
         * }
         * return newBiggest;
         */

        // APPROACH 2: with style
        // if num is bigger than oldBiggest, return num (since it is biggest)
        if (num > oldBiggest) {
            // return statements can be declared any point in a function
            // the function will stop at the return statement
            // and control is "returned" to function it was called with
            return num;
        }
        // else, return oldBiggest value
        else {
            return oldBiggest;
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int biggest = 0;
        int userNum = 0;

        for (i = 0; i < 10; ++i) {
            System.out.println("Give me a number: ");
            userNum = scnr.nextInt();
            /*
             * Move the below logic to a method
             * if (userNum > biggest) {
             * System.out.println("The biggest so far was " + biggest);
             * biggest = userNum;
             * }
             */
            // System.out.printf("testing %d against %d\n", userNum, biggest);
            // send method current biggest number & user Input number
            // return value is the biggest of the two numbers
            biggest = whichIsBigger(biggest, userNum);

        }

        System.out.println("The biggest number given was: " + biggest);
    }
}
