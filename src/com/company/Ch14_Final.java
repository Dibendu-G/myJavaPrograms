package com.company;

import java.util.Scanner;

public class Ch14_Final {
    public static int greet(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is End of Program");
        }
        return 0;
    }
    public static void main(String[] args) {
//       greet();
       int a=7;
       int b=9;
       while(true){
           try{
               System.out.println(a/b);
           }
           catch (Exception e){
               System.out.println(e);
               break;
           }
           finally {
               System.out.println("I'am final value for b = "+b);
           }
           b--;
       }
    }
}
