// libraries
import java.util.Scanner;
import java.util.Random;

public class userinput {
    public static void main(String[] args) {
        // generate random number
        // OR get game number
        int gameNum = 7;
        // get user input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 10: ");
        int userNum = scnr.nextInt();
        // check if user number is less than 0
        if (userNum < 0) {
            System.out.println("Too low");
        }
        // else if between 0 and 10, check user name against game number
        else if (userNum >= 0 || userNum <= 10){
            if (gameNum == userNum) {
                System.out.println("You were right!");
            }
            else {
                System.out.println("You were wrong!");
            }
        }
        // else print number out of range
        else {
            System.out.println("Too high");
        }
        // At end, print "See you later"
        System.out.println("See you later");
    }
}
