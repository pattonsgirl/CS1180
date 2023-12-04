import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static int overdraftfee = 35;
    private String name;
    private ArrayList<Account> accounts;
    //private static Scanner scnr = new Scanner(System.in);
    //private double bankValue;
    // TODO: maybe an array list for each account class

    /*
     * Constructor that handles bank objects being created with no name
     */
    public Bank() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Bank creation failed.  Must provide a name");
        System.out.print("Provide a bank name: ");
        this.name = scnr.nextLine();
        this.accounts = new ArrayList<Account>();
        scnr.close();
    }

    /*
     * Constructor that creates a bank with a specific name
     */
    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    /*
     * create an Account
     */
    public boolean createAccount(double money, String owner){
        Account new_account = new Account(owner, money);
        // if this new_account ID is the same as any other account ID?
        // wrapper while loop, that generates new account ids for the above account object until we definitely get a unique
        for (Account account: this.accounts){
            if(account.getAccountID().equals(new_account.getAccountID())){
                return false;
                //new_account = new Account(owner, money);
            }
        }
        this.accounts.add(new_account);
        return true;

    }

    /*
     * This method check to see if user is approved to get a loan
     * @param acc_owner_name name of account owner
     * @return boolean if approved, returns true.  Else false
     */
    public boolean getLoan(String acc_owner_name) {
        // income
        // credit score
        // account age
        // check current vs max_credit

        return false;
    }

    /*
     * Transfer funds from one bank account to another account
     */
    public void transferFunds() {

    }

    /*
     * Save bank name & all accounts to file
     */
    public static void saveBank(Bank bank) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Where would you like to save bank info: ");
        String filename = scnr.nextLine();
        // open a file for writing
        try {
            FileOutputStream fileOutStream = new FileOutputStream(filename);
            PrintWriter outFS = new PrintWriter(fileOutStream);
            outFS.print(bank);
            // remember, order of what closes matters!
            outFS.close();
            fileOutStream.close();
        } catch (Exception e) {
            System.out.println("Problem occured.  Bank not saved to file");
        }
        // write out my bank info
        scnr.close();
    }

    /*
     * Load bank information from file into bank object
     */
    public static void loadBank (Bank bank) {
        Scanner scnr = new Scanner(System.in);

        // TODO: debate: pass a bank or return a bank?
        System.out.print("Enter filename to load bank info from: ");
        String filename = scnr.nextLine();
        scnr.close();
        // TODO: info in file needs to use common separator
        //      discuss TAB separated vs COMMA separated
        /*
         * save first line into Bank.setName(pass it line 1)
         * while hasnextLine, reamining lines are accounts
         * add Account to array list
         * create new Account contructor that takes in account properties
         * Bank.arraylist.add(new Account)
         */
        
        // data notes: first line is BANK NAME, next lines are ACCOUNT INFO
    }

    /*
     * String of all bank info including name & all accounts
     * @return String bank info
     */
    @Override
    public String toString() {
        String whole_bank = this.name + "\n";
        if (!accounts.isEmpty()){
            for (Account account: accounts) {
                whole_bank = whole_bank + account.toString() + "\n";
            }
        }
        return whole_bank;
    }
}
