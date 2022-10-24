
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class cliargs {
    // result = addnum(args[1], args[2]);
    public static int addnum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(args));
        // what argument whould be the filename?

        FileInputStream fileByteStream = new FileInputStream(args[0]); // File input stream
        Scanner inFS = new Scanner(fileByteStream);

        int numelements = inFS.nextInt();
        int[] potato = new int[numelements];
        int i;

        for (i = 0; i < numelements; i++) {
            potato[i] = inFS.nextInt();
            // System.out.println(potato[i]);
        }

        inFS.close();
        fileByteStream.close();

        System.out.println(Arrays.toString(potato));

        int result;
        result = addnum(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println("args added together are: " + result);
    }
}
