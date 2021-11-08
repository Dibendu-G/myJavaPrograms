package com.company;
import java.util.Scanner;
public class Userinput_05 {
    public static void main(String[] args) {
        System.out.println("Taking Input Form Users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum of two number is: ");
        System.out.println(sum);
        boolean bl = sc.hasNextInt();
        System.out.println(bl);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
