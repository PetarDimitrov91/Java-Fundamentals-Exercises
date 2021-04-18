package com.fundamenals;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        StringBuilder gradeInWords = checkGrades(grade);
        System.out.println(gradeInWords);

    }

    private static StringBuilder checkGrades(double grade) {
        StringBuilder gradeInWords = new StringBuilder();
        if (grade >= 2.00 && grade <= 2.99) {
            gradeInWords.append("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            gradeInWords.append("Poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            gradeInWords.append("Good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            gradeInWords.append("Very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            gradeInWords.append("Excellent");
        }
        return gradeInWords;
    }


}
