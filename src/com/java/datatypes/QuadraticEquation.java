package com.java.datatypes;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double determinant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(determinant) / (2 * a));
        double root2 = (-b - Math.sqrt(determinant) / (2 * a));
        System.out.format("x1 = %.2f %n x2= %.2f", root1, root2);


    }
}
