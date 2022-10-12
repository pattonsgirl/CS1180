
// use Scanner methods using file as stream
import java.util.Scanner;
// simplify imports:
import java.io.*;

public class numsum-throws {
    // new thing: "throws IOException"
    // to handle exceptions if file not found / cannot be opened
    // will not compile if exception handling is not included here
    // OR in a try / catch
    public static void main(String[] args) throws IOException {
        // TODO: use try catch block instead of `throws`
        FileInputStream fileByteStream = new FileInputStream("06-FileIO/numdata.txt"); // File input stream
        Scanner inFS = new Scanner(fileByteStream);

        FileOutputStream fileOutStream = new FileOutputStream("06-FileIO/sum.txt");
        PrintWriter outFS = new PrintWriter(fileOutStream);

        // read from file like you would from standard input (console)
        int num1 = inFS.nextInt();
        int num2 = inFS.nextInt();
        int num3 = inFS.nextInt();

        // TODO: can we loop this? Poke at the hint:
        /*
         * while (inFS.hasNext()) {
         * 
         * }
         */

        int sum = num1 + num2 + num3;

        // print sum to standard output (console)
        System.out.println(sum);
        // print sum to file output stream
        outFS.println(sum);

        // close input file (done reading)
        fileByteStream.close();
        // close output file & the file Writer (done writing)
        outFS.close();
        fileOutStream.close();
    }
}
