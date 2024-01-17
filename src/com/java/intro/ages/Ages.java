package com.java.intro.ages;

public class Ages {
    public String printAges(int age) {
        String personAge;

        if (age >= 0 && age <= 2) {
            personAge = "baby";
        } else if (age >= 3 && age <= 13) {
            personAge = "child";
        } else if (age >= 14 && age <= 19) {
            personAge = "teenager";
        } else if (age >= 20 && age <= 65) {
            personAge = "adult";
        } else {
            personAge = "elder";
        }
        return personAge;
    }
}
