public class basicconditions {
    public static void main(String[] args) {
        // a boolean can store one of two things:
        // true or false.
        // These values are not Strings, they are literals
        boolean isCorrect = true;
        int num1 = 44;
        int num2 = 2;

        // below are *relational* operators
        // using the boolean isCorrect to store whether the
        // result of the relational operation is true OR false
        isCorrect = (num1 < num2); // checks if less than
        isCorrect = (num1 != num2); // checks if NOT equal to
        isCorrect = (num1 == num2); // check if IS equal to
        num1 = 2;
        isCorrect = (num1 <= num2); // checks if is less than or equal to
        isCorrect = (num1 >= num2); // checks if is greater than or equal to
        num1 = 3;
        isCorrect = (num1 > num2); // checks if greater than

        // below mix *relational* operators with *logical* operators
        // logical operators allow us to string together multiple
        // conditions. Ex.
        // go to store and buy eggs OR milk
        // if you buy eggs or milk (or eggs and milk) you satisfied the logical
        // condition
        // go to store and buy eggs AND milk
        // if you buy ONLY milk or ONLY eggs, you failed the logical condition

        // for OR (||), if either (or both) relational operation is true
        // then the result is true
        isCorrect = (num1 == num2) || (num1 < num2);
        // for AND (&&), both relational operations must be true
        // if either or both operations are false, then the result is false
        isCorrect = (num1 != num2) && (num1 < num2);

        System.out.println("The answer is correct: " + isCorrect);

        boolean isRaining = true;
        boolean isCloudy = true;

        /*
         * basic if / else if / else syntax
         * if (thing to check) {
         * if thing was true, do things in here
         * }
         * else if (next thing to check) {
         * if next thing was true, do things in here
         * }
         * else {
         * do these things if nothing checked was true
         * }
         */
        // think of if statements as a coin slot machine
        // the first condition that is a match is the set of
        // expressions that will happen
        if (isRaining) {
            // isRaining is a boolean set to true
            // if isRaining was false, this condition would not "hit"
            // the next condition would be checked
            System.out.println("You should have brought an umbrella");
        } else if (isCloudy) {
            // isCloudy is a boolean set to true
            // if isRaining is true, isCloudy will not be checked
            // if isRaining is false and isCloudy is false, then the
            // else will be the statements that happen
            System.out.println("It is cloudy");
        } else {
            // will only execute (run) if isRaining is false and isCloudy is false
            System.out.println("No rain today!");
        }
        // once this if statement runs, the program carries on
        // we could write more if statements, or loops, or whatever
        // the only rule is that they will run once the if statement is finished
        System.out.println("more code carries on here...");

    }
}
