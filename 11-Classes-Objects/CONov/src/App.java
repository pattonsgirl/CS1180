// import class?

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        String userString = "The answer to life the universe and everything: ";
        Mine.helloThere(userString);
        userString.charAt(0);
        // creating an instance or object
        Bicycle road_bike = new Bicycle();
        Bicycle mountain_bike = new Bicycle();


        System.out.println("Road bikes bar tape value is: " + road_bike.getBarTape());

        // TODO: way to use the road bike
        // trip 
        // go on ride!
        // each time I ride, I'm going to decrement my bar tape condition
        road_bike.setBarTape(road_bike.getBarTape() - 1);
        System.out.println("Road bikes bar tape value is: " + road_bike.getBarTape());
        System.out.println("Mountain bikes bar tape value is: " + mountain_bike.getBarTape());

        Bicycle bike1 = new Bicycle("Square", 50, 8);
        System.out.println(bike1.toString());
        Bicycle[] user_bikes = new Bicycle[4];
        //user_bikes[0].

        System.out.println(road_bike.getBarTapeStatus());
    }
}
