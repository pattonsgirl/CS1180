import java.util.Arrays;

public class sorttwod {
    public static void main(String[] args) {
        int[][] numbers = {
                { 20, 75, 45 },
                { 56, 80, 32 },
                { 67, 54, 23 },
                { 25, 75, 32 },
                { 12, 34, 12 },
                { 30, 89, 54 },
                { 56, 58, 34 }
        };

        // printing a 2D array using .toString
        // Arrays.toString only prints a 1D array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

        // we can talk about sort in a few ways -
        // 1. sort values in column
        // 2. sort values within a row
        // 3. sort all values numerically in a 2D array
        int minval = 0;
        int temp = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        /*
         * SORT VALUES WITHIN ROW
         */
        // get me into a row
        for (i = 0; i < numbers.length; i++) {
            // now I am in a row. Sort within the values stored in a row
            // note: this will now look like sorting a 1D array (see basicarraysort.java)
            for (j = 0; j < numbers[i].length; j++) {
                // set my search - see if anything bigger than this
                minval = numbers[i][j];
                for (k = j + 1; k < numbers[i].length; k++) {
                    if (numbers[i][k] < minval) {
                        // hold value that I thought was lowest
                        temp = numbers[i][j];
                        // new lowest is at i,k
                        numbers[i][j] = numbers[i][k];
                        // fill i,k with "old" lowest
                        numbers[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted by rows");
        // printing a 2D array using .toString
        // Arrays.toString only prints a 1D array
        for (i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

    }
}
