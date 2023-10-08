package birthdayCelebrations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthableList = new ArrayList<>();
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Citizen":
                    String name = command[1];
                    int age = Integer.parseInt(command[2]);
                    String id = command[3];
                    String birthdate = command[4];

                    birthableList.add(new Citizen(name, age, id, birthdate));
                    break;
                case "Pet":
                    String namePet = command[1];
                    String birthdatePet = command[2];

                    birthableList.add(new Pet(namePet, birthdatePet));
                    break;
                case "Robot":
                    break;


            }

            command = scanner.nextLine().split("\\s+");
        }

        String year = scanner.nextLine();
        boolean isFound = false;

        for (Birthable element:birthableList) {
            if (element.getBirthDate().endsWith(year)){
                isFound = true;
                System.out.println(element.getBirthDate());
            }
        }
        if (!isFound){
            System.out.println("<no output>");
        }

    }

}
