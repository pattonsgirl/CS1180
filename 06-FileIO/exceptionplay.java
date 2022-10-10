import java.io.EOFException;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.*;

public class exceptionplay {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        boolean keepprompting = true;
        while (keepprompting) {
            try {
                i = scnr.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please input an integer");
                scnr.next();
                continue;
            } finally {
                System.out.println("I will always run... ");
                System.out.println("(if it wasn't for that darn continue and break)");
            }
        }
        System.out.println("i holds " + i);

    }
}
