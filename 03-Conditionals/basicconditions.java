public class basicconditions {
    public static void main(String[] args) {
        boolean isCorrect = true;
        int num1 = 44;
        int num2 = 2;

        isCorrect = (num1 < num2);
        isCorrect = (num1 != num2);
        isCorrect = (num1 == num2);
        num1 = 2;
        isCorrect = (num1 <= num2);
        isCorrect = (num1 >= num2);
        num1 = 3;
        isCorrect = (num1 > num2);
        isCorrect = (num1 == num2) || (num1 < num2);
        isCorrect = (num1 != num2) && (num1 < num2);

        System.out.println("The answer is correct: " + isCorrect);

        boolean isRaining = true;
        boolean isCloudy = true;

        if (isRaining) {
            System.out.println("You should have brought an umbrella");
        } else if (isCloudy) {
            System.out.println("It is cloudy");
        } else {
            System.out.println("No rain today!");
        }
        System.out.println("more code carries on here...");

    }
}
