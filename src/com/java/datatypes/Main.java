package com.java.datatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();
        String address = scanner.nextLine();
        String companyPhoneNumber = scanner.nextLine();
        String companyFaxNumber = scanner.nextLine();
        String webPage = scanner.nextLine();
        String managerFirstName = scanner.nextLine();
        String managerLastName = scanner.nextLine();
        String age = scanner.nextLine();
        String managerPhone = scanner.nextLine();

        System.out.printf("%s" +
                        "%nAddress: %s" +
                        "%nTel. %s" +
                        "%nFax: %s" +
                        "%nWeb site: %s" +
                        "%nManager: %s " +
                        "%s (age: %s, tel. %s)",
                companyName, address, companyPhoneNumber, companyFaxNumber, webPage,
                managerFirstName, managerLastName, age, managerPhone);
    }
}
