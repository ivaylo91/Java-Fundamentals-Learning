package com.java.datatypes;

import java.util.Scanner;

public class Bottles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int halfLiterBottles = scanner.nextInt();
        int oneLiterBottles = scanner.nextInt();
        double halfLiterDeposit = halfLiterBottles * 0.1;
        double oneLiterDeposit = oneLiterBottles * 0.25;

        double sumOfDepositBottles = halfLiterDeposit + oneLiterDeposit;

        System.out.printf("%.2f", sumOfDepositBottles);
    }
}
