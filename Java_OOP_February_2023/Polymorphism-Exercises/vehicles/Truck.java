package vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }


    @Override
    public void driving(double distance) {
        double neededFuel = distance * getFuelConsumption();

        if (getFuelQuantity() >= neededFuel) {
            setFuelQuantity(getFuelQuantity() - neededFuel);
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf("Truck travelled %s km%n", df.format(distance));

        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refueling(double liters) {
        liters = liters*0.95;
        setFuelQuantity(getFuelQuantity() + liters);


    }
}
