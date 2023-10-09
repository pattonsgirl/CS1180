import java.awt.*;
/**
 * @author Kayleigh Duncan
 * @version 2.0.0
 */
public class methoddemos {
    final static int sum = 0;

    /**
    * prints a cube of asterisks given value passed
    * 
    * @param size / dimensions of cube
    * @return void
    */
    public static void printCube(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
                //Toolkit.getDefaultToolkit().beep();
            }
            System.out.println();
        }
    }

    //method stub
    public static void printHello(){
        //System.out.println("Hello world");
        String start = "Hello";
        String end = "World";
        System.out.println(start + end);
        //sum = 901;
    }

    // adds two numbers together and returns the sum
    public static int adder() {
        // make two ints 
        int sum = 8 + 9;
        printHello();
        return sum;
    }

    // prints a user string
    public static void printStr(String str) {
        System.out.println(str);
    }

    // take two numbers and returns the sum
    public static int adder(int a, int b) {
        //return -1; // default value when stubbing
        return a + b;
    }


    /**
    * Driver of my program
    * Tests some methods, prints some output
    * 
    * @param arguments from command line
    * @return void
    */
    public static void main(String[] args) {
        System.out.println("Beginning of my program");
        printHello();
        int val = adder();
        System.out.println("Return value from adder is " + val);
        printStr("My string from main");
        int a = adder(8,9);
        System.out.println(a);
        printCube(10);
        //System.out.println();
        System.out.println("End of program");
    }

}
