package com.java.intro.ages;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());

        Ages personAge = new Ages();
        System.out.println(personAge.printAges(age));
    }
}
