/**
 * Created by magnusfinvik on 26.01.2016.
 */
public class Car extends Vehicle {



    private String model;
    private String fuelType;

    public Car(int weight, int topSpeed, String name, String model, String fuelType) {
        super(weight, topSpeed, name);
        this.model = model;
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
