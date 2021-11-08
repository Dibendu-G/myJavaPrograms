package com.company;
import  java.util.Scanner;
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject1: ");
        int a = sc.nextInt();
        System.out.println("Enter Marks of Subject2: ");
        int b = sc.nextInt();
        System.out.println("Enter Marks of Subject3: ");
        int c = sc.nextInt();
        System.out.println("Enter Marks of Subject4: ");
        int d = sc.nextInt();
        System.out.println("Enter Marks of Subject5: ");
        int e = sc.nextInt();
        int total_marks = a+b+c+d+e;
        float percentage = (total_marks/500.0f)*100;
        System.out.println("Percentage of Student is: ");
        System.out.println(percentage);
    }
}
