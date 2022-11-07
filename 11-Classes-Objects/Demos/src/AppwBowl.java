import java.util.*;

public class AppwBowl {
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

        // TODO: make a Bowl class method that does this
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

        // print contents of bowl's candies
        // this returns the reference to bowl1's arraylist of candies
        // which is now also referred to by bowlCandies
        ArrayList<Candy> bowlcandies = bowl1.getCandies();
        System.out.println("Bowl of candies contains: ");
        // candyList.size();
        for (Candy c : bowlcandies) {
            System.out.println(c);
        }

        // make a Bowl class method that prints out candies for a Bowl object
        bowl1.getBowlCandies();

        // Bowl class can have static methods that are passed objects
        Bowl.getCandies(bowl1);

        // remove a candy from bowl object's arraylist by index
        bowl1.eatCandy(1);
        Bowl.getCandies(bowl1);
        // remove a candy from bowl object's arraylist by object
        System.out.println("Which candy are you eating?");
        Candy eatenCandy = new Candy();
        System.out.println("Candy name: ");
        eatenCandy.setName(scnr.next());
        System.out.println("Candy tasty value: ");
        eatenCandy.setIsTasty(scnr.nextBoolean());
        System.out.println("Candy package quantity");
        eatenCandy.setQuantity(scnr.nextInt());

        // approach 1 - find index of candy, remove it
        // int foundcandy = bowl1.findCandy();
        // approach 2 - pass eatCandy the object, make it the method's problem
        bowl1.eatCandy(eatenCandy);

    }
}
