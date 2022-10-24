public class threedarray {
    public static void main(String[] args) {

        /*
         * Create a 3-D array that for each week of the month, stores daily temp
         * measurements for morning noon and night
         * Think on array size:
         * How many weeks in a month?
         * How many days are there in a week?
         * How many measurements are taken each day?
         */
        // 4 week in a month, 7 days in a week, 3 temps per day
        int[][][] monthoftemps = new int[4][7][3];

        // 3D array for play

        int[][][] threed = {
                {
                        { 1, -2, 3, 8 },
                        { 2, 3, 4, -3 }
                },
                {
                        { 6, -3, 9, 1 },
                        { 1, 5, -42, -4 }
                },
                {
                        { 0, 2, 43, 5 },
                        { -9, 12, 7, 2 }
                }
        };
        // row (x axis)
        for (int i = 0; i < threed.length; i++) {
            // System.out.println("Length of current row " + threed[i].length);
            // col (y axis)
            for (int j = 0; j < threed[i].length; j++) {
                // depth (z axis)
                for (int k = 0; k < threed[i][j].length; k++) {
                    System.out.print(threed[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
