public class SavingsAccount extends Account {
    // TODO: If we use this, bank needs to store arraylist of different account types
    private double interest;

    public SavingsAccount(){
        // 5% interest earned each month
        this.interest = 0.05;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
