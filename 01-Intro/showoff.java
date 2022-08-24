import java.io.Console;

public class showoff {
    public static void main(String[] args) {
        // this is how you print a line of text
        /*
         * System.out.print("Out of this world");
         * System.out.println("see me now?");
         */
        // System.out.printf()

        Console c = System.console();
        c.printf("Hello World using a console object!");

    }
}
