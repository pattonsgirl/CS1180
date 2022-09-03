import java.util.Random;

public class randnum {
    public static void main(String[] args) {
        // by default, Random is seeded with system time
        Random randGen = new Random();
        // the following sets a seed - think consistent
        // starting point for random to generate
        Random seedRand = new Random(15);
        // create a random integer, no control applied:
        // Random int in range -2^32 to 2^32 - 1
        int num = randGen.nextInt();
        System.out.println("Random number rolled is: " + num);
        num = randGen.nextInt();
        System.out.println("Random number rolled is: " + num);

        // let's play with seeded random
        int num2 = seedRand.nextInt();
        System.out.println("Seeded random number rolled is: " + num2);
        num = seedRand.nextInt();
        System.out.println("Seeded random number rolled is: " + num2);

        // What if we want the number to be randomly generated,
        // but within a range?
        // The following will randomly generate a number
        // between 0 and 10 excluded
        // 10 is not included
        int controlnum = randGen.nextInt(10);
        System.out.println("Random number between 0 and 10 is: " + controlnum);

        // How about a random number between 20 and 30?
        // Get a random number between 0 and 10, add offset (20) to number
        controlnum = randGen.nextInt(10) + 20;
        System.out.println("Random number between 20 and 30 is: " + controlnum);

    }
}
