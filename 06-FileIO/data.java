import java.util.Scanner;
import java.io.FileInputStream;

public class data {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("data.txt");
        Scanner file_scnr = new Scanner(fis);

        int sum = 0;
        //count how lines I've read
        //int num1 = file_scnr.nextInt();
        while (file_scnr.hasNext()) {
            sum = sum + file_scnr.nextInt();
            // increment counter
        }

        System.out.println(sum);

        file_scnr.close();
        fis.close();

    }
}
