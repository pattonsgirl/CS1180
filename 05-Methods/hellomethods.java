
public class hellomethods {
    public static void printHello() {
        System.out.println("Hello World!");
        // return;
    }

    public static int adder(int a, int b) {
        System.out.println("Hello World!");
        int result = 0;
        a = 22;
        b = 42;
        result = a + b;
        System.out.println("Values added from function are " + result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello from main!");
        // printHello();
        int result = 0;
        int a = 5, b = 10;
        result = adder(a, b);
        System.out.println("a is " + a + "and b is " + b);
        System.out.println("Values added returned to main are " + result);
        System.out.println("Goodbye from main!");
    }
}
