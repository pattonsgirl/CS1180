
public class charops {
    public static void main(String[] args) {
        String potato = "H3ll0 2 m3";

        // check if there is a digit in the string
        int plength;
        plength = potato.length();
        for (int i = 0; i < plength; i++) {
            System.out.println(potato.charAt(i));
            char current = potato.charAt(i);
            if (Character.isDigit(current)) {
                System.out.println(current + " found at " + i);
            }

        }
    }
}
