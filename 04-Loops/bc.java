public class bc {
    public static void main(String[] args){
        // while loop that print 0 to 10 BUT when 7 print lucky number!
        int num = 0;
        while (num < 11) {
            if (num == 7) {
                System.out.println("Lucky Number!");
                continue;
            }
            System.out.print(num + " ");
            num += 1;
        }
        System.out.println("In the escape zone");
    }
}
