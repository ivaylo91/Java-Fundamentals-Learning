package com.java.intro.monthPrinter;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = Integer.parseInt(input.nextLine());
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        if (month <= months.length) {
            System.out.println(months[month-1]);
        } else {
            System.out.println("Error!");
        }


    }
}
