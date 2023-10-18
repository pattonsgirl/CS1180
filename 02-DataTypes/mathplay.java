import java.lang.Math;

public class mathplay {
    public static void main(String[] args) {
        // declaring a variable to be a "final" means you will
        // get problems (errors) in your code if your code tries
        // to change the value.
        // Values that are static facts can be declared as finals
        // to prevent accidental changes
        String str1 = "midterm";
int go = 0;
while (go <= str1.length()) {
    System.out.println(go);  
    go++;
}
System.out.println(go);
int n = 4;
for (int i = 0; i <= n; i++) {
    System.out.print(i + " ");
}
String foo = "BuBbLeS";
//foo = Character.toString(Character.toLowerCase(foo.charAt(2)));
String str2 = "Hello world";
String str3 = "Hello world";
System.out.println(str2.compareTo(str3));
//if (str2.compareTo(str3)){
//    System.out.print("The strings are equal!");
//}
char bar;
bar = Character.toLowerCase(foo.charAt(2));
System.out.println(bar);
        final double pi = 3.14159;
        double grav = 9.8;
        //System.out.print(0/0);
        // if pi is a final, this becomes an invalid statement
        // since the value of pi cannot be changed.
        // pi = 5;
        // this will work since grav is not a final
        // grav = 55;

        // Common Math class functions:
        // Math.pow(x, y) - calculate x to the power of y
        // Math.abs(x) - get absolute value of x
        // Math.sqrt(x) - get the square root of x
        double result = Math.sqrt(pi);
        System.out.println(result + "\n");
        System.out.println(Math.pow(2, 3));

        // distance equation
        // - calculate distance between two points
        // distance = square root of (x1 + x2 squared) + (y1 + y2 squared)
        double x1 = 0.0;
        double x2 = 0.0;

        double y1 = 2.0;
        double y2 = 2.0;

        // store result of (x1 + x2) squared
        double temp1 = Math.pow(x1 - x2, 2);
        // store result of (y1 + y2) squared
        double temp2 = Math.pow(y1 - y2, 2);
        // calculate distance between two points
        double distance = Math.sqrt(temp1 + temp2);

        // This also works, but it can get "messy" to look at
        double otherway = Math.sqrt((Math.pow(x1 + x2, 2)) + (Math.pow(y1 + y2, 2)));
        System.out.printf("%.2f is the same as %.2f", distance, otherway);
    }
}
