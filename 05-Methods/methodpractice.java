import java.util.Scanner;
public class methodpractice {
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println("\u0007");
        }
        
        //return 0;
    }

    //TODO: user input checking method
    // @return an integer that is positive
    public static int numChecker (int num) {
        if (num > 0) {
            return num;
        }
        else if (num == 0) {
            return 0;
        }
        else {
            return 0;
        }
        //return 0;
    }

    public static int userLooper (int num2, Scanner passedScnr) {
        while (!(num2 > 0)) {
            // (num <= 0)
            System.out.println("Give me a valid positive number: ");
            num2 = passedScnr.nextInt();

        }
        return num2;
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);


        int goodNum = userLooper(-9, scnr);
        
        int userVal = scnr.nextInt();

        // TODO: check userVal is postive
        // if statement: condition userVal <= 0
        //int valFromNumChecker = numChecker(userVal);
        userVal = numChecker(userVal);
        //System.out.println(userVal);
        

        while (userVal != 0) {
            printSquare(userVal);
            // add sleep logic
            userVal = scnr.nextInt();
            userVal = numChecker(userVal);
        }

        // TODO: continue printing squares until user enters neg num or 0


        // standard intro
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // prints a cube
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // prints a triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();

        // prints an upside down triangle
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Prints a triangle of characters
        char letter = 'A'; // = 65;
        System.out.println("Character is " + letter);
        for (int i = 0; i < 5; i++) {
            letter = 65; // or letter = 'A'
            // inner loop is columns
            for (int j = 0; j <= i; j++) {
                System.out.print(letter + " ");
                letter += 1;
            }
            System.out.println();
        }
    }
}
