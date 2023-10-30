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
        // the small number we have "seen" AND the index of that smallest number
        int current_smallest = nums[0];
        int smallest_index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < current_smallest){
                //System.out.println(nums[i]);
                // capture smallest value
                // i is idex where it was found
                current_smallest = nums[i];
                smallest_index = i;
            }
            System.out.println(current_smallest);
        }
        // take what was in that postion where the smallest number was
    }
}
