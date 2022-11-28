
/**
 * Class to create objects of Accounts.
 * <p>
 * Account objects include a unique account number, an account owner, 
 * account type, and funds 
 * 
 * @author Kayleigh Duncan
 * @version 1.0
 */

import java.util.Random;
import java.lang.Comparable;

public class Account implements Comparable {
    // public class Account implements Comparable<Account>{

    private Integer accountNumber;
    private String accountOwner;
    private String accountType;
    private Double money;

    /**
     * Class constructor if no account details are given when creating
     * the account.
     * <p>
     * Minimum of accountNumber is generated from dummy String
     * <p>
     * Object's properties can then be modified using setter methods
     */
    public Account() {
        // there is no point in having an account with no info
        // could write set of prompts here to set object's values
        this.accountNumber = generateAccountNumber("abcdefghijklmnopqrstuvwxyz");
    }

    /**
     * Class constructor when owner, account type, and initial funds are known
     * on object creation
     * <p>
     * generates an account number based on owner name
     */
    public Account(String owner, String type, Double money) {
        this.accountOwner = owner;
        this.accountType = type;
        this.money = money;
        // create unique account number
        this.accountNumber = generateAccountNumber(owner);
    }

    /**
     * Returns unique account number hashed from string + random int
     * <p>
     * Private because accountNumbers should not be something modified
     * on a whim - this method is only accessible by methods in this class
     * 
     * @param s string to generate hashCode
     * @return Integer accountNumber
     */
    private Integer generateAccountNumber(String s) {
        Random randGen = new Random();
        Integer accountNum = s.hashCode() + randGen.nextInt(2000);
        System.out.println("Generated account number " + accountNum);
        return accountNum;
    }

    /**
     * Returns account number
     * 
     * @return Integer
     */
    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets new account owner for account object
     * 
     * @param newowner String new account owner
     */
    public void setAccountOwner(String newowner) {
        this.accountOwner = newowner;
    }

    /**
     * Returns account owner
     * 
     * @return String
     */
    public String getAccountOwner() {
        return this.accountOwner;
    }

    /**
     * Returns funds in account
     * 
     * @return Double money in account
     */
    public Double getAccountFunds() {
        return this.money;
    }

    /**
     * Sets initial account funds
     * 
     * @param money inital funds for account
     */
    public void setAccountFunds(Double money) {
        this.money = money;
    }

    /**
     * sets account type (Checking, Savings, Credit)
     * 
     * @param type account type
     */
    public void setAccountType(String type) {
        this.accountType = type;
    }

    /**
     * Returns formatted String for objects of type Account
     * <p>
     * Formatting in csv - comma separated value - syntax
     * <p>
     * Note: Override is optional here
     * 
     * @return String formatted data
     */
    @Override
    public String toString() {
        return this.accountNumber + ", " + this.accountOwner + ", " + this.accountType + ", " + this.money;
    }

    // TODO: needs to implement what?
    // This defines how our account objects are compared for sorting
    /*
     * @Override
     * public int compareTo(Account a) {
     * return 0;
     * }
     */

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        // is it an account object?
        return 0;
    }
}
