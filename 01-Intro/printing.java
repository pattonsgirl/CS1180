
// include java io class
import java.io.Console;
//import java.io.*; imports all Java classes in the io library

public class printing {
    public static void main(String[] args) {
        // the two slashes here create a comment - this will not be run
        // System.out.print("This is a comment, it will not run");
        /*
         * This is a block quote.
         * You can use it to comment out chunks of code
         * Or write pretty comments nice and neat
         */

        // printing with System.out
        System.out.print("This is text!");
        System.out.println("This is text and a new line after!");

        // printing with System.console()
        // create a Console object, assign the object to a variable
        Console con = System.console();
        // call the object's printf function
        con.printf("Printing with Console!");

        // Playing with print formatting
        // \n = newline, \t = tab, \\ = backslash, %% = percent sign
    }
}