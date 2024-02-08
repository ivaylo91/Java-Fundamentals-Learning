package com.java.datatypes;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int remainder = a % b;
        int result = a * b;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(remainder);
        System.out.println(result);
    }
}
