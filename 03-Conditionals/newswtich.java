import java.util.Scanner;

public class newswtich {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userString = scnr.nextLine();

        switch (userString) {
            case "yes", "Yes":
                System.out.println("User entered yes");
                break;
            case "no", "No":
                System.out.println("User entered no");
                break;
            default:
                System.out.println("No match");
                break;
        }

        userString = scnr.nextLine();

        switch (userString) {
            case "yes":
            case "Yes":
                System.out.println("User entered yes");
                break;
            case "no":
            case "No":
                System.out.println("User entered no");
                break;
            default:
                System.out.println("No match");
                break;
        }
    }
}
