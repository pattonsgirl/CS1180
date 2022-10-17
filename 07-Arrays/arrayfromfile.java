import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class arrayfromfile {
    public static void main(String[] args) throws IOException {
        // open file for reading
        // Read file input into array
        // Add numbers in array together
        // Output sum to file

        FileInputStream fileByteStream = new FileInputStream("07-Arrays/numdata.txt"); // File input stream
        Scanner inFS = new Scanner(fileByteStream);

        FileOutputStream fileOutStream = new FileOutputStream("07-Arrays/output.txt");
        PrintWriter outFS = new PrintWriter(fileOutStream);

        // TODO: logic here
        // = new int[5];

        int numelements = inFS.nextInt();
        int[] potato = new int[numelements];
        int i;

        for (i = 0; i < numelements; i++) {
            potato[i] = inFS.nextInt();
            // System.out.println(potato[i]);
        }

        // "convert" array to String to print all values in array
        System.out.print("All values in potato: " + Arrays.toString(potato));

        int sum = 0;

        for (i = 0; i < numelements; i++) {
            sum += potato[i];
            // System.out.println(potato[i]);
        }

        outFS.println("The sum of the data is: " + sum);

        inFS.close();
        // close input file (done reading)
        fileByteStream.close();

        // close output file & the file Writer (done writing)
        outFS.close();
        fileOutStream.close();

    }
}
