import java.util.*;

public class App {
    public static void printMenu() {
        System.out.println("Read carefully because our menu options have changed");
        System.out.println("1 - add account");
        System.out.println("2 - account details for user");
        System.out.println("3 - account details for account number");
        System.out.println("4 - deposit to account");
        System.out.println("5 - withdraw from account");
        System.out.println("6 - transfer between accounts");
        System.out.println("7 - save bank accounts to file");
        System.out.println("8 - read bank accounts from file");
        System.out.println("9 - show all accounts");
        System.out.println("10 - exit program");
    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        int userchoice = 0;
        boolean keepprompting = true;

        do {
            printMenu();
            while (keepprompting) {
                // prompt user for input
                try {
                    userchoice = scnr.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type given.  Expected integer.  Gobbling bad input");
                    scnr.next();
                    continue;
                }
            }
            switch (userchoice) {
                case 1:
                    System.out.println("Under Construction");
                    break;
                case 2:
                    System.out.println("Under Construction");
                    break;
                case 3:
                    System.out.println("Under Construction");
                    break;
                case 4:
                    System.out.println("Under Construction");
                    break;
                case 5:
                    System.out.println("Under Construction");
                    break;
                case 6:
                    System.out.println("Under Construction");
                    break;
                case 7:
                    System.out.println("Under Construction");
                    break;
                case 8:
                    System.out.println("Under Construction");
                    break;
                case 9:
                    System.out.println("Under Construction");
                    break;
                case 10:
                    System.out.println("Under Construction");
                    break;
                default:
                    System.out.println(userchoice + "is not an option");
                    break;
            }

        } while (userchoice != 10);

    }
}
