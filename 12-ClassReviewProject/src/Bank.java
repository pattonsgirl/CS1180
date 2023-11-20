import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String name;
    private ArrayList<Account> accounts;
    private static Scanner scnr = new Scanner(System.in);
    //private double bankValue;
    // TODO: maybe an array list for each account class

    /*
     * Constructor that handles bank objects being created with no name
     */
    public Bank() {
        System.out.println("Bank creation failed.  Must provide a name");
        System.out.print("Provide a bank name: ");
        this.name = scnr.nextLine();
    }

    /*
     * Constructor that creates a bank with a specific name
     */
    public Bank(String name) {
        this.name = name;
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
     * String of all bank info including name & all accounts
     * @return String bank info
     */
    @Override
    public String toString() {
        String whole_bank = this.name + "\n";
        for (Account account: accounts) {
            //TODO: revisit once Accounts class is operational
        }
        return whole_bank;
    }
}
