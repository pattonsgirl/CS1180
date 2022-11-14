import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        // memory jog on HashMaps -
        // https://github.com/pattonsgirl/CS1180/tree/main/09-HashMaps
        System.out.println("Hello, World!");
        Book booky = new Book();
        Book mybook = new Book("Book Title", 1998);
        // proving that println uses toString method declared in Object class (if it
        // exists)
        System.out.println(booky);
        System.out.println(mybook);

        // goofing off with generating hashCodes of Strings
        // if two object generate the SAME hashCode, then the object ARE THE SAME
        // a hashCode is generated from an object
        // the hashCode CANNOT recreate the object - calculation is one way
        // checkout hasCode return value here:
        // https://www.programiz.com/java-programming/library/string/hashcode
        String str1 = "George";
        String str2 = "George of the Jungle";
        String str3 = "George";

        System.out.println("hashCode of " + str1 + " is: " + str1.hashCode());
        System.out.println("hashCode of " + str2 + " is: " + str2.hashCode());
        System.out.println("hashCode of " + str3 + " is: " + str3.hashCode());

        // Using a HashMap to track who has checked out a given book
        // This assumes there is only ONE copy of a given book
        // Otherwise a Book would NOT make a good KEY
        // The String name of a person who checked out the book is the VALUE
        // associated with the key
        HashMap<Book, String> checkout = new HashMap<>();

        checkout.put(mybook, "Janet");
        Book cheese1 = new Book("Cheese", 2001);
        Book cheese2 = new Book("Cheese", 1984);
        checkout.put(cheese2, "Bob");
        checkout.put(cheese1, "Sam");
        checkout.put(new Book("1984", 1949), "George");
        checkout.put(cheese1, "Billy");

        // I added a print statement to my hashCode generator for Book objects
        /*
         * System.out.println(booky.hashCode());
         * System.out.println(cheese1.hashCode());
         * System.out.println(cheese2.hashCode());
         */
        // String myCode = Integer.toString(cheese2.hashCode());
        System.out.println(checkout.get(cheese1));
        System.out.println(checkout.get(new Book("Cheese", 2001)));
        System.out.println(checkout.get(new Book("1984", 1949)));

        // what if you wanted to have users be keys, and the Books (multiple)
        // they check out be the value?
        HashMap<String, ArrayList<Book>> usercheckout = new HashMap<>();
        // TODO: if I choose this route, the hashCode will generate from
        // String.hashCode (not from Book)

    }
}
