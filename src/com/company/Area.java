package com.company;
import java.util.*;
public class Area {
    public static void main(String[] args) {
//        int a,b,c;
//            float s,area;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the three sides");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        s=(a+b+c)/2;
//        area =(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        System.out.println("The Area is = "+area);
        int i,j,k;
        for(i=1;i<=7;i=i+2){
            for(k=7;k>i;k=k-2){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
