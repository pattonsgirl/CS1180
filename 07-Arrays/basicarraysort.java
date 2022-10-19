public class basicarraysort {

    // TODO: method that prints value in an array
    public static void printArray(int[] values) {
        // print values array
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

    }

    // TODO: method that copies array and subtracts 10
    public static int[] createLows(int[] values, int reduceBy) {
        int[] retArray = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            retArray[i] = values[i] - reduceBy;
        }

        return retArray;
    }

    public static void main(String[] args) {
        int[] temps = { 23, 45, 67, 90, 90, 12, 67 };
        String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };

        System.out.println("Values in temps array: ");

        // calling print array method
        printArray(temps);

        // create new array of low temps
        // assume low temps = values in temps - 10
        System.out.println("Creating lows array based on values in temps array");

        int[] lows = new int[temps.length];
        // int val = add(4,5);
        lows = createLows(temps, 20);

        System.out.println("Values in lows array pre-sort: ");
        printArray(lows);

        // sort lows in ascending order

        // set up iterators, lowest placeholder, temp value placeholder for swap
        int lowest = 0;
        int i = 0, j = 0;
        int temp = 0;
        // after each iteration, the lowest value will have moved to the "front"
        // think shrinking the "search space" of unsorted numbers
        for (i = 0; i < lows.length; i++) {
            // the lowest number we have seen is the first value in the array
            lowest = lows[i];
            // loop through rest of array to check for lower values
            // lows[i] was lowest, so see if there is anything lower (but don't)
            // recheck [i], look at [i+1] and after
            for (j = i + 1; j < lows.length; j++) {
                // check if index value at j is less than lowest known
                // swap "first" index with value at index of lowest value
                if (lows[j] < lowest) {
                    temp = lows[i];
                    lows[i] = lows[j];
                    lows[j] = temp;
                    // without swapping, can't just "print" in sorted order
                    // System.out.print(lows[j]);
                }
            }
        }

        System.out.println("Values in lows array post-sort: ");

        printArray(lows);

    }
}
