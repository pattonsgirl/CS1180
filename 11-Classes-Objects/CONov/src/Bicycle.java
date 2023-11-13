public class Bicycle {
    private String name;
    private int front_gear;
    private int rear_gear;
    private int current_gear = 3;
    private String gear_levers = "handlebar";
    private int bar_tape_condition = 10;
    private boolean brakes;
    private double speed;
    private int trips;

    public Bicycle() {
        this.name = "";
        this.front_gear = 2;
        this.rear_gear = 7;
        this.brakes = true;
        this.speed = 0.0;
        this.bar_tape_condition = 10;
    }

    public Bicycle(String name, int speed, int bar_tape_condition){
        this.name = name;
        this.speed = speed;
        this.bar_tape_condition = bar_tape_condition;
        this.front_gear = 2;
        this.rear_gear = 7;
        this.brakes = true;
    }

    public void setFrontGear(int front_gear) {
        this.front_gear = front_gear;
    }

    public int getFrontGear() {
        return this.front_gear;
    }

    public void setBarTape(int bar_tape_condition) {
        this.bar_tape_condition = bar_tape_condition;
    }

    public int getBarTape() {
        return this.bar_tape_condition;
    }

    /*
     * 
     */
    public void setGear(int new_gear) {
        this.current_gear = new_gear;
    }

    /*
    *   Method that returns rate of speed decrease
     * @return double rate of decrease
     */
    public double applyBrakes (boolean apply) {
        // TODO: 
        // if apply is true,
        // calculate rate of decrease when applying brakes
        return 0.0;
    }

    /*
     * 
     */
    public int getBarTapeStatus() {
        return this.bar_tape_condition;
    }
    public void replaceBarTape() {
        this.bar_tape_condition = 10;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bar_tape_condition;
    }
}
