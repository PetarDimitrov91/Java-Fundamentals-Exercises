package com.fundamenals;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String inputLine = "1 2 3 5 17";

        String[] items = inputLine.split(" ");

        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();

        System.out.println(arr[0]+ " "+ arr[1]+" "+arr[2]+arr[3]);
    }

}
