public class conditions {
    public static void main(String[] args){
        boolean myBool = 7 != 7;
        myBool = Character.isDigit('9');
        //myBool = false;

        if ( 5 < 7 && !(4 > 8) ) {
            System.out.println("This now prints");
        }

        System.out.println(myBool);

    }
}
