
//import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map.Entry;

public class hashmapdemos {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // hashmap is a set of key value pairs
        // Below sets a HashMap with keys of type String
        // and values of type Integer
        HashMap<String, Integer> languages = new HashMap<>();

        // put puts a new key pair in HashMap if key does not exist
        // if key does exist, overwrites with new value
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        // overwrites 3 with 42 at key "Python"
        languages.put("Python", 42);
        // only puts if key does not exist
        languages.putIfAbsent("Python", 5);
        languages.put("C", 3);
        languages.put("C++", 3);
        languages.put("Scala", 3);
        languages.put("Ruby", 4);
        languages.put("PHP", 9);
        languages.put("C#", 15);

        // with HashMaps, can't acces by index - use keys to access values
        System.out.println(languages.get("C"));

        System.out.println("Change value for Java: ");
        // int userint = scnr.nextInt();
        // replace replaces if key exists, else nothing
        languages.replace("Java", scnr.nextInt());

        // printing HashMaps
        // print set of all keys
        System.out.println("Key set" + languages.keySet());
        // print set of all values
        System.out.println(" Value set" + languages.values());
        // print kay/value mappings
        System.out.println("Key/Value mappings: " + languages.entrySet());

        // iterate through key/value entries using Map.Entry
        System.out.print("\nEntries: ");
        for (Entry<String, Integer> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        // store key set into an ArrayList using a for-each loop
        ArrayList<String> lkeys = new ArrayList<>();
        // lkeys = languages.keySet();
        System.out.print("Store keys in an ArrayList: ");
        for (String key : languages.keySet()) {
            lkeys.add(key);
        }

        // print ArrayList
        for (String word : lkeys) {
            System.out.print(word + " "); // prints value
        }

        System.out.println();

        scnr.close();
    }
}
