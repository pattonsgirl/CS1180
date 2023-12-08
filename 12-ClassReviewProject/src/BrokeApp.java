import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BrokeApp {

    public static void printMenu() {
        System.out.println("Read carefully because our menu options have changed");
        System.out.println("0 - print menu");
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
        // System.out.println()
    }

    public static void main(String[] args) throws Exception {

        //Scanner scnr = new Scanner(System.in);

        // Testing the bank class
        // Bank bank = new Bank();
        Bank bank = new Bank("Bank of Duncan");
        // these lines are useful for BUILDING a bank.  Once you have a data file, remove
        /*System.out.println(bank.getName());
        bank.createAccount(500, "Kayleigh Duncan");
        bank.createAccount(500, "Bill Jones");
        bank.createAccount(500, "Brayden Granger");
        bank.createAccount(453, "Rose Taylor");
        bank.createAccount(500000, "Just Better");
        bank.createAccount(Integer.MAX_VALUE, "Reese Hatfield");
        */
        System.out.println(bank);

        // Account acc = new Account();
        // System.out.println(acc);
        // SavingsAccount sa = new SavingsAccount();
        // System.out.println(sa);
        printMenu();
        // User input validation && action menu
        Scanner scnr = new Scanner(System.in);
        int userchoice = 0;
        boolean keepprompting = true;
        Integer accNum; // placeholder for inputs
        boolean accountFound = false;
        //ArrayList<Account> accounts = new ArrayList<>();
        //printMenu();
        do {
            while (keepprompting) {
                // prompt user for input
                try {
                    userchoice = scnr.nextInt();
                    System.out.flush();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type given.  Expected integer.  Gobbling bad input");
                    scnr.next();
                    System.out.flush();
                    continue;
                }
            }
            System.out.flush();

            switch (userchoice) {
                case 1:
                    System.out.println("Creating new account");
                    System.out.print("Provide an account owner: ");
                    String accOwner = scnr.nextLine();
                    System.out.print("Provide initial deposit: ");
                    double accFunds = scnr.nextDouble();
                    scnr.nextLine();
                    bank.createAccount(accFunds, accOwner);
                    break;
                case 2:
                    // Account details by username
                    // TODO
                    break;
                case 3:
                    // Account details by account number
                    // TODO
                    /*System.out.print("Provide account number: ");
                    accNum = scnr.nextInt();
                    System.out.flush();
                    for (Account a : accounts) {
                        if (a.getAccountNumber().equals(accNum)) {
                            System.out.println(a);
                        }
                    }*/
                    break;
                case 4:
                    // Deposit to account number
                    // System.out.flush();
                    System.out.print("Provide account number: ");
                    accNum = scnr.nextInt();
                    System.out.flush();
                    accountFound = false;
                    for (Account a : bank.getAccounts()) {
                        if (a.getAccountID().equals(accNum)) {
                            accountFound = true;
                            System.out.println("Account found.");
                            System.out.println(a);
                            System.out.println("Enter deposit amount: ");
                            Double deposit = scnr.nextDouble();
                            System.out.flush();
                            a.deposit(deposit);
                            System.out.println(a);
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account " + accNum + " not found");
                    }
                    break;
                case 5:
                    // Withdraw from account number
                    // System.out.flush();
                    System.out.print("Provide account number: ");
                    accNum = scnr.nextInt();
                    System.out.flush();
                    accountFound = false;
                    for (Account a : bank.getAccounts()) {
                        if (a.getAccountID().equals(accNum)) {
                            accountFound = true;
                            System.out.println("Account found.");
                            System.out.println(a);
                            System.out.print("Enter withdrawl amount: ");
                            Double withdraw = scnr.nextDouble();
                            System.out.flush();
                            // TODO: withdraw funds
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account " + accNum + " not found");
                    }
                    break;
                case 6:
                    // Transfer between accounts
                    // Transfer FROM first - if insufficient funds, transfer should not continue
                    System.out.print("Provide account number to transfer funds FROM: ");
                    accNum = scnr.nextInt();
                    System.out.flush();
                    accountFound = false;
                    Double transfer = 0.00;
                    boolean insuffFunds = true;
                    // TODO: fix to use transfers with this code base
                    /*for (Account a : accounts) {
                        if (a.getAccountNumber().equals(accNum)) {
                            accountFound = true;
                            System.out.println("Account found.");
                            System.out.println(a);
                            System.out.print("Enter amount to transfer: ");
                            transfer = scnr.nextDouble();
                            System.out.flush();
                            if ((a.getAccountFunds() - transfer) >= 0) {
                                insuffFunds = false;
                                a.setAccountFunds(a.getAccountFunds() - transfer);
                            } else {
                                System.out.println("Insufficent funds for transfer");
                                insuffFunds = true;
                            }
                            System.out.println(a);
                        }
                    }
                    if (insuffFunds) {
                        System.out.println("Canceling transfer");
                        break;
                    }
                    if (!accountFound) {
                        System.out.println("Account " + accNum + " not found");
                        break;
                    }
                    System.out.print("Provide account number to transfer funds TO: ");
                    accNum = scnr.nextInt();
                    System.out.flush();
                    accountFound = false;
                    for (Account a : accounts) {
                        if (a.getAccountNumber().equals(accNum)) {
                            accountFound = true;
                            System.out.println("Account found.");
                            a.setAccountFunds(a.getAccountFunds() + transfer);
                            System.out.println(a);
                        }
                    }
                    if (!accountFound) {
                        System.out.println("Account " + accNum + " not found");
                        break;
                    }
                    */
                    break;
                case 7:
                    // Save accounts to file
                    System.out.flush();
                    Bank.saveBank(bank);
                    break;
                case 8:
                    // Read accounts from file
                    System.out.flush();
                    // TODO: clear accounts in current bank
                    // accounts.clear();
                    Bank.loadBank(bank);
                    System.out.flush();

                    break;
                case 9:
                    // SORT accounts, then print accounts
                    // TODO: modify to sort these accounts
                    /*Collections.sort(accounts);
                    // takes ArrayList of Account objects, converts to a String
                    // System.out.println(accounts.toString());
                    for (Account a : accounts) {
                        System.out.println(a);
                    }*/
                    break;
                case 10:
                    // TODO: prompt to save before exit?
                    System.exit(0);
                    break;
                case 11:
                    printMenu();
                    break;
                default:
                    System.out.println(userchoice + " is not an option");
                    printMenu();
                    break;
            }

        } while (userchoice != 10);

        scnr.close();
        
    }
    
}
