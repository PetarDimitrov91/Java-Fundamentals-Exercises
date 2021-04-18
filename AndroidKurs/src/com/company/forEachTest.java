package com.company;

import java.util.ArrayList;
import java.util.List;

public class forEachTest {
    public static void main(String[] args) {


        String[] footballStars = {"Messi", "Robben", "Ronaldo", "Rooney"};

        for (String name : footballStars) {
            System.out.println(name);

        }
        System.out.println();

        List<String> list = new ArrayList<String>();

        list.add("Messi");
        list.add("Robben");
        list.add("Ronaldo");
        list.add("Rooney");

        for (String name : list) {

            System.out.println(name);

        }
    }
}
