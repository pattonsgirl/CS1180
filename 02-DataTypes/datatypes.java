
public class datatypes {
    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 4;
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
        // multiplied
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

        // playing with overflow
        // overflow = storing a value larger than the data type can hold
        int largeNum1 = 100000; // 100,000
        int largeNum2 = 10000; // 10,000
        int largeResult = largeNum1 * largeNum2;
        System.out.println("The integer largeResult overflowed! " + largeResult);

        long multresult = largeNum1 * largeNum2;
        System.out.println("The long multResult can hold this large value " + multresult);

        // compound operators
        // +=, -=, *=, /=
        num1 = 8;
        // the two statements below do the same thing
        // take value currently stored in num1, add 2, store result in num1
        num1 = num1 + 2; // num1 equals 10
        num1 += 2; // num1 equals 12
        System.out.printf("Value in num1 is %d\n", num1);
        num1 *= num1; // what would this result in?
        System.out.printf("Value in num1 is %d\n", num1);

    }
}
