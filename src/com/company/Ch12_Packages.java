package com.company;

import java.util.Scanner;

//import java.util.Scanner;
//import java.util.*;
public class Ch12_Packages {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner (System.in);
        int a = sc.nextInt();
        System.out.println("This is my Scanner taking input as "+ a);
    }
}
