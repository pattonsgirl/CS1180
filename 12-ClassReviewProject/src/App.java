public class App {
    public static void main(String[] args) throws Exception {

        // Testing the bank class
        //Bank bank = new Bank();
        Bank bank2 = new Bank("Bank of Duncan");

        //System.out.println(bank.getName());
        System.out.println(bank2.getName());
        bank2.createAccount(500, "Kayleigh Duncan");
        bank2.createAccount(500, "Bill Jones");
        bank2.createAccount(500, "Brayden Granger");
        bank2.createAccount(21, "Aziz");
        bank2.createAccount(453, "Rose Taylor");
        bank2.createAccount(500000, "Just Better");
        bank2.createAccount(0.25,"monee");
        bank2.createAccount(99999, "Rent ☠");
        bank2.createAccount(Integer.MAX_VALUE, "Reese Hatfield");
        System.out.println(bank2);
        
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
