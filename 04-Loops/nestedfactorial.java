public class nestedfactorial {
    public static void main(String[] args) {
        // factorials with nested loops
        int howMany = 10;
        int factresult = 1;
        // sample of expected results as loop iterates
        // 1! = 1
        // 2! = 2
        // 3! = 6
        // 4! = 24

        for (int i = 1; i <= howMany; i++) {
            System.out.print("factorial " + i + "!: ");
            for (int j = 1; j <= i; j++) {
                // System.out.print(j);
                factresult = factresult * j;
                // I got in my head, wrong answer below
                // factorialresult += factorialresult * j;
            }
            System.out.print(factresult);
            // System.out.print(" factorial of " + i + " is: " + factorialresult);
            System.out.print("\n");
            // reset factorial result at end of each iteration
            factresult = 1;
        }
    }
}
