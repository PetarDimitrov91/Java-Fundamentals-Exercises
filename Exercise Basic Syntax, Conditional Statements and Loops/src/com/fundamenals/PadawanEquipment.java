package com.fundamenals;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double availableMoney = Double.parseDouble(console.nextLine());
        int countOfStudents = Integer.parseInt(console.nextLine());
        double lightsabersPrice = Double.parseDouble(console.nextLine());
        double robesPrice = Double.parseDouble(console.nextLine());
        double beltsPrice = Double.parseDouble(console.nextLine());

        int countSt = countOfStudents;
        for (int i = 1; i <= countOfStudents; i++) {
            if (i % 6 == 0) {
                countSt--;
            }
        }
        double lightsabersCosts = Math.ceil(countOfStudents * 1.10) * lightsabersPrice;
        double robesCosts = countOfStudents * robesPrice;
        double beltsCosts = countSt * beltsPrice;

        double totalCosts = lightsabersCosts + robesCosts + beltsCosts;

        if(totalCosts <= availableMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalCosts);
        }else{
            double neededMoney = totalCosts - availableMoney;
            System.out.printf("Ivan Cho will need %.2flv more.",neededMoney);
        }




    }
}
