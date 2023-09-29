import java.util.Scanner;
public class stringplay {

    public static void message() {
        System.out.println("Hello from my method");
    }

    public static void main(String[] args) {
        // My sentence is bananas
        Scanner scnr = new Scanner(System.in);
        String userString = scnr.nextLine();

        System.out.println(userString);

        message();
        // print a space between character
        System.out.println("User gave a string of length: " + userString.length());

        int strLength = userString.length();

        // to use setCharAt, need to use StringBuilder
        StringBuilder specialMode = new StringBuilder(userString);

        // OR, give in and create new string from old
        String leetString = userString;

        String saveIt = "";

        for (int i = 0; i < strLength; i++) {
            //char currentChar = userString.charAt(i);
            System.out.print(userString.charAt(i) + " ");
            if (userString.charAt(i) == 'a') {
                specialMode.setCharAt(i, '@');
                leetString = leetString + '@';
                saveIt = saveIt + userString.charAt(i) + " ";
                continue;
            }
            leetString = leetString + userString.charAt(i);
            saveIt = saveIt + userString.charAt(i) + " ";
        }
        //userString = userString.replace('a', '@');
        System.out.println();
        System.out.println(userString);
        System.out.println(specialMode);

        System.out.println();
        System.out.println(saveIt);

    }
}
