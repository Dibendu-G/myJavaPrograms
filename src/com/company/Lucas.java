package com.company;
import java.util.*;
public class Lucas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = sc.nextInt();
        int a=1;
        int b =3;
        System.out.print("2 1 ");
        for(int i=a;i<=n;i++)
        {
            int sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
