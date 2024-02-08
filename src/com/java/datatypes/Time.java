package com.java.datatypes;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        int total = days*86400 + hours*3600 + minutes*60 + seconds;

        System.out.println(total);
    }
}
