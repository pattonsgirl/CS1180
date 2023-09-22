import java.util.Scanner;
public class bignumber {
    public static void main(String[] args) {
        // prompt user for number of numbers
        Scanner scnr = new Scanner(System.in);
        //Scanner scnr2 = new Scanner(System.in);
        System.out.println("How many numbers to evaluate: ");
        int numOfNums = scnr.nextInt();
        int num1 = 0;
        //integer to hold big num
        //int bigNum = scnr.nextInt();
        int bigNum = 0;
        // for loop to do what:

        for (int i = numOfNums - 1; i >= 0; i--){
            System.out.println("Give me a number: ");
            //scan for nums
            num1 = scnr.nextInt();
            System.out.println("User entered: " + num1);
            // TODO: use placeholders to see if old num is greater than new num
            if (num1 > bigNum) {
                System.out.println("New big number found");
                bigNum = num1;
            }
        }
        //i = 90;
        // print biggest number
        System.out.println("Biggest number is: " + bigNum);
    }
}
