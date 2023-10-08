package foodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPeople = Integer.parseInt(scanner.nextLine());
        HashMap<String, Buyer> buyers = new HashMap<>();

        for (int person = 0; person < nPeople; person++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            if (input.length == 4) {
                String id = input[2];
                String birthdate = input[3];
                buyers.put(name, new Citizen(name, age, id, birthdate));
            } else {
                String group = input[2];
                buyers.put(name, new Rebel(name, age, group));
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            for (Map.Entry<String, Buyer> entry : buyers.entrySet()) {
                if (entry.getKey().equals(command)) {
                    entry.getValue().buyFood();
                }
            }


            command = scanner.nextLine();
        }

        int sum = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sum);


    }
}
