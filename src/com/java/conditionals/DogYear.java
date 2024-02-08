package com.java.conditionals;

import java.util.Scanner;

public class DogYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int humanYears = Integer.parseInt(scanner.nextLine());
        int dogYears = 0;

        if (humanYears >= 1 && humanYears <= 15) {

            dogYears = humanYears * 7;

            if (humanYears > 2) {
                dogYears = (2 * 10) + (humanYears-2)*4;
            } else {
                dogYears = humanYears * 10;

            }
            System.out.println(dogYears);
        }
    }
}
