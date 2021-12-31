package com.company;

import java.util.Scanner;

public class Ch14_NestedTtryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=56;
        marks[1]=6;
        marks[2]=5;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the array index = ");
        int ind =sc.nextInt();
            try {
                System.out.println("Welcome to chapter 14");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of Bond");
//                System.out.println("Exceptions handling at level 2");
                }
            } catch (Exception e) {
                System.out.println("Exceptions handling at level 1");
            }
        }
        System.out.println("Thanks for using the program");
    }
}
