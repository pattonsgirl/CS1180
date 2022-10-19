public class multiarrays {
    public static void main(String[] args) {
        // multi-array is the idea that two arrays have connected data
        // in this example, an array of high temps for a day of the week
        // and an array of days of the week
        int[] temps = { 23, 45, 67, 90, 90, 12, 67 };
        String[] days = { "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun" };

        for (int i = 0; i < temps.length; i++) {
            System.out.println(days[i] + " high is " + temps[i]);
        }

    }
}
