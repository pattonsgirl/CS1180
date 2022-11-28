
/**
 * Driver for Banking application
 * @author Kayleigh Duncan
 * @version 1.0
 */

import java.util.*;

public class App {
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
     * Returns a new Account object
     * <p>
     * Prompts program user for info: name, account type, initial funds
     * <p>
     * Account constructor generates an accountNumber
     * 
     * @return Account
     * @see Account
     */
    public static Account accountCreate() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Provide info for the new account: ");
        System.out.print("Account owner: ");
        String owner = scnr.nextLine();
        System.out.print("Account type: ");
        String type = scnr.nextLine();
        System.out.print("Initial funds: ");
        Double money = scnr.nextDouble();
        return new Account(owner, type, money);
    }

    /**
     * Modifies an Account object
     * Prompts program user for info: name, account type, initial funds
     * <p>
     * Usage:
     * <p>
     * Account newAccount = new Account(); //generates an account number only
     * <p>
     * accountCreate(newAccount);
     * 
     * @param a
     */
    public static void accountCreate(Account a) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Provide info for the new account: ");
        System.out.print("Account owner: ");
        String owner = scnr.nextLine();
        System.out.print("Account type: ");
        String type = scnr.nextLine();
        System.out.print("Initial funds: ");
        Double money = scnr.nextDouble();
        a.setAccountOwner(owner);
        a.setAccountType(type);
        a.setAccountFunds(money);
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
                    // accountCreate creates a NEW Account object
                    // returns a reference to the Account object to
                    // store in ArrayList accounts
                    accounts.add(accountCreate());
                    break;
                case 2:
                    // TODO: account details by username
                    System.out.println("Under Construction");
                    break;
                case 3:
                    // TODO: account details by account number
                    System.out.println("Under Construction");
                    break;
                case 4:
                    // TODO: deposit to account number
                    System.out.println("Under Construction");
                    break;
                case 5:
                    // TODO: withdraw from account number
                    System.out.println("Under Construction");
                    break;
                case 6:
                    // TODO: transfer between accounts
                    System.out.println("Under Construction");
                    break;
                case 7:
                    // TODO: save accounts to file
                    System.out.println("Under Construction");
                    break;
                case 8:
                    // TODO: read accounts from file
                    System.out.println("Under Construction");
                    break;
                case 9:
                    // TODO: SORT accounts, then print accounts
                    // TODO: why does this work?
                    System.out.println(accounts.toString());
                    break;
                case 10:
                    // TODO: prompt to save before exit?
                    System.exit(0);
                    break;
                default:
                    System.out.println(userchoice + " is not an option");
                    break;
            }

        } while (userchoice != 10);

    }
}
