public class shapesmethods {

    // take nested loops samples that print pyramid and
    // rectangle and create methods that do the same job
    // code from 04-Loops: nestedloopshapes.java

    // pyramid prints a pyramid
    // Parameter: integer that defines pyramid height
    // Return value: void
    public static void pyramid(int a) {
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

    // rectangle prints a rectangle
    // Parameters: integers that define height and width
    // Return value: void
    public static void rectangle(int a, int b) {
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
        pyramid(lines);
        // order of arguments matters!
        rectangle(lines, across);
        rectangle(across, lines);
        System.out.println("All done!");
    }
}
