public class nestedsample {
    public static void main(String[] args) {
        // desired output, using this as a base:
        // i is : value of i for iteration
        // j is : all values of j
        for (int i = 0; i < 3; i++) {
            System.out.println("The value of i is " + i);
            System.out.print("j is: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
