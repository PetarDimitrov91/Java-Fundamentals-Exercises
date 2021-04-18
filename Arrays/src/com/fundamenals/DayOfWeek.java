package com.fundamenals;


import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int input = Integer.parseInt(console.nextLine());
        
        if(input >= 1 && input <= 7) {
        String currentDay = weekdays[input-1];
            System.out.println(currentDay);
        }else{
            System.out.println("Invalid day!");
        }

    }
}
