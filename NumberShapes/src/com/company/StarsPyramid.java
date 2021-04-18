package com.company;

public class StarsPyramid {

    public static void pyramidPattern(int n) {
        //outer loop for number of rows(n)
        for (int i = 0; i < n; i++) {
            //inner loop for spaces
            for (int j = n - i; j > 1; j--) {
                //print space
                System.out.print(" ");
            }
            //inner loop for number of columns
            for (int j = 0; j <= i; j++) {
                //print star
                System.out.print("* ");
            }
            //ending line after each row
            System.out.println(); //ending line after each row
        }
    }

    public static void main(String[] args) //driver function
    {
        int n = 10;
        pyramidPattern(n);
    }
}