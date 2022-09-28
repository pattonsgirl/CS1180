
public class charops {
    public static void main(String[] args) {
        String potato = "H3ll0 2 m3";

        // Goal: check if there is a digit in the string

        int plength;
        // get the length of the string
        plength = potato.length();
        // length is now known, we can iterate for the length of the string
        // explore, what is potato.charAt(plength)?
        // What does this tell you about number of iterations?
        // String is an array that starts at 0, I am starting index at 0
        for (int i = 0; i < plength; i++) {
            // debugging: print each value at each position in the String potato
            System.out.println(potato.charAt(i));
            // store the value in a temp char
            char current = potato.charAt(i);
            // the below would also be a valid if, but starts to get chunky
            // if (Character.isDigit(potato.charAt(i))) {

            // If the character at the current position is a digit (0-9), do..
            if (Character.isDigit(current)) {
                System.out.println(current + " found at " + i);
            }

        }
    }
}
