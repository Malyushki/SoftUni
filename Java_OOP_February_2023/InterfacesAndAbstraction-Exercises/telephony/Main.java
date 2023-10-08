package telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbers, urls);


        while (!smartphone.getNumbers().isEmpty()) {
            System.out.println(smartphone.call());

        }

        while (!smartphone.getUrls().isEmpty()) {
            System.out.println(smartphone.browse());

        }

    }
}
