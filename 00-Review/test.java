import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static int mathy(int a) {
        return (int) Math.pow((double) a, 5.0);
    }

    public static double mathy(double a) {
        return Math.pow(a, 5.0);
    }

    public static void foo(int[] a) {
        // add 5 to value at each index
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 5;
        }
    }

    public static void main(String[] args) {
        int[] bar = { 1, 2, 3 };
        bar[0] = bar[1] + 5;
        foo(bar);
        bar[2] = bar[0] + 2;
        for (int i = 0; i < bar.length; i++) {
            System.out.println(bar[i]);
        }

        int foo = -9;
        int bar2 = 10;
        if (foo > 0 && bar2 > 11) {
            System.out.println("Apples");
        } else if (foo == 0 || bar2 > 20) {
            System.out.println("Bananas");
        } else {
            System.out.println("Carrot");
        }

        ArrayList<Train> sodor = new ArrayList<Train>();
        sodor.add(new Train());
        sodor.add(new Train("Gordon", 80, 440));
        sodor.add(new Train("Percy", 3, 50));
        sodor.add(new Train("Henry", 0, 12));
        for (Train t: sodor) {
            System.out.println(t);
        }
        Collections.sort(sodor);
        for (Train t: sodor) {
            System.out.println(t);
        }
    }
}
