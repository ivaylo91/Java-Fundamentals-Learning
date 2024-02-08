package com.java.datatypes;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        double firstYearDeposit = deposit + (deposit * 0.05);
        double secondYearDeposit = firstYearDeposit + (firstYearDeposit * 0.05);
        double thirdYearDeposit = secondYearDeposit + (secondYearDeposit * 0.05);

        System.out.printf("%.2f %n %.2f %n %.2f %n", firstYearDeposit, secondYearDeposit, thirdYearDeposit);

    }
}
