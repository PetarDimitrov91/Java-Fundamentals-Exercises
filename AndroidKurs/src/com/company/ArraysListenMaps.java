package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysListenMaps {

    public static void main(String[] args) {


        // Array for Prime Numbers (integer)
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17};

        //print the number in this position,for example position 5 = number 13
        System.out.println(primeNumbers[5]);

        // print how much positions we have
        System.out.println(primeNumbers.length);

        //print the last number in the array
        System.out.println(primeNumbers[primeNumbers.length - 1]);


        double[] decimalNumbers = {2.2, 2.3, 3.5, 5.6};
        //System.out.println(decimalNumbers[3]);

        String[] names = {"Petar", "Sandra", "Agata", "Blaga", "Daniela"};
        System.out.println(names[names.length - 2]);

        System.out.println();

        //Lists:

        List list = new ArrayList();
        list.add("Petar");
        list.add(3);
        list.add(5.5);
        list.add(7);

        list.remove(1);

        System.out.println(list.toString());
        System.out.println(list.size());


        System.out.println();


        //hashMaps (use Strings):

        Map map = new HashMap();

        map.put("Germany","Berlin");
        map.put("France","Paris");

        map.remove("France");

        System.out.println(map.toString());
        System.out.println(map.size());



    }
}
