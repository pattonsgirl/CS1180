import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class awaldemo {

    /**
     * Prints an array to standard out
     * 
     * @param list an array of integers
     */
    public static void printer(int[] list) {
        for(int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("data.txt");
        Scanner in_fis = new Scanner(fis);

        // TODO what about arrays?

        int[] nums; // WHAT ABOUT SIZE = new int[];
        int lines_in_file = 0;
        while(in_fis.hasNext()) {
            lines_in_file++;
            in_fis.nextInt();
        }
        System.out.println("Number of lines in file: " + lines_in_file);
        nums = new int[lines_in_file];

        ArrayList<Integer> alnums = new ArrayList<Integer>();

        in_fis.close();
        fis.close();

        fis = new FileInputStream("data.txt");
        in_fis = new Scanner(fis);

        int index = 0;
        while(in_fis.hasNext()) {
            int currentnum = in_fis.nextInt();
            // add to nums arrays
            nums[index] = currentnum;
            index++;
            // add to ArrayList
            alnums.add(currentnum);
        }

        printer(nums);
        Object[] was_an_AL = new Object[alnums.size()];
        was_an_AL = alnums.toArray();
        // TODO: EITHER turn this into an int array OR make an 
        //      overloaded method that handles ArraysLists
        //printer(was_an_AL);
    }
}
