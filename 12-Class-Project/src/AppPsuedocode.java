
/**
 * Psuedocode Driver for Banking application
 * @author Kayleigh Duncan
 * @version 1.0
 */

import java.util.*;

public class AppPsuedocode {
    /*
     * Prints option menu to screen
     */
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

    /**
     * Driver for Banking application
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        int userchoice = 0;
        boolean keepprompting = true;
        ArrayList<Account> accounts = new ArrayList<>();

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
                    // TODO: add new Account to ArrayList
                    // prompt for account info (username, account type, starting funds)
                    // create a new Account object, initializing it with those values
                    // .add the Account object to the ArrayList of Account objects
                    System.out.println("Under Construction");
                    break;
                case 2:
                    // TODO: account details by username
                    // prompt for username
                    // print Account objects with given username
                    System.out.println("Under Construction");
                    break;
                case 3:
                    // TODO: account details by account number
                    // prompt for account number
                    // print Account object with account number
                    System.out.println("Under Construction");
                    break;
                case 4:
                    // TODO: deposit to account number
                    // prompt for account number
                    // prompt for desposit amount
                    // find Account by account number
                    // add funds to account
                    System.out.println("Under Construction");
                    break;
                case 5:
                    // TODO: withdraw from account number
                    // prompt for account number
                    // prompt for desposit amount
                    // find Account by account number
                    // remove funds from account
                    System.out.println("Under Construction");
                    break;
                case 6:
                    // TODO: transfer between accounts
                    // prompt for two account numbers (from account to account)
                    // prompt for transfer amount
                    // find accounts by account numbers
                    // transfer funds (- or +)
                    System.out.println("Under Construction");
                    break;
                case 7:
                    // TODO: save accounts to file
                    // prompt for file name
                    // create a file writer
                    // print accounts in ArrayList of accounts to file
                    // close file writer, close file
                    System.out.println("Under Construction");
                    break;
                case 8:
                    // TODO: read accounts from file
                    // clear Account ArrayList?
                    // prompt for a file name
                    // open file for reader, create file read scanner
                    // while the file has a next line
                    // read info, create new Account object, add to ArrayList
                    // close scanner, close file
                    System.out.println("Under Construction");
                    break;
                case 9:
                    // SORT accounts, then print accounts
                    Collections.sort(accounts);
                    // takes ArrayList of Account objects, converts to a String
                    // System.out.println(accounts.toString());
                    for (Account a : accounts) {
                        System.out.println(a);
                    }
                    break;
                case 10:
                    // TODO: prompt to save before exit?
                    // ask, if yes, write accounts ArrayList to file
                    // plus you totally made that a method, right?
                    System.exit(0);
                    break;
                default:
                    System.out.println(userchoice + " is not an option");
                    break;
            }

        } while (userchoice != 10);

    }
}
