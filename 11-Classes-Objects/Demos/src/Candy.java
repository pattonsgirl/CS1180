import java.util.ArrayList;

public class Candy {

    // candy properties to be defined for each object
    // these properties CANNOT be directly accessed
    // setter / getter methods to set / get values
    // constructor sets default values of properties
    private String name;
    private boolean isTasty;
    private int quantity;
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

    // mutator == setter
    // modifies the object's quantity property based on parameter q
    // from another class, objectName.setQuantity(5);
    public void setQuantity(int q) {
        quantity = q;
    }

    // accessor == getter
    // gets the value of the object's quantity property and returns it
    public int getQuantity() {
        return quantity;
    }

    // setters and getters for other properties
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    // this would be an accessor method
    // This method is defined for objects created by this class
    // to call from another class, use objectName.print();
    public void print() {
        System.out.println(name + ": " + quantity + " " + isTasty);
    }

}
