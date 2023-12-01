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
        //scnr.nextLine();
        this.money = 0.00;
        this.accountID = generateID(); 
        scnr.close();
    }

    public Account(String owner, double money) {
        // at minimum I need an owner name
        this.owner = owner;
        this.money = money;
        this.accountID = generateID(); 
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney(){
        return this.money;
    }

    public void setAccountID(){
        this.accountID = generateID();
    }

    public String getAccountID(){
        return this.accountID;
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
        // do a loop, 13 times
        // generate new random number, add it to string
        int max_length = 13;
        while(max_length > 0) {
            uniqueID = uniqueID + String.valueOf(rand.nextInt(10));
            max_length--;
        }

        // WORRY: we need to check for duplicate account numbers - where to check && how?

        return uniqueID;
    }

    public void withdraw(double amount) {
        // allow overdraft?  Add fee?
        if ((int)(getMoney() - amount) < 0) {

            setMoney(getMoney() - amount - Bank.overdraftfee);
        }
        else {
            setMoney(getMoney() - amount);
        }
    }

    public void deposit(double amount) {
        setMoney(getMoney() + amount);
    }

    @Override
    public String toString(){
        //return this.accountID + ", " + this.owner + ", " + this.money;
        return this.accountID + "\t" + this.owner + "\t" + this.money;
    }
}
