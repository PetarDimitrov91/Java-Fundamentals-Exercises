package com.fundamenals;

public class test {
    public static void main(String[] args) {

        char a = 'C';
        char b = '#';

        for (int i = a - 1; i > b ; i--) {
            char ch = (char) i;
            System.out.print(ch + " ");
        }
    }
}
