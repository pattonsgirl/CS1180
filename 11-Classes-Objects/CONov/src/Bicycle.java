public class Bicycle {
    private int front_gear = 2;
    private int rear_gear = 7;
    private int current_gear = 3;
    private String gear_levers = "handlebar";
    private int bar_tape_condition = 10;
    private boolean brakes = true;
    private double speed = 0.0;

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
}
