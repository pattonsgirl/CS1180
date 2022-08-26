public class introvars {
    public static void main(String[] args) {
        // What is a variable?
        // datatype + name
        // a good variable name = remembering what it is for
        // Basic datatypes: int, double, String
        // int - whole number
        int num1 = 7;
        // double or float - hold decimals values
        double height = 6.7;
        // String = something in quotes
        String mystring = "My first string";

        System.out.println(mystring);
        // these examples use concatenation to play with formatted output
        // to print the value stored in a variable, use the variable name
        System.out.print(num1 + "\n");
        System.out.print("The height is:" + height + "\n");

        // Changing variable values (= new value OR = value stored in another variable)
        // once a variable exists you can change the value it stores,
        // as long as the type of data is the same
        height = 88.45;
        mystring = "The height is: ";
        System.out.println(mystring + height);
        double newheight = 66.7;
        height = newheight;
        System.out.println(mystring + height);

    }
}
