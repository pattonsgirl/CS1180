import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * NOTE FROM INSTRUCTOR
 * This code was written in a NEW java project to help detangle file finding issues
 */

public class filecoi {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        // TODO: create a new file
        File file = new File("test.txt");
        /*if (file.createNewFile()){
            System.out.println("File created.");
        }*/
        file.createNewFile();
        
        //TODO: write text in file
        FileOutputStream fos = new FileOutputStream(file, false);
        PrintWriter file_out = new PrintWriter(fos);
        file_out.println("56\n67\n42\n12");
        file_out.close();
        fos.close();

        //TODO: open file, read in numbers, sum them, average them
        FileInputStream fis = new FileInputStream(file);
        Scanner file_scan = new Scanner(fis);

        int sum = 0;
        int nums_read = 0;
        while(file_scan.hasNext()) {
            sum += file_scan.nextInt();
            nums_read++;
        }
        file_scan.close();
        fis.close();

        double avg = (double)sum / (double)nums_read;
        System.out.println("The average of data in test.txt is " + avg);

    }
}
