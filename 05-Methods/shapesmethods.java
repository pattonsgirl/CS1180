public class shapesmethods {
    // static variables can be accessed by any method
    // within the class
    // final = immutable / unchangeable, will cause an error if change is attempted
    final static double GRAVITY = 9.8;
    final static int DAYS_OF_WEEK = 7;
    // no final keyword means the value stored here starts at 9.8
    // but could be changed by methods as my program chugs along
    static double accumulator = 9.8;

    // take nested loops samples that print pyramid and
    // rectangle and create methods that do the same job
    // code from 04-Loops: nestedloopshapes.java

    // pyramid prints a pyramid
    // Parameter: integer that defines pyramid height
    // Return value: void
    public static void pyramid(int a) {
        //DAYS_OF_WEEK = 9;
        //GRAVITY += 1.07;
        System.out.println(GRAVITY);
        accumulator = accumulator + accumulator * 8;
        // if GRAVITY is final, then this would cause an issue
        // else GRAVITY can be changed
        // GRAVITY = 90.0;
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
        //int i;
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
        accumulator = accumulator + accumulator * 8;
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
