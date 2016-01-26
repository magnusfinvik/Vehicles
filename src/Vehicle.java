/**
 * Created by magnusfinvik on 26.01.2016.
 */
public class Vehicle {
    private int weight;
    private int topSpeed;
    private String name;

    public Vehicle() {
        this.weight = 0;
        this.topSpeed = 0;
        this.name = "";
    }

    public Vehicle(int weight, int topSpeed, String name) {
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
