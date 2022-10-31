import java.util.ArrayList;

public class classesbasics {
    private int var1;
    private String str;
    private ArrayList<Integer> ilist;

    public classesbasics() {
        var1 = 0;
        str = "Foo";
        ilist = new ArrayList<>();
    }

    public void printme() {
        System.out.println("Printing from public method in class!");
        System.out.println(str + ": " + var1);
    }
}