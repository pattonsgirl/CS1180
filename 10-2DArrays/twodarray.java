import java.util.Arrays;

public class twodarray {
    public static void main(String[] args) {
        int[][] base2d = new int[2][3];
        System.out.println(base2d.length);
        System.out.println(base2d[0].length);

        for (int i = 0; i < base2d.length; i++) {
            for (int j = 0; j < base2d[0].length; j++) {
                base2d[i][j] = 0;
            }
        }

        // printing a 2D array using .toString
        // Arrays.toString only prints a 1D array
        for (int i = 0; i < base2d.length; i++) {
            System.out.println(Arrays.toString(base2d[i]));
        }

        int[][] turnip = {
                { 23, 89, 21 },
                { 42, 2, 9 },
                { 12, 78, 3 },
                { 45, 12, 9 }
        };

        int sum = 0;

        for (int i = 0; i < turnip.length; i++) {
            for (int j = 0; j < turnip[0].length; j++) {
                sum += turnip[i][j];
            }
        }
        System.out.println("Total of turnip " + sum);

        // ragged arrays
        // this WILL NOT create a 4x4 array
        // this does create an array of 4 rows, each of different lengths
        int[][] weirdturnip = {
                { 23, 89 },
                { 42, 2, 9 },
                { 12 },
                { 45, 12, 9, 89 }
        };

        for (int i = 0; i < weirdturnip.length; i++) {
            // need to get the length of each row to get numbers of cols
            // System.out.println("Length of current row " + weirdturnip[i].length);
            for (int j = 0; j < weirdturnip[i].length; j++) {
                System.out.print(weirdturnip[i][j] + " ");
            }
            System.out.println();
        }

        int[][] dailytemps = {
                { 20, 75, 45 },
                { 56, 80, 32 },
                { 67, 54, 23 },
                { 25, 75, 32 },
                { 12, 34, 12 },
                { 30, 89, 54 },
                { 56, 58, 34 }
        };
        String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };

        for (int i = 0; i < dailytemps.length; i++) {
            // the index at days == the index of the row of temps in dailytemps
            System.out.print(days[i] + " ");
            // the inner loop, j, is "useless" in this iteration if I want
            // verbose print message
            // for(int j = 0; j < dailytemps[i].length; j++) {
            System.out.print("morning is: " + dailytemps[i][0] + " ");
            System.out.print("noon is: " + dailytemps[i][1] + " ");
            System.out.print("night is: " + dailytemps[i][2] + " ");
            // }
            System.out.println();
        }

    }
}
