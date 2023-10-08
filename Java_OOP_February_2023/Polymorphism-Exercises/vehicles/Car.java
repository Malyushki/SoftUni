package vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }


    @Override
    public void driving(double distance) {


        double neededFuel = distance * getFuelConsumption();

        if (getFuelQuantity() >= neededFuel) {
            setFuelQuantity(getFuelQuantity() - neededFuel);
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf("Car travelled %s km%n", df.format(distance));
        } else {

            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refueling(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);


    }
}
