package com.fundamenals;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        String name2 = console.nextLine();
        String delimiter = console.nextLine();

        String format = String.format("%s%s%s", name1,delimiter,name2);

        System.out.println(format);
    }
}
