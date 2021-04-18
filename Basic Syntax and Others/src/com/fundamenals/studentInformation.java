package com.fundamenals;

import java.util.Scanner;

public class studentInformation {

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);


	String name = console.nextLine();
	int age = Integer.parseInt(console.nextLine());
	double grade = Double.parseDouble(console.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);



    }
}
