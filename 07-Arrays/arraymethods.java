public class arraymethods {

    /**
     * printArray takes int array, prints value in array
     * returns void (nothing)
     * 
     * @param values
     */
    public static void printArray(int[] values) {
        // print values array
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

    }

    /**
     * printArray takes String array, prints values in array
     * 
     * @param values
     */
    public static void printArray(String[] values) {
        // print values array
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    /**
     * createLows returns a new array of values by takes values from array
     * values and reducing them by reduceBy
     * 
     * @param values
     * @param reduceBy
     * @return int[]
     */
    public static int[] createLows(int[] values, int reduceBy) {
        int[] retArray = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            retArray[i] = values[i] - reduceBy;
        }

        return retArray;
    }

    /**
     * breakTemps DOES NOT RETURN AN ARRAY
     * it modifies the values of array stored at array "values"
     * and increases them by upBy
     * 
     * @param values
     * @param upBy
     */
    public static void breakTemps(int[] values, int upBy) {
        // int[] retArray = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + upBy;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] temps = { 23, 45, 67, 90, 90, 12, 67 };
        String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };

        // calling print array method
        printArray(temps);

        // calling breakTemps. It returns void (nothing)
        // it modifies values stored in memory, which is referenced by temps
        breakTemps(temps, 60);

        // proving values were changed
        printArray(temps);

        // create new array of low temps
        // assume low temps = values in temps - 10
        // createLows returns an address to an array
        // array needs to be created to store that address
        // can create array of a length, or just an array with a name
        int[] lows; // = new int[temps.length];
        lows = createLows(temps, 20);

        // proof lows can now access memory location where values where stored
        printArray(lows);

    }
}
