import java.util.Scanner;

/**
 * TODO: what does the program do?
 *
 * @author Kayleigh Duncan
 * @version 1.0
 */

public class javadocsample {

    /**
     * TODO: what does function do?
     * 
     * @param oldBiggest
     * @param num
     * @return int
     */

    public static int whichIsBigger(int oldBiggest, int num) {
        // if num is bigger than oldBiggest, return num (since it is biggest)
        if (num > oldBiggest) {
            return num;
        }
        // else, return oldBiggest value
        else {
            return oldBiggest;
        }

    }

    /**
     * TODO: what does function do?
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int biggest = 0;
        int userNum = 0;

        for (i = 0; i < 10; ++i) {
            System.out.println("Give me a number: ");
            userNum = scnr.nextInt();
            // send method current biggest number & user Input number
            // return value is the biggest of the two numbers
            biggest = whichIsBigger(biggest, userNum);

        }

        System.out.println("The biggest number given was: " + biggest);
    }
}
