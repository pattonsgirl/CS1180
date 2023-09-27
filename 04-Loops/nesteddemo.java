public class nesteddemo {
    public static void main(String[] args){
        // outer loop is "row"
        char letter = 'A'; // = 65;
        System.out.println("Character is" + letter);
        for (int i = 0; i < 5; i++) {
            letter = 65; // or letter = 'A'
            //System.out.println("i is: " + i);
            // inner loop is columns
            for (int j = 0; j <= i; j++) {
                //System.out.print(j + " ");
                //System.out.print("* ");
                System.out.print(letter + " ");
                //int userInput = (int)Math.pow((double)90, (double)2);
                //letter += userInput;
                letter += 1;
            }
            System.out.println();
        }
    }
}
