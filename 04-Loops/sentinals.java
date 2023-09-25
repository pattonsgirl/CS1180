import java.util.Scanner;

public class sentinals {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        char userLetter = 'y';
        while (userLetter == 'y') {
            System.out.println("Type in while loop (y OR n): ");
            userLetter = scnr.next().charAt(0);
        }

        scnr.nextLine();

        // do while style

        userLetter = 'n';
        do  {
            System.out.println("Type in do while (y OR n): ");
            userLetter = scnr.next().charAt(0);
        } while (userLetter == 'y');
    }
}
