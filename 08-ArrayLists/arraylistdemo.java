import java.util.*;

public class arraylistdemo {
    public static int findMax(ArrayList<Integer> passed) {
        int size = passed.size();
        int max = passed.get(0);
        for (int i = 0; i < size; i++) {
            if (passed.get(i) > max) {
                max = passed.get(i);
            }
        }
        return max;
    }

    public static void printAL(ArrayList<Integer> passed) {

        for (int num : passed) {
            System.out.print(num + " "); // prints value
        }
        System.out.println();
    }

    // method overloading DID NOT work for this case
    // Suspicion: it sees ArrayList as a type, and does not "see"
    // the object type of the ArrayList as a difference
    public static void printStrAL(ArrayList<String> passed) {

        for (String str : passed) {
            System.out.print(str + " "); // prints value
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // int[][][] narray = new int[3][4][7];
        // unlike an array, an ArrayList can change size (remove or expand)
        ArrayList<Integer> potato = new ArrayList<Integer>();
        potato.add(42);
        potato.add(555);
        potato.add(444);
        potato.add(12);
        potato.add(34);

        // use scanner to add values
        System.out.println("How many more values?");
        int morevals = scnr.nextInt();
        for (int i = 0; i < morevals; i++) {
            potato.add(scnr.nextInt());
        }

        // retrieve value at index 2
        System.out.println(potato.get(2));

        // sort in ascending ("natural") order
        potato.sort(Comparator.naturalOrder());

        // print contents of ArrayList
        for (int i = 0; i < potato.size(); i++) {
            System.out.print(potato.get(i) + " ");
        }
        System.out.println();
        // print contents of ArrayList using for-each loop
        for (int num : potato) {
            System.out.print(num + " "); // prints value
        }

        // add value "2" to end of ArrayList (grow size)
        potato.add(2);

        // remove "2" from ArrayList by index
        potato.remove(potato.indexOf(2));

        // pass ArrayList by reference to method
        // this does mean method can access values in ArrayList
        printAL(potato);

        // at index 1, set value to "2"
        potato.set(1, 2);
        printAL(potato);

        // NOTE: max could also be found after sorting ArrayList
        // min = index 0, max = size of ArrayList - 1
        int val = findMax(potato);

        System.out.println(val);

        // sort an ArrayList of strings
        ArrayList<String> listOfCountries = new ArrayList<>();
        listOfCountries.add("India");
        listOfCountries.add("US");
        listOfCountries.add("China");
        listOfCountries.add("Denmark");

        Collections.sort(listOfCountries);

        for (String word : listOfCountries) {
            System.out.print(word + " "); // prints value
        }

        Collections.sort(listOfCountries, Comparator.reverseOrder());

        for (String word : listOfCountries) {
            System.out.print(word + " "); // prints value
        }

    }
}
