public class ternarydemo {
    public static void main(String[] args) {
        int x=0,y=6;
        //x = 0;
        //y = 0;

        // condition -> (x<20)
        // value of y is set based on condition
        if (x < 20) {
            y = x; //x is value of y when condition is true
        }
        else {
            y = 20; //20 is value of y when condition is false
        } 
        // WRONG: (x < 20) ? y = x : y = 20;
        y = (x < 20) ? x : 20;

        System.out.println("Value of y: " + y);
    }
}
