public class arrays {
    public static void main(String[] args) {
        // char[] name = 'H','e','l';
        // dataType[] arrayName = new dataType[numElements];
        int[] nums = new int[5];

        nums[0] = 12;
        nums[1] = 42;
        nums[2] = 56;
        nums[3] = 7;
        nums[4] = 32;

        int[] newnums = { 12, 42, 56, 7, 32 };

        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }
    }

}
