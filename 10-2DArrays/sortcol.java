import java.util.Arrays;

public class sortcol {
    /*
     * TODO: there is a bug somewhere breaking column sort
     * TODO: if you can crack it, email me ;)
     */
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, temp = 0, minval = 0;
        int[][] numbers = {
                { 20, 75, 45 },
                { 56, 80, 32 },
                { 67, 54, 23 },
                { 25, 75, 32 },
                { 12, 34, 12 },
                { 30, 89, 54 },
                { 56, 58, 34 }
        };
        /*
         * SORT VALUES WITHIN COLUMN
         */
        // need to loop across columns
        for (i = 0; i < numbers[0].length; i++) {
            // now I am in a column. Sort within the values stored in a column
            for (j = 0; j < numbers.length; j++) {

                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }

        // need to loop across columns
        for (i = 0; i < numbers[0].length; i++) {
            // now I am in a column. Sort within the values stored in a column
            for (j = 0; j < numbers.length; j++) {
                // System.out.print(numbers[j][i] + " ");
                minval = numbers[j][i];
                for (k = j + 1; k < numbers.length; k++) {
                    // System.out.println("Comparing: " + numbers[j][i] + " to " + numbers[k][i]);
                    if (numbers[k][i] < minval) {
                        // System.out.println("found smaller: " + numbers[j][i] + " is greater than " +
                        // numbers[k][i]);
                        temp = numbers[j][i];
                        numbers[j][i] = numbers[k][i];
                        numbers[k][i] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted by columns");
        // printing a 2D array using .toString
        // Arrays.toString only prints a 1D array
        for (i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }
}
