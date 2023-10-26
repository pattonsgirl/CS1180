import java.util.ArrayList;
import java.util.Scanner;
public class aldemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println(nums.size());

        Scanner scnr = new Scanner(System.in);
        nums.add(scnr.nextInt());
        nums.add(scnr.nextInt());
        nums.add(scnr.nextInt());
        nums.add(scnr.nextInt());
        int prim = 90;
        System.out.println(nums.size());
        nums.add(prim);
        Integer num3 = 90;
        // prim. vs num3.

        System.out.println("Contents of my ArrayList: ");
        for (int num: nums) {
            System.out.print( num + " ");
        }
    }
}
