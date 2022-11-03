import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        // class Thing, object foo of type Thing
        Thing foo = new Thing();
        System.out.println("This is printing from main");
        // print is a public method within class Thing
        // foo.print();

        // object bar of type class Candy
        // Candy() is a constructor that initializes the object
        Candy bar = new Candy();
        // setName and print are public methods in class Candy
        bar.setName("Hershey");
        bar.print();

        // overloaded the contructor to define one that let the user declare property
        // values on initialization
        Candy potato = new Candy("KitKat", true, 1);
        potato.print();

        Store store1 = new Store("Totally Not Kroger");
        store1 = new Store("Other store");
        Bowl bowl1 = new Bowl("living room");

        ArrayList<Candy> candyList = new ArrayList<>();
        // read in candies from standard in
        Candy nextCandy = new Candy();
        System.out.println("Give me a name, true false if tasty, and a quantity in the package");
        nextCandy.setName(scnr.next());

        // TODO: loop and get 5 candy descriptions from the user

        // TODO: get Candy into Bowls OR Stores

    }
}
