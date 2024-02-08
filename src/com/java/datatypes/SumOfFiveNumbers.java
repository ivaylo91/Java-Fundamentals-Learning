package com.java.datatypes;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
             int numbers= scanner.nextInt();
             sum+=numbers;
        }
        System.out.println(sum);

    }
}
