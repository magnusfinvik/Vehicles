/**
 * Created by magnusfinvik on 26.01.2016.
 */
public class OrdinaryCar extends Car {

    private int numberOfSeats;
    private int numberOfPassengers;
    private boolean isFull;


    public OrdinaryCar(int weight, int topSpeed, String name, String model, String fuelType, int numberOfSeats) {
        super(weight, topSpeed, name, model, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.isFull = false;
    }

    public void fillCar(int passengers) {
        if((numberOfPassengers + passengers) > numberOfSeats){
            int temp = (numberOfPassengers + passengers) - numberOfSeats;
            numberOfPassengers = numberOfSeats;
            isFull = true;
            System.out.println("car is full, " + temp + " persons is left");
        }
        else if((numberOfPassengers + passengers) <= numberOfSeats) {
            numberOfPassengers += passengers;
            if(numberOfPassengers == numberOfSeats){
                System.out.println("Car is full");
                isFull = true;
            }else{
                isFull = false;
                int temp = numberOfSeats - numberOfPassengers;
                System.out.println(temp + " seats is left");
            }
        }
    }


    public void empptyCar(int passengers) {
        if(passengers >= numberOfPassengers) {
            numberOfPassengers = 0;
            System.out.println("car is now empty");
            isFull = false;
        }else {
            numberOfPassengers -= passengers;
            int temp = numberOfSeats - numberOfPassengers;
            System.out.println(temp + " seats is availible");
            isFull = false;
        }
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
