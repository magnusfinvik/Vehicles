import java.util.ArrayList;

/**
 * Created by magnusfinvik on 26.01.2016.
 */
public class Van extends Car {

    private int maxLoudInKilos;
    private int currentLoud;
    private  boolean isFull;
    private String typeOfGoods;

    public Van(int weight, int topSpeed, String name, String model, String fuelType, int maxLoudInKilos) {
        super(weight, topSpeed, name, model, fuelType);
        this.currentLoud = 0;
        this.maxLoudInKilos = maxLoudInKilos;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void fillVan(int loud, String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
        if((loud + currentLoud) < maxLoudInKilos) {
            currentLoud += loud;
            isFull = false;
        }else if((loud + currentLoud) >= maxLoudInKilos) {
            int temp = (loud + currentLoud) - maxLoudInKilos;
            currentLoud = maxLoudInKilos;
            isFull = true;
            System.out.println("Van is filled, " + temp + "kg is left");
        }else{
            System.out.println("something went wrong here");
        }
    }

    public void emptyVan(int loudToRemoveInKilos) {
        if((currentLoud - loudToRemoveInKilos) < 0){
            currentLoud = 0;
            isFull = false;
        }
        currentLoud -= loudToRemoveInKilos;
        isFull = false;
    }

}
