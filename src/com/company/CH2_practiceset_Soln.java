package com.company;
import java.util.Scanner;
public class CH2_practiceset_Soln {
    public static void main(String[] args) {
//        QUESTIONS 1
       float e = 7/4.0f*9/2.0f;
        System.out.println(e);

//        QUESTIONS 2
//        Encrypt code
        char grade = 'B';
        grade = (char)(grade+8);    //Type-Casting grade to character
        System.out.println(grade);

//       Decrypted code
        grade =(char)(grade-8);
        System.out.println(grade);

//        QUESTIONS 3
        int b =7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You want to Check...");
        int a = sc.nextInt();
        System.out.println(a>b);

//        QUESTIONS 3
        int v = 8;
        int c = 4;
        int s = 16;
        int u = 25;
        int form = (v*v-u*u)/(2*c*s);
        System.out.println(form);

//        QUESTIONS 4

        int x = 7;
        int z = 7*49/7+35/7;
        System.out.println(z);
    }
}
