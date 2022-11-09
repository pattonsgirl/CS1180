import java.util.*;

public class AppwSortCandy {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Where is the bowl going?");
        String bowlname = scnr.nextLine();

        Bowl bowl1 = new Bowl(bowlname);

        // TODO: create a menu system that lets a user:
        // p - print candies in bowl
        // e - eat a candy (then eat by number or by description)
        // a - add a number of candies to bowl
        // Challenge: allow users to swap between bowls

        System.out.println("How many candies are we adding to bowl in " + bowl1.getLocation());
        int iterations = scnr.nextInt();

        System.out.println("Add candy to a bowl \nGive me a name, true false if tasty, and a quantity in the package");

        // Loop and get candy descriptions from the user
        for (int i = 0; i < iterations; i++) {
            // create candy objects
            Candy nextCandy = new Candy();
            nextCandy.setName(scnr.next());
            nextCandy.setIsTasty(scnr.nextBoolean());
            nextCandy.setQuantity(scnr.nextInt());
            // add candy objects to Bowl
            bowl1.addCandy(nextCandy);
        }

        // Bowl class can have static methods that are passed objects
        Bowl.getCandies(bowl1);

        // remove a candy from bowl object's arraylist by index
        bowl1.eatCandy(1);
        Bowl.getCandies(bowl1);

        // TODO: Sort Candy in a Bowl

        // TODO: review the basics of compareTo & sort
        // sort is part of Collections. sort calls compareTo() for known objects

        // compare two Strings
        // compare two integers

    }
}
