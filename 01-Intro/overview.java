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
        myName = sc.nextLine();
        myNum = sc.nextInt();
        //System.out.println(myName);
        //myName = myName + myName;
        double result = Math.pow((double)myNum, (double)2);
        System.out.println(myNum);


    }
}
