public class copyarray {

    public static void main(String[] args) {
        int[] temps = { 23, 45, 67, 90, 90, 12, 67 };
        String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };

        for (int i = 0; i < temps.length; i++) {
            System.out.println(days[i] + " high is " + temps[i]);
        }

        int[] lows = new int[temps.length];
        // to COPY an array, take values at index of orginal array, store in
        // corresponding index of new array
        // COPY is also used to create an array with modifications.
        // sample below take value from original array, reduces by value,
        // saves result to new array
        for (int i = 0; i < temps.length; i++) {
            lows[i] = temps[i] - 10;
        }

    }
}
