package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("Beast!")) {

            String animalType = command;
            String[] animalInfo = scanner.nextLine().split("\\s+");
        try {

            switch (animalType) {
                case "Cat":
                    Cat cat = new Cat(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(cat);

                    break;
                case "Dog":
                    Dog dog = new Dog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(dog);

                    break;
                case "Frog":
                    Frog frog = new Frog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
                    System.out.println(frog);

                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(animalInfo[0], Integer.parseInt(animalInfo[1]));
                    System.out.println(kitten);

                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(animalInfo[0], Integer.parseInt(animalInfo[1]));
                    System.out.println(tomcat);

                    break;


            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
            command = scanner.nextLine();
        }

    }
}
