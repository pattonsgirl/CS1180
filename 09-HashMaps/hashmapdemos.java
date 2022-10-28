import java.util.*;

public class hashmapdemos {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        HashMap<String, Integer> languages = new HashMap<>();

        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        languages.putIfAbsent("Python", 5);
        languages.put("C", 3);
        languages.put("C++", 3);
        languages.put("Scala", 3);
        languages.put("Ruby", 4);
        languages.put("PHP", 9);
        languages.put("C#", 15);

        System.out.println(languages.get("C"));
        System.out.println(languages.keySet());
        ArrayList<String> lkeys = new ArrayList<>();
        // lkeys = languages.keySet();
        System.out.print("Store keys in an ArrayList: ");
        for (String key : languages.keySet()) {
            // System.out.print(value);
            // System.out.print(", ");
            lkeys.add(key);
        }

        for (String word : lkeys) {
            System.out.print(word + " "); // prints value
        }

        System.out.println();

        System.out.println("Rank for Java: ");
        int userint = scnr.nextInt();
        languages.replace("Java", scnr.nextInt());
        System.out.println(languages.values());

        scnr.close();
    }
}
