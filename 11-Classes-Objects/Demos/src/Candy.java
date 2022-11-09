import java.util.ArrayList;

public class Candy implements Comparable<Candy> {

    // candy properties to be defined for each object
    // these properties CANNOT be directly accessed
    // setter / getter methods to set / get values
    // constructor sets default values of properties
    private String name;
    private boolean isTasty;
    private Integer quantity;
    // object such as ArrayLists can be declared within a class object
    // private ArrayList<String> words;

    // default Candy constructor
    // in main, user did new Candy()
    public Candy() {
        this.name = "NoName";
        isTasty = false;
        quantity = 0;
    }

    // Candy constructor if user wants to define values on object creation
    public Candy(String name, boolean isTasty, int quantity) {
        // name holds the String the user passed
        // but the object property name is also name...
        // this. says use the object's property
        this.name = name;
        this.isTasty = isTasty;
        this.quantity = quantity;
    }

    /**
     * @param name
     * @param isTasty
     * @param quantity
     */
    public void setCandyProperties(String name, boolean isTasty, int quantity) {
        this.name = name;
        this.setName(name);
        this.isTasty = isTasty;
        this.quantity = quantity;
    }

    /**
     * @param q
     */
    // mutator == setter
    // modifies the object's quantity property based on parameter q
    // from another class, objectName.setQuantity(5);
    public void setQuantity(int q) {
        quantity = q;
    }

    /**
     * @return int
     */
    // accessor == getter
    // gets the value of the object's quantity property and returns it
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param n
     */
    // setters and getters for other properties
    public void setName(String n) {
        name = n;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param isTasty
     */
    public void setIsTasty(boolean isTasty) {
        this.isTasty = isTasty;
    }

    /**
     * @return boolean
     */
    public boolean getIsTasty() {
        return this.isTasty;
    }

    // this would be an accessor method
    // This method is defined for objects created by this class
    // to call from another class, use objectName.print();
    public void print() {
        System.out.println(name + ": " + quantity + " " + isTasty);
    }

    /**
     * @return String
     */
    public String toString() {
        return String.format("%s: %b - %d", this.name, this.isTasty, this.quantity);
        // return String.format("%s: %d in package. Tasty? %b\n", this.name,
        // this.quantity, this.isTasty);

    }

    /**
     * @param c
     * @return boolean
     */
    public boolean equals(Candy c) {
        // System.out.println("Comparing " + this + " to " + c);
        // Beware the String compare!
        // Note: this will not call .equals for this class - these are Strings
        boolean sameName = this.name.equals(c.name);
        // boolean sameName = this.name == c.name; // IS WRONG
        boolean sameIsTasty = this.isTasty == c.isTasty;
        boolean sameQuantity = this.quantity == c.quantity;
        if (sameName && sameIsTasty && sameQuantity) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Candy c) {
        // this will sort ASCENDING by default
        int isfirst = 0;
        isfirst = this.name.compareTo(c.name);

        // if strings are equal look at quantity
        if (isfirst == 0) {
            isfirst = this.quantity.compareTo(c.quantity);
        }

        return isfirst;

        // TODO: what if you you want descending?
        // if isfirst returned a negative int, return a postitive 1
        // if isfirst returned a positive int, return a negative 1
    }

}
