package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = 0;
        boolean getalGoed;


        do {
            System.out.print("Geef een getal: ");

            try {

                getal = Integer.parseInt(scanner.nextLine());

                System.out.printf("Het getal was %d%n", getal);
                getalGoed = true;


            } catch (NumberFormatException ex) {

                System.out.println("Dit is geen getal: " + ex.getMessage());
                getalGoed = false;

            }
        }while (!getalGoed);

        System.out.println("Einde programma");
    }

}
