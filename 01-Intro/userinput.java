
//import java io class
import java.io.Console;
//import Scanner
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        // Getting user input with Scanner
        // Create a scanner object
        Scanner sc = new Scanner(System.in);
        // Prompt a user
        System.out.print("Give me your favorite saying: ");
        // Read the type of data from the user
        String userstr = sc.nextLine();
        System.out.print("Give me your favorite whole number: ");
        int usernum = sc.nextInt();
        System.out.print("Give me your favorite decimal number: ");
        double usernum2 = sc.nextDouble();

        System.out.println("Your favorite stuff: ");
        System.out.println("Phrase: " + userstr);
        System.out.println("Whole number: " + usernum);
        System.out.println("Decimal number: " + usernum2);

        // Getting user input with System.console & store value
        // console can both print (output) and read (input strings)
        // import java.io.Console
        // create a Console object
        Console con = System.console();
        con.printf("Give me a string: ");
        String usrstr = con.readLine();
        con.printf("User entered: %s", usrstr);
    }
}
