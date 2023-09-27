import java.util.Scanner;

public class sentineldemo {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int userNum = 0;
        int sum = 0;

        do {
            userNum = scnr.nextInt();
            // sum numbers
            //int sum = 0;
            if (userNum % 2 == 0)
                sum += userNum;
            //System.out.println("Other condition");
            // sum only even numbers
        } while (userNum != 0);
    }
}
