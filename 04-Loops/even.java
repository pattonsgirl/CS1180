import java.util.Scanner;

public class even {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        // int biggest = 0;
        System.out.println("Tell me how many numbers followed by the numbers: ");
        // Sample: 4 80 23 72 14
        // read first number to determine how many iterations
        // 8 10 77 3 90 56 42 8 9
        int howMany = scnr.nextInt();
        // create variable to store read values in
        int newNum = 0;

        for (i = 0; i < howMany; i++) {
            newNum = scnr.nextInt();
            // check for 42 so that can check to stop
            if (newNum == 42) {
                System.out.println("Found " + newNum + "!");
                break;
            }
            // check for even, print even number
            if ((newNum % 2) == 0) {
                System.out.println(newNum);
                continue;
            }

        }
    }
}
