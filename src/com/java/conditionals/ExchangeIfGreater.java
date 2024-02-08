package com.java.conditionals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("0.###");
        if (num1 > -100 && num1 < 100 && num2 > -100 && num2 < 100) {
            if (num1 > num2) {
                double temp = num1;
                num1 = num2;
                num2 = temp;

                System.out.println(df.format(num2) + " " + df.format(num1));
            } else {
                System.out.println(df.format(num1) + " " + df.format(num2));
            }

        }
    }
}
