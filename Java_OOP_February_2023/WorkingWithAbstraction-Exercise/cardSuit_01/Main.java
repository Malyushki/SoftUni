package cardSuit_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            System.out.println("Card Suits:");

        for (CardSuits s:CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",s.ordinal(),s.name());
        }


        }
    }
