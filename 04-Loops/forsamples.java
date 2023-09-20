public class forsamples {
    public static void main(String[] args) {
        /*
         * for (i = start; condition for i; increment i) {
         * do these things
         * }
         */

        // Print 0 to 10 using a for loop
        int i = 0;
        System.out.println("printing 0 to 10");
        for (i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        // Print every 5th number between 0 and 100 using a for loop
        System.out.println("printing every 5th number 0 to 100");
        for (i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }
        // Print 11 - 22 using a for loop
        System.out.println("printing between 11 and 22");
        for (i = 11; i <= 22; ++i) {
            System.out.println(i);
        }

        // Print 10 to 0 using a for loop
        System.out.println("printing countdown 10 to 0");
        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}