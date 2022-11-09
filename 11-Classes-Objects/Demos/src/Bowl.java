import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bowl {
    private String location;
    private ArrayList<Candy> candies;

    public Bowl() {
        location = "None";
        // needed to create a new blank candy list
        candies = new ArrayList<Candy>();
    }

    public Bowl(String location) {
        this.location = location;
        // needed to create a new blank candy list
        candies = new ArrayList<Candy>();
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return String
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @param c
     */
    public void addCandy(Candy c) {
        this.candies.add(c);
    }

    /**
     * @return ArrayList<Candy>
     */
    public ArrayList<Candy> getCandies() {
        // ArrayList<Candy> theseCandies = new ArrayList<Candy>();
        return candies;
    }

    public void getBowlCandies() {
        for (Candy c : this.candies) {
            System.out.println(c);
        }
    }

    /**
     * @param b
     */
    public static void getCandies(Bowl b) {
        for (Candy c : b.candies) {
            System.out.println(c);
        }
    }

    /**
     * @param candyIndex
     */
    public void eatCandy(int candyIndex) {
        candies.remove(candyIndex);
    }

    /**
     * @param c
     */
    public void eatCandy(Candy c) {
        // TODO: get fancy - verify the candy exists before removing it
        boolean candyEaten = false;
        for (Candy eachcandy : candies) {
            if (eachcandy.equals(c)) {
                System.out.println("Nom nom");
                candyEaten = true;
                candies.remove(c);
            }
        }
        if (!candyEaten) {
            System.out.println("Candy not in bowl");
        }
        // candies.remove(c);
    }

    public static void setLocal() {
        // this. // can ono longeer access object private fields
    }

    public void sortCandies() {
        // nice little debug / confirmation that I got this far
        System.out.println("Sorting candies!");
        // import Collections in Bowl
        // calling sort on ArrayList of Candy objects
        // sort will see if Candy has compareTo method
        Collections.sort(this.candies);
    }
}