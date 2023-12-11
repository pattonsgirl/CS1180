import java.util.ArrayList;

public class Train implements Comparable<Train>{
    String name;
    int cars;
    int passengers;

    public Train() {
        this.name = "Thomas";
        this.cars = 3;
        this.passengers = 50;
    }
    public Train (String name, int cars, int passengers){
        this.name = name;
        this.cars = cars;
        this.passengers = passengers;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setCars(int cars){
        this.cars = cars;
    }
    public int getCars() {
        return this.cars;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public int getPassengers(){
        return this.passengers;
    }

    public static String trainNames (ArrayList<Train> a) {
        String names = "";
        for(Train t: a) {
            System.out.println(t.getName());
            names += t.getName() + "\n";
        }
        return names;
    }
    
    @Override
    public int compareTo(Train other){
        if (this.cars > other.cars) {
            return 1;
        } else if (this.cars < other.cars) {
            return -1;
        } else {
            if (this.passengers > other.passengers) {
                return 1;
            } else if (this.passengers < other.passengers) {
                return -1;
            } else {
                if (this.name.compareTo(other.name) > 0) {
                    return 1;
                } else if (this.name.compareTo(other.name) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString(){
        return getName() + " has " + getCars() + " cars and max of " + getPassengers() + " passengers";
    }
}
