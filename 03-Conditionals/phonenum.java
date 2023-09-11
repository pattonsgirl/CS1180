import java.util.Scanner;
import java.util.Random;

public class phonenum {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);       
        //prompt user for phone number
        
        // solution 2: prompt separate - but do users expect / like this?
        //System.out.println("Give me your area code (ex. 897): ");

        System.out.println("Give me a phone number (ex. 897 945 9361): ");
        String phoneNum = scnr.next();
        int moreNum = scnr.nextInt();
        // could we read in until a space is found
        //Display phone number - (897)945-9361
        System.out.println("Your number is: " + phoneNum);
        //Display area code - Area code 897
        // Ways to display just area code:
        // display first 3 numbers of captured string
        // prompt separate in beginning, then concatenate to user's number
        System.out.println(moreNum);
        
        // solution 1 - display first 3 numbers
        String aCode = phoneNum.substring(0, 3);
        System.out.println("Area code is: " + aCode);

        // random numbers
        Random rnd = new Random();
        int myRandInt = rnd.nextInt(10) + 6;
        
        System.out.println("My random number is: " + myRandInt);

    }
}
