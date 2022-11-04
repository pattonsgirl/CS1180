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
        System.out.println("How many candies will you describe?");
        int iterations = scnr.nextInt();
        System.out.println("Give me a name, true false if tasty, and a quantity in the package");

        // Loop and get candy descriptions from the user
        for (int i = 0; i < iterations; i++) {
            Candy nextCandy = new Candy();
            nextCandy.setName(scnr.next());
            nextCandy.setIsTasty(scnr.nextBoolean());
            nextCandy.setQuantity(scnr.nextInt());
            // creating a setCandyProperties method may be cleaners
            // nextCandy.setCandyProperties(scnr.next(), scnr.nextBoolean(),
            // scnr.nextInt());
            candyList.add(nextCandy);
        }
        System.out.println("Check out my candy info!");
        // candyList.size();
        for (Candy c : candyList) {
            // print method defined in Candy class
            // c.print();
            // created a toString method in Candy class
            // if method exists, will override stanard toString
            // which would print the reference to the object.
            System.out.println(c);
        }

        // print only tasty candies:
        System.out.println("According to me, tasty candies are:");
        for (Candy c : candyList) {
            // for each Candy object, get the value of the isTasty property
            if (c.getIsTasty() == true) {
                System.out.print(c);
            }
        }

        // Seeing if I have duplicate candies
        // get is returning a Candy object at that index
        for (int i = 0; i < candyList.size(); i++) {
            for (int j = i + 1; j < candyList.size(); j++) {
                // created an equals method in Candy class
                // checks if two Candy objects are equal
                if (candyList.get(i).equals(candyList.get(j))) {
                    System.out.println("Duplicate object is " + candyList.get(j));
                    // if there is a duplicate, remove it
                    candyList.remove(candyList.get(j));
                }
            }
        }

        // TODO: add ArrayList of Candy object into objects made from Bowl class

        // TODO: Let a user eat a Candy at an index - remove the Candy
        // object from the Bowl's ArrayList

    }
}
