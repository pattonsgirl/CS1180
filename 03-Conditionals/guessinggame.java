import java.util.Random;
import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        // Generate a random number between 0 and 10 (inclusive)
        // Generate a random number between 0 and 10 (inclusive)

        Random randGen = new Random();

        // create a random number object
        // generate a random number in range 0-10
        int randNum = randGen.nextInt(11);

        // Get a guess from the user

        // scan userinput
        Scanner scnr = new Scanner(System.in);
        int userinput = scnr.nextInt();

        // Check if guess is equal to the random number
        // If equal, print “You win!”, else print “No luck, number was ____”
        // TODO: if userinput == randNum
        System.out.println("The computer picked " + randNum);
        if (userinput == randNum) {
            System.out.println("You win");
        } else {
            System.out.println("You lose.  Number was " + randNum);
        }
        // TODO: println("You win!");
        // TODO: else
        // TODO: println("You lose. Number was: " + randNum);

        // Challenge: hot or cold?
        // If user guess is +2 or -2 digits from random number, print “You were almost
        // right!”
        // Else print “Not even close number was ___” and the number
        // TODO: if userinput == randNum
        // TODO: println("You win!");
        // TODO: else if absolute value (userinput - randNum) <= 2
        // TODO: println("You were hot! Number was: " + randNum);
        // TODO: else
        // TODO: println("Not even close. Number was: " + randNum);

        // Food for thought: what if we wanted to let the user try again or start a new
        // game?

    }
}
