import java.util.Random;
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
        this.accountID = generateID(); 
        scnr.close();
    }

    /*
     * Generates a unique 13 digit string.  Only accounts need to generate unique IDs
     * @return String unique 13 digit account ID
     */
    private static String generateID(){
        // ideas: create 13 random numbers concatenated
        //        use "hashCode"?
        // need to make sure account IDs are unique
        Random rand = new Random(); 
        String uniqueID = "";
        int max_length = 13;
        while(max_length > 0) {
            uniqueID = uniqueID + String.valueOf(rand.nextInt(10));
            max_length--;
        }
        // do a loop, 13 times
        // generate new random number, add it to string
        // WORRY: we need to check for duplicate account numbers

        return uniqueID;
    }

    public void withdraw(double amount) {

    }

    @Override
    public String toString(){
        return this.accountID + "\t" + this.owner + "\t" + this.money;
    }
}
