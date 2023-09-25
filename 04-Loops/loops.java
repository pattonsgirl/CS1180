import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = 10;
        /*while ( num1 > 0 ) {
            System.out.println(num1);
            num1 = num1 -1;
        }

        num1 = 0;
        while ( num1 <= 10 ) {
            System.out.println(num1);
            num1 = num1 + 1;
        }*/

        char userLetter = 'n';
        while (userLetter == 'y') {
            System.out.println("Type (y OR n): ");
            userLetter = scnr.next().charAt(0);
        }

        scnr.nextLine();

        // do while style

        userLetter = 'n';
        do  {
            System.out.println("Type (y OR n): ");
            userLetter = scnr.next().charAt(0);
        } while (userLetter == 'y');

        num1 = 5;
        while (num1 <= 10) {
            System.out.println(num1);
        }

        while (true) {
            System.out.println("To infinity!");
        }
    }
}
