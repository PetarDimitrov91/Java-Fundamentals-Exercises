package com.fundamenals;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char ch = console.nextLine().charAt(0);

        if((int)ch >= 65 && (int)ch <=90){
            System.out.println("upper-case");
        }else if((int)ch >= 97 && (int)ch <= 122){
            System.out.println("lower-case");
        }


    }
}
