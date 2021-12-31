package com.company;

import java.util.Scanner;

public class Ch14_SpecificExecptions {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=56;
        marks[1]=6;
        marks[2]=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array :- ");
        int ind = sc.nextInt();
        System.out.println("Enter the value that you want to divide with = ");
        int number = sc.nextInt();
        try{
            System.out.println("The value of the index array you choose is "+marks[ind]);
            System.out.println("After dividing the value = "+marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exceptions occurred");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bond Exceptions Occurred");
        }
        catch(Exception e){
            System.out.println("Some other Exceptions occurred"+e);
        }
    }
}
