public class outputformat {
    public static void main(String[] args) {
        // printf allows for output formatting
        // printf needs at least one argument - the string to print
        // additional arguments are variable values

        double sillyNum = 4.1212389238;
        // This prints out the whole value.
        System.out.println("My silly number is: " + sillyNum);
        // printf let's out restrict the precision
        System.out.printf("sillyNum is %.2f%n", sillyNum);
        // %f says a double will go here. Which double?
        // That's an argument I specify after my String
        System.out.printf("sillyNum is %.2f.  Isn't %.4f a funny number?%n", sillyNum, sillyNum);
        // In each spot with %f, I need to say what variable to replace
        // it with, in order
        // %f = float or double, %i OR %d = integer, %s = String, %c = character
        int newNum = 89;
        System.out.printf("sillyNum is %.2f.  newNum is %d%n", sillyNum, newNum);
        // in %.xy x says how many decimal places of precision, y says data type

        // How about a table of values... something clean?
        String name1 = "Jack";
        String name2 = "Sally";
        int age1 = 55;
        int age2 = 67;
        // Printing out column headers.
        // Being lazy and not storing "NAME" and "AGE" in variables
        // But they are still strings (thus the %s)
        System.out.printf("%-8s | %4s\n", "NAME", "AGE");
        // Use 8 spaces (slots) to print name1 ("Jack"). Justify left (-8)
        // Use 4 spaces (slots) to print age1 (55). Justify right (4)
        System.out.printf("%-8s | %4d\n", name1, age1);
        System.out.printf("%-8s | %4d\n", name2, age2);
        // Use 8 spaces (slots) to print name2 ("Sally"). Justify right (8)
        // Use 4 spaces (slots) to print age2 (67). Justify left (-4)
        System.out.printf("%8s | %-4d\n", name2, age2);
        System.out.printf("%8s | %-4d\n", name1, age1);

    }
}
