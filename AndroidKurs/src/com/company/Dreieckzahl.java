package com.company;

public class Dreieckzahl {

    public static void main(String[] args) {

        int x = 1;
        int dreiecksZahl = 1;

        while (x <= 15){
            System.out.println(dreiecksZahl);
            x++;
            dreiecksZahl = dreiecksZahl + x;
        }
    }
}
