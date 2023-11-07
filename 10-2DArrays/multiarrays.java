public class multiarrays {
    public static void main(String[] args) {
        int[][] weather = new int[2][3];

        weather[0][0] = 45;
        weather[1][0] = 98;
        weather[2][0] = 54;
        int[][] nums = {
            {0, 6, 5 ,7, 9},
            {2, 3, 4, 5, 89},
            {3, 4, 6, 7, 67},
        };

        int rows = 0;
        int cols = 0;
        rows = nums.length;
        cols = nums[0].length;
        
        // for (int[] row: nums)
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                System.out.println(nums[y][x]);
            }
        }

        
    }
}
