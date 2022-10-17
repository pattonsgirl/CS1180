public class multiarrays {
    public static void main(String[] args) {
        int[] temps = { 23, 45, 67, 90, 90, 12, 67 };
        String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };

        for (int i = 0; i < temps.length; i++) {
            System.out.println(days[i] + " high is " + temps[i]);
        }

        // create new array
        int[] lows = new int[temps.length];

        for (int i = 0; i < temps.length; i++) {
            lows[i] = temps[i] - 10;
        }

    }
}
