import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void printMenu(){
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
        //System.out.println()
    }
    public static void main(String[] args) throws Exception {

        Scanner scnr = new Scanner(System.in);

        // Testing the bank class
        //Bank bank = new Bank();
        Bank bank2 = new Bank("Bank of Duncan");

        //System.out.println(bank.getName());
        System.out.println(bank2.getName());
        bank2.createAccount(500, "Kayleigh Duncan");
        bank2.createAccount(500, "Bill Jones");
        bank2.createAccount(500, "Brayden Granger");
        bank2.createAccount(453, "Rose Taylor");
        bank2.createAccount(500000, "Just Better");
        bank2.createAccount(Integer.MAX_VALUE, "Reese Hatfield");
        System.out.println(bank2);
        SavingsAccount sa = new SavingsAccount();
        System.out.println(sa);
        //scnr.nextLine();

        //System.exit(0);

        // TODO: need a menu
        printMenu();
        // get user input
        // verify it is a number 1 - 10
        int tellerOption = 0;
        while(true) {
            try{
                tellerOption = scnr.nextInt();
                if(scnr.hasNext()) {
                    scnr.nextLine();
                }
                if (tellerOption > 0 && tellerOption < 11) {
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Please enter a NUMBER from the following menu: ");
                printMenu();
            }
        }
        // catch otherwise, re-print menu

        switch (tellerOption) {
            case 1:
                Account newacc = new Account();
                bank2.createAccount(newacc.getMoney(), newacc.getOwner());
                break;
            case 2:
                // TODO: searches user account details
                break;
            case 7:
                // TODO: save bank name & accounts to a file
                Bank.saveBank(bank2);
                break;
            default:
                break;
        }
        


        // TODO: save bank info to a file
        
        // if Bank scanner was public, the following is thing
        //Bank.scnr.
        //System.out.println(bank);

        /*Account account1 = new Account();

        System.out.println(account1.toString());
        account1.deposit(350);
        System.out.println(account1);
        account1.withdraw(20);
        System.out.println(account1);
        account1.withdraw(400);
        System.out.println(account1);
        */
    }
}
