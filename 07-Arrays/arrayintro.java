public class arrayintro {

    /**
     * TODO: print array
     * @param args
     */
    public static void printArray(int[] aa) {
        for (int a: aa) {
            System.out.print(a + "\t");
        }
        aa[1] = 42;
    }

    public static void printArray(char[] aa) {
        for (int a: aa) {
            System.out.print(a + "\t");
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, 9, 10, 12, 90, 45, 23, 89, 12};
        int[] nums_other = new int[4];
        String[] play = {"hello", "play", "this is a larger phrase"};
        String[] breaker = play[2].split(" ");
        System.out.println(breaker);

        System.out.println("The data stored in nums array is: ");
        printArray(nums);

        char[] word = new char[breaker[4].length()];
        // TODO: break vlaue at breaker index 4 into char array
        for (int i = 0; i <= word.length - 1; i++){
            //word = breaker[4];
            word[i] = breaker[4].charAt(i);
        }

        for (char ch: word) {
            System.out.print(ch);
        }
        System.out.println();


        System.out.println("The third number, but 2nd index is: " + nums[2]);

        //System.out.println(nums.length);
        
        for(int i = 0; i <= breaker.length - 1; i++) {
            System.out.print(breaker[i] + "\t");
        }
        System.out.println();
        //int num = 0;        
        for (int num: nums) {
            System.out.print(num + "\t");
        }
    }
}