public class Account {
    private Integer accountNumber;
    private String accountOwner;
    private String accountType;
    private Double money;

    public Account() {
        // there is no point in having an account with no info
        // maybe prompts for account?
    }

    public Account(String owner, String type, Double money) {
        this.accountOwner = owner;
        this.accountType = type;
        this.money = money;
        // create unique account number
        this.accountNumber = genAccountNumber(owner);
    }

    private Integer genAccountNumber(String s) {
        return 0;
    }
}
