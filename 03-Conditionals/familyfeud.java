import java.util.Scanner;

public class familyfeud {
    public static void main(String[] args) {
        // input from user
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome, would you like to evaluate a score? ");
        String userResponse = scnr.nextLine();
        // check user reponse
        if (userResponse.equalsIgnoreCase("yes")) {
            
        }
        // TODO: prompt a user
        int gameScore = scnr.nextInt();

        // set score ranges
        // Loser - 0 - 499
        if (gameScore < 500 ) {
            System.out.println("That is a LOSING score");
        }
        // Average - 500 - 749
        else if (gameScore > 499 && gameScore < 750) {
            System.out.println("That is an AVERAGE score");
        }
        // Winner - 750 - 1000
        else if (gameScore >= 750 && gameScore <= 1000) {
            System.out.println("That is a WINNING score");
        }
        // Steve's score
        else {
            System.out.println("They must be Steve Harvey.");
        }

    }
}
