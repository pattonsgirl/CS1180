import java.util.InputMismatchException;
import java.util.Scanner;

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
        // System.out.println()
    }

    public static void main(String[] args) throws Exception {

        Scanner scnr = new Scanner(System.in);

        // Testing the bank class
        // Bank bank = new Bank();
        Bank bank2 = new Bank("Bank of Duncan");

        // System.out.println(bank.getName());
        System.out.println(bank2.getName());
        bank2.createAccount(500, "Kayleigh Duncan");
        bank2.createAccount(500, "Bill Jones");
        bank2.createAccount(500, "Brayden Granger");
        bank2.createAccount(453, "Rose Taylor");
        bank2.createAccount(500000, "Just Better");
        bank2.createAccount(Integer.MAX_VALUE, "Reese Hatfield");
        System.out.println(bank2);
        
        //Account acc = new Account();
         // System.out.println(acc);
        //SavingsAccount sa = new SavingsAccount();
        //System.out.println(sa);
        

        // scnr.next();
        /*
         * if(scnr.hasNext()) {
         * scnr.nextLine();
         * }/*
         */

        //System.exit(0);

        // User input validation && action menu
        int tellerOption = 0;
        while (true) {
            printMenu();
             // get user input
        // verify it is an INTEGER && is a number 1 - 10
            try {
                tellerOption = scnr.nextInt();
                // capture & dump remainder of line
                scnr.nextLine();

            } catch (InputMismatchException e) {
                // capture & dump remainder of line
                scnr.nextLine();
                System.out.println("Please enter a NUMBER from the following menu: ");
                
            }
            if (tellerOption <= 0 || tellerOption >= 11) {
                System.out.println("Please enter a NUMBER from the following menu: ");
                continue;
            }
            // do actions based on valid cases
            switch (tellerOption) {
                case 1:
                    // debate: create new Account object OR prompt for info.  
                    //         Account() prompted for owner, but doesn't now
                    System.out.println("Creating new account");
                    System.out.print("Provide an account owner: ");
                    String accOwner = scnr.nextLine();
                    System.out.print("Provide initial deposit: ");
                    double accFunds = scnr.nextDouble();
                    bank2.createAccount(accFunds, accOwner);
                    // NOTE: these breaks break out of the SWITCH, NOT the WHILE LOOP
                    break;
                case 2:
                    // TODO: searches user account details
                    break;
                case 7:
                    // TODO: save bank name & accounts to a file
                    Bank.saveBank(bank2);
                    break;
                case 10:
                    System.out.println("Make sure you save current bank state!");
                    // call case 7?
                    // ask y/n to did you?
                    System.exit(1);
                    break;
                default:
                    break;
            }
            tellerOption = 0;
        }
    }
}
