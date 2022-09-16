public class breakcontinue {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; ++i) {
            System.out.println(i);
            if (i == 7) {
                System.out.println("i equals 7!");
                continue;
            }
            System.out.println("Yippeee!!!");
        }
        System.out.println("And we're moving along... ");
    }
}
