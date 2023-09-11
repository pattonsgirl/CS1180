import java.util.Scanner;

public class overview {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Hello");
        System.out.print(" my name is\n");
        System.out.print("Kayleigh");

        String myName = "Kayleigh duncan";
        //int myName = 0;
        int myNum = 0; 
        System.out.println(myName);

        Scanner sc = new Scanner(System.in);
        //myName = sc.nextLine();
        myNum = sc.nextInt();
        sc.close();
        //myNum = sc.nextInt();
        //System.out.println(myName);
        //myName = myName + myName;
        double result = Math.pow((double)myNum, (double)2);
        System.out.printf("The result of %d to the pow of 2 is %.0f%n%n", myNum, result);

        int bigNum = 10000;
        long biggerNum = 99999999; //999999990000

        long op_result = bigNum * biggerNum;

        System.out.println(op_result);

        //compound operators
        int bananas = 8;
        bananas += bananas;

        System.out.println(bananas);





    }
}
