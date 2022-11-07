import java.util.ArrayList;

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

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void addCandy(Candy c) {
        this.candies.add(c);
    }

    public ArrayList<Candy> getCandies() {
        // ArrayList<Candy> theseCandies = new ArrayList<Candy>();
        return candies;
    }

    public void getBowlCandies() {
        for (Candy c : this.candies) {
            System.out.println(c);
        }
    }

    public static void getCandies(Bowl b) {
        for (Candy c : b.candies) {
            System.out.println(c);
        }
    }

    public void eatCandy(int candyIndex) {
        candies.remove(candyIndex);
    }

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
}