public class App {
    public static void main(String[] args) throws Exception {

        // Testing the bank class
        Bank bank = new Bank();
        Bank bank2 = new Bank("Bank of Duncan");

        System.out.println(bank.getName());
        System.out.println(bank2.getName());
        // if Bank scanner was public, the following is thing
        //Bank.scnr.
        System.out.println(bank);

        Account account1 = new Account();

        System.out.println(account1.toString());

    }
}
