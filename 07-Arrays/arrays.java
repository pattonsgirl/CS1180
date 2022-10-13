import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // char[] name = 'H','e','l';
        // dataType[] arrayName = new dataType[numElements];
        int[] nums = new int[10];

        nums[0] = 12;
        nums[1] = 42;
        nums[2] = 56;
        nums[3] = 7;
        nums[4] = 32;
        nums[5] = 12;
        nums[6] = 42;
        nums[7] = 56;
        nums[8] = 7;
        nums[9] = 32;

        int[] newnums = { 12, 42, 56, 7, 32 };
        System.out.print("All nums in newnums: " + Arrays.toString(newnums));

        System.out.print(newnums[3]);
        int size = nums.length;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
