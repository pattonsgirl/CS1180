import java.util.Scanner;

public class Account {
    private double money;
    private String owner;
    private String accountID;
    // TODO: have not committed yet
    // private Double interestRate

    public Account() {
        // at minimum I need an owner name
        Scanner scnr = new Scanner(System.in);
        System.out.print("Name of account owner: ");
        this.owner = scnr.nextLine();
        this.money = 0.00;
        this.accountID = getID(); 
    }

    /*
     * Generates a unique 13 digit string.  Only accounts need to generate unique IDs
     * @return String unique 13 digit account ID
     */
    private String getID(){
        // ideas: create 13 random numbers concatenated
        //        use "hashCode"?
        // need to make sure account IDs are unique
        String uniqueID = "";
        return uniqueID;
    }

    public void withdraw(double amount) {

    }
}
