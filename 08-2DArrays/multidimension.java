public class multidimension {
    public static void main(String[] args) {
        int[][][] test = {
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

        System.out.println(test[0][1][1]);
        // test[1][2][0] = 42;
        System.out.println(test.length);
        System.out.println(test[0].length);
        System.out.println(test[0][0].length);
        // System.out.println(test[0][0].length);
        System.out.println(test[2][1][0]);
        test[2][1][0] = 42;
        System.out.println(test[2][1][0]);

    }
}
