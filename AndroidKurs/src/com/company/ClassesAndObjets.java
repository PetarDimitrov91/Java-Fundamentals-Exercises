package com.company;

import java.sql.SQLOutput;

public class ClassesAndObjets {
    public static void main(String[] args) {

        class User {

            int score;

            public boolean hasWon() {
                if (score >= 200) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        User bob = new User();
        bob.score = 10;
        System.out.println(bob.hasWon());

        User joe = new User();
        joe.score = 210;
        System.out.println(joe.hasWon());


        class Number {

            int number;

            public boolean isPositive() {

                if (number > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        Number num = new Number();
        num.number = 0;

        if (num.isPositive()) {
            System.out.println("Number is positive");
        } else if (num.number == 0) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is negative");
        }

    }
}
