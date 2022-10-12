
// use Scanner methods using file as stream
import java.util.InputMismatchException;
import java.util.Scanner;
// simplify imports:
import java.io.*;

/*
 * See ZyBook 8.4 for more samples
 */

public class numsumtrycatch {
    public static void main(String[] args) {
        // if try/catch, need to declare pre-try catch to keep scope
        FileInputStream fileByteStream = null;
        // Scanner inFS = null;
        FileOutputStream fileOutStream = null;
        PrintWriter outFS = null;
        int num1 = 0, num2 = 0, num3 = 0, sum = 0;

        // try opening input file
        // output file will /usually/ be fine, if you can remember where you put it ;)
        // inFS is opened within the try-with-resources statement so that numdata.txt
        // is closed after the try block exits. outFS is opened within the try
        // block so the finally block can use outFS.
        try (Scanner inFS = new Scanner(new FileInputStream("06-FileIO/numdata.txt"))) {
            outFS = new PrintWriter(new FileOutputStream("06-FileIO/sum.txt"));
            // these could throw InputMismatchException, adding as thing to catch
            // Add first num to sum (sum was initialized to 0)
            sum += inFS.nextInt();
            sum += inFS.nextInt();
            sum += inFS.nextInt();

        } catch (FileNotFoundException e) {
            System.out.println("A problem occured with opening your input or output file");
            System.out.println("Check the path to the file (and subfolder folder)");
        } catch (InputMismatchException e) {
            System.out.println("File contained unexpected data type.");
        }
        // The finally block writes the sum to the output file and closes the file.
        finally {
            // if outFS did not hit exception (is not null)
            if (outFS != null) {
                outFS.println(sum);
                // close output file & the file Writer (done writing)
                outFS.close();
            }
        }
        System.out.println("You made it to the end!  Goodbye.");
    }
}
