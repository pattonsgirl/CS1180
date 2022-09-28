public class overflowmethods {
    // Method overflow
    // Methods with the same name, but differing set of
    // defined parameters.

    // shape prints a pyramid
    // Parameters: integer that defines number of lines
    // Return value: void
    public static void shape(int a) {
        System.out.println("Printing a half pyramid");
        for (int i = 0; i < a; i++) {
            // System.out.print("row " + i + ": ");
            // hint: write for each loop iteration, the value of i, the value of j, and the
            // expected output
            for (int j = 0; j <= i; j++) {
                // System.out.print(j + " ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // shape prints a rectangle
    // Parameters: integers that define height and width
    // Return value: void
    public static void shape(int a, int b) {
        System.out.println("Printing a rectangle");
        for (int i = 0; i < a; i++) {
            // System.out.print("row " + i + ": ");
            for (int j = 0; j <= b; j++) {
                // System.out.print(j + " ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting shapes");
        int lines = 3;
        int across = 10;
        // methods take arguments, but have no return value
        shape(lines);
        // order of arguments matters!
        // shape(lines, across, lines);
        shape(across, lines);
        System.out.println("All done!");
    }
}
