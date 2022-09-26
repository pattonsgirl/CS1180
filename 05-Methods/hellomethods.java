
public class hellomethods {
    // void = no return type (nothing is returned)
    // () = no parameters
    public static void printHello() {
        System.out.println("Hello World!");
        // the return statement here is optional.
        // return exits a method and returns a value
        // (if return type is not void)
        // return;
    }

    // int = returns an integer value
    // parameters are defined (arguments are passed)
    // when mthod is called, arguments sent are stored in parameter
    // values defined
    public static int adder(int a, int b, double myNum) {
        int result = 0;
        // int a = num1;
        // int b = num2;
        myNum = 89.0;
        a = 22;
        b = 42;
        result = a + b;
        System.out.println("Values added from function are " + result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello from main!");
        // calling printHello, which returns nothing and has no
        // defined parameters (cannot send arguments)
        printHello();
        int result = 0;
        double blah = 42.0;
        int a = 5, b = 10;
        // arguments are passed (parameters are set in function)
        // adder method returns an int, takes three arguments
        // order matters
        blah = adder(a, b, blah);
        System.out.println("a is " + a + "and b is " + b);
        System.out.println("Values added returned to main are " + result);
        System.out.println("Goodbye from main!");
    }
}
