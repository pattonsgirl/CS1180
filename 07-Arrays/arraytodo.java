public class arraytodo {
    // sort an array
    // multiple arrays
    // command line array (args)
    // shuffle an array
    public static void main(String[] args) {
        for(String word: args) {
            System.out.println(word);
        }
        //System.out.println(args[1]);

        int[] nums = {45, 89, 23, 90, 2, 3, 56};
        // TODO SORT IT
        // smallest goes to front
        int current_smallest = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < current_smallest){
                //System.out.println(nums[i]);
                current_smallest = nums[i];
            }
            System.out.println(current_smallest);
        }
        // take what was in that postion where the smallest number was
    }
}
