public class nestedloopshapes {
    public static void main(String[] args) {
        // TODO: instead of hardcoding values, prompt user
        int pyrShape = 5;
        int x = 4;
        int y = 6;
        // variable scope: variable can only be accessed in scope it was declared
        // int i = 0;
        // System.out.print(i);

        // nested loops:
        // hint: focus on outer and inner loop, useful to think of
        // in terms of rows (outer loop) and columns (inner loop)

        System.out.println("Printing a rectangle");
        for (int i = 0; i < x; i++) {
            // System.out.print("row " + i + ": ");
            for (int j = 0; j <= y; j++) {
                // System.out.print(j + " ");
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Printing a half pyramid");
        for (int i = 0; i < pyrShape; i++) {
            // System.out.print("row " + i + ": ");
            // hint: write for each loop iteration, the value of i, the value of j, and the
            // expected output
            for (int j = 0; j <= i; j++) {
                // System.out.print(j + " ");
                System.out.print("* ");
            }
            System.out.println();
        }

        // System.out.print(i);

    }
}
