import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

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

        Scanner scnr = new Scanner(System.in);

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
        int tellerOption = 0;
        while (true) {
            //printMenu();
            //scnr.nextLine();
            int tellerOption = validOption();
            // get user input
            // verify it is an INTEGER && is a number 1 - 10
            try {
                /*if(scnr.hasNext()) {
                    scnr.nextLine();
                }*/
                if (scnr.hasNextInt()){
                    tellerOption = scnr.nextInt();
                }
                // capture & dump remainder of line
                //scnr.nextLine();

            } catch (InputMismatchException e) {
                // capture & dump remainder of line
                scnr.nextLine();
                System.out.println("Please enter a NUMBER from the following menu: ");
                printMenu();

            } /*catch (NoSuchElementException e) {
                scnr.nextLine();
                System.out.println("Got me one of these");
            }*/
            if (tellerOption < 0 || tellerOption >= 11) {
                System.out.println("Please enter a NUMBER from the following menu: ");
                printMenu();
                continue;
            }
            // do actions based on valid cases
            switch (tellerOption) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    // debate: create new Account object OR prompt for info.
                    // Account() prompted for owner, but doesn't now
                    System.out.println("Creating new account");
                    System.out.print("Provide an account owner: ");
                    String accOwner = scnr.nextLine();
                    System.out.print("Provide initial deposit: ");
                    double accFunds = scnr.nextDouble();
                    scnr.nextLine();
                    bank.createAccount(accFunds, accOwner);
                    // NOTE: these breaks break out of the SWITCH, NOT the WHILE LOOP
                    break;
                case 2:
                    // TODO: searches user account details
                    break;
                case 7:
                    Bank.saveBank(bank);
                    break;
                case 8:
                    // TODO: read bank info from file
                    Bank.loadBank(bank);
                    System.out.println("Loaded bank data: \n" + bank);
                    break;
                case 9: 
                    System.out.println(bank);
                    break;
                case 10:
                    System.out.println("Make sure you save current bank state!");
                    // call case 7?
                    // ask y/n to did you?
                    scnr.close();
                    System.exit(1);
                    break;
                default:
                    break;
            }
            tellerOption = 0;
            // capture & dump remainder of line
            if (scnr.hasNext()){
                scnr.nextLine();
            }
        }
        
    }
    
}
