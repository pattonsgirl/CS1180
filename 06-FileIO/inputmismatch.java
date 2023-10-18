import java.util.InputMismatchException;
import java.util.Scanner;

public class inputmismatch {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1 = 0;
        boolean valid = false;

        while (!valid){
            try {
                num1 = scnr.nextInt();
                valid = true;
            } 
            catch (InputMismatchException e) {
                System.out.println("I said give me whole number");
                scnr.nextLine();
                //valid = false;
            }
            finally {
                System.out.println("In the finally block");
            }
        }   
        System.out.println(num1);

        System.out.println("I'm at the end of main");
    }
}