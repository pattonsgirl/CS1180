public class App {
    public static void main(String[] args) throws Exception {
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
    }
}
