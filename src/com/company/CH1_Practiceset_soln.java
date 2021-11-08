package com.company;
import java.util.Scanner;
public class CH1_Practiceset_soln {
    public static void main(String[] args) {
//        QUESTIONS 1
        int a = 68;
        int b = 85;
        int c = 49;
        int sum = a+b+c;
        System.out.println(sum);

//        QUESTIONS 2
        float sub1 = 48;
        float sub2 = 85;
        float sub3 = 98;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);

//        QUESTIONS 3
        System.out.println("Whats your Name..?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello "+str+" have a good day...");

//        QUESTIONS 4
        System.out.println("Enter the Kilometers you want to convert...");
        Scanner ac = new Scanner(System.in);
        double  km = ac.nextDouble();
        double miles = km*0.621371d;
        System.out.println("Miles "+miles);

//        QUESTIONS 5
        System.out.println("Enter the number...");
        Scanner bc = new Scanner(System.in);
        System.out.println(bc.hasNextInt());
    }
}
