/**
 * Created by magnusfinvik on 26.01.2016.
 */
public class MotorCycle extends Vehicle {

    private static final int ROAD_TYRES = 1;
    private static final int OFFROAD_TYRES = 2;
    private static final int COMBI_TYRES = 3;

    private int engineSize;
    private int numberOfCylinders;
    private String tyreType;

    public MotorCycle(int weight, int topSpeed, String name, int engineSize, int numberOfCylinders, String tyreType) {
        super(weight, topSpeed, name);
        this.engineSize = engineSize;
        this.numberOfCylinders = numberOfCylinders;
        this.tyreType = tyreType;
    }



    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}
