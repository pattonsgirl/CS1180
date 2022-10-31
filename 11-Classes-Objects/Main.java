// this should be done in a package, as in "Create a Java Project"
// if you are not in a project, here are steps to get this to work:

/*
 * 1. Open a terminal
 * 2. Go to folder with your source code (.java files)
 *  > cd 11-Class-Objects
 * 3. Compile class files
 *  > javac classesbasics.java
 * 4. Run Main class
 *  > java Main.java
 */

public class Main {
    public static void main(String[] args) {
        classesbasics obj = new classesbasics();

        obj.printme();
    }
}
