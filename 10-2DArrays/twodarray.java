public class twodarray {
    public static void main(String[] args) {
        int[][] base2d = new int[2][3];
        System.out.println(base2d.length);
        System.out.println(base2d[0].length);

        for (int i = 0; i < base2d.length; i++) {
            for (int j = 0; j < base2d[0].length; i++) {
                base2d[i][j] = 0;
            }
        }
    }
}
