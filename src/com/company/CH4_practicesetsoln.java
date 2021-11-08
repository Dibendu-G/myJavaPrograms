package com.company;
import java.util.Scanner;
public class CH4_practicesetsoln {
    public static void main(String[] args) {
//        Problem-01
//            int a = 11;
//            if (a=11){
//                System.out.println("I'm 11");
//            }
//            else{
//                System.out.println("I'm not 11");
//            }
//        It will throw Error

//        Problem-02
//        int m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Physics Marks: ");
//        m1 = sc.nextInt();
//        System.out.println("Enter Chemistry Marks: ");
//        m2 = sc.nextInt();
//        System.out.println("Enter Maths Marks: ");
//        m3 = sc.nextInt();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall Percentage is ="+avg);
//        if(avg<40 && m1>33 && m2>33 && m3>33){
//            System.out.println("Congrts, You have been Promoted");
//        }
//        else{
//            System.out.println("Sorry, You are failed");
//        }

//        Problem-03
//        float tax = 0;
//        float income;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Annual income in Lakhs =");
//        income = sc.nextFloat();
//        if (income < 2.5) {
//            tax = tax +0;
//        } else if (income > 2.5 && income <= 5.0f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income<=10.0f){
//            tax = tax + 0.05f * (income -2.5f);
//            tax = tax + 0.2f * (income-5.0f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f *(income - 2.5f);
//            tax = tax + 0.2f *(income - 5.0f);
//            tax = tax +0.3f *(income -10.0f);
//        }
//        System.out.println("Your Tax is = "+tax);

//        Problem-04
//        int day;
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Problem-05
//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year you want to check - ");
//        year = sc.nextInt();
//        int rem;
//        rem=year%4;
//        if(rem==0){
//            System.out.println("It's a Leap Year");
//        }
//        else{
//            System.out.println("It's not a leap year");
//        }

//        Problem-05
        String domain;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Domain");
        domain = sc.nextLine();
        if(domain.endsWith(".org")){
            System.out.println("Its a Organisation Website");
        }
        else if(domain.endsWith(".com")){
            System.out.println("It's a Commerical Website");
        }
        else if(domain.endsWith(".in")){
            System.out.println("It's a Indian Website");
        }
        else{
            System.out.println("Please enter Correct domain");
        }
    }
}
