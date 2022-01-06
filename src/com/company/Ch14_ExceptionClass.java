package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I'm a String";
    }

    @Override
    public String getMessage() {
        return "I'm Get Message";
    }
}
public class Ch14_ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99)
        {
            try{
//                throw new MyException();
                throw new ArithmeticException("I'm a arithmetic Exceptions");
            }
         catch (Exception e){
             System.out.println(e.toString());
             System.out.println(e.getMessage());
             System.out.println(e);
             e.printStackTrace();
         }
        }
    }
}
