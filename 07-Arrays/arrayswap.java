public class arrayswap {
    
    public static void printer(int[] list) {
        for(int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static int[] swapper(int[] list) {
        System.out.println("Original array: ");
        printer(list);
        int[] new_list = new int[list.length];
        int tmp = list[list.length-1];
        list[list.length-1] = list[0];
        list[0] = tmp;
        System.out.println("Ends swapped");
        printer(list);

        return new_list;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8};
        int[] new_nums = new int[nums.length];
        //new_nums = nums;
        // create a copy, not a reference to nums memory address
        for(int i = 0; i <nums.length; i++) {
            new_nums[i] = nums[i];
        }

        swapper(nums);
        System.out.println("Back in main, what is in array?");

        printer(nums);
        printer(new_nums);
    }
}
