public class nesteddemo {
    public static void main(String[] args){
        // standard intro
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // prints a cube
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // prints a triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();

        // prints an upside down triangle
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Prints a triangle of characters
        char letter = 'A'; // = 65;
        System.out.println("Character is " + letter);
        for (int i = 0; i < 5; i++) {
            letter = 65; // or letter = 'A'
            // inner loop is columns
            for (int j = 0; j <= i; j++) {
                System.out.print(letter + " ");
                letter += 1;
            }
            System.out.println();
        }
    }
}
