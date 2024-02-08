package com.java.datatypes;

import java.util.Scanner;

public class SumGreatestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largestNumber = Math.max(num1, Math.max(num2, num3));
        int smallestNumber = Math.min(num1, Math.min(num2, num3));

        System.out.println(largestNumber + smallestNumber);
    }
}

