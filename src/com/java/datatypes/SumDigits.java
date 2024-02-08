package com.java.datatypes;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit, sum = 0;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
