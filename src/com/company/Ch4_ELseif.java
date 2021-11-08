package com.company;
import java.util.Scanner;
public class Ch4_ELseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age =");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are Pro");
        }
        else if(age>46){
            System.out.println("You are semi-pro");
        }
        else if(age>36){
            System.out.println("You are semi-semi-pro");
        }
        else{
            System.out.println("You are Noob");
        }
    }
}
