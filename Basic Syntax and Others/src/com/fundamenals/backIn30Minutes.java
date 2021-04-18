package com.fundamenals;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());


        minutes += 30;


        if (minutes  > 59) {
            hours++;
            minutes = minutes - 60;

        }
        if (hours > 23) {
            hours = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:%02d%n", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }


    }
}
