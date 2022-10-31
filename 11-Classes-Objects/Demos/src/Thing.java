public class Thing {
    private int size;
    private String name;

    public Thing() {
        size = -1;
        name = "NoName";
    }

    public void print() {
        System.out.println("This is from print in Thing class!");
        System.out.println(name + " is of size " + size);
    }
}
