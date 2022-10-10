
// use Scanner methods using file as stream
import java.util.Scanner;
// file input methods (to create file reading object / stream)
import java.io.FileInputStream;
// file output methods (to create file output object / stream)
import java.io.FileOutputStream;
// file write methods
import java.io.PrintWriter;
// handle exceptions if file not found / cannot be opened
import java.io.IOException;
// simplify imports:
//import java.io.*;

public class fileio {
    // new thing: "throws IOException"
    // to handle exceptions if file not found / cannot be opened
    // will not compile if exception handling is not included
    public static void main(String[] args) throws IOException {
        FileInputStream fileByteStream = new FileInputStream("readdata.txt"); // File input stream
        Scanner inFS = new Scanner(fileByteStream);

        FileOutputStream fileOutStream = new FileOutputStream("output.txt");
        PrintWriter outFS = new PrintWriter(fileOutStream);

        // read from file like you would from standard input (console)
        String str1 = inFS.nextLine();
        String str2 = inFS.nextLine();

        // print str1 to standard output (console)
        System.out.println(str1);
        // print str1 to file output stream
        outFS.println(str1);
        // print str2 to standard output (console)
        System.out.println(str2);
        // print str1 to file output stream
        outFS.println(str2);

        // close input file (done reading)
        fileByteStream.close();
        // close output file & the file Writer (done writing)
        outFS.close();
        fileOutStream.close();
    }
}
