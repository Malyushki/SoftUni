package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carInput[1]);
        double carConsumption = Double.parseDouble(carInput[2]);

        Car car = new Car(carFuelQuantity, carConsumption);

        String[] truckInput = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckInput[1]);
        double truckConsumption = Double.parseDouble(truckInput[2]);
        Truck truck = new Truck(truckFuelQuantity, truckConsumption);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandType = scanner.nextLine().split("\\s+");
            String methodType = commandType[0];
            String objectType = commandType[1];
            double arg = Double.parseDouble(commandType[2]);

            switch (objectType) {
                case "Car":
                    switch (methodType) {
                        case "Drive":
                            car.driving(arg);
                            break;
                        case "Refuel":
                            car.refueling(arg);
                            break;
                    }
                    break;
                case "Truck":
                    switch (methodType) {
                        case "Drive":
                            truck.driving(arg);
                            break;
                        case "Refuel":
                            truck.refueling(arg);
                            break;
                    }
                    break;

            }

        }
        System.out.printf("Car: %.2f%n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n",truck.getFuelQuantity());
    }
}
