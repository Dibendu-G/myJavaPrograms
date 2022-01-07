package com.company;

import java.util.Scanner;
class MaxRetriesException extends Exception
{
    @Override
    public String toString() {
        return "MaxRetries Exceeded";
    }
}
class MyCustomException extends Exception
{
    @Override
    public String toString() {
        return "Out Of Index";
    }
}

public class Ch14_PracticeSets {
    private static int[] arr;

    static void problem5(int index) throws MyCustomException
    {
        int[] arr=new int[3];
        arr[0]=5;
        arr[1]=7;
        arr[2]=11;
        if(index>arr.length-1)
            throw new MyCustomException();
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
//        Problem-01

//        Syntax Errors
//        int a = 5 --> no semicolon, Syntax errors
//        int b=9;
//        c=0; --> variable not declared
//        System.out.println(a+b);

        //            Logical Errors
//        wap to print all prime numbers between 1 to 10

//        System.out.println(2);
//        for(int i=1; i<5;i++){
//            System.out.println(2*i+1);   --> thorws a logical error because it prints 9 also but 9 is not a prime number
//        }

//        Run-time Errors(also known as Exceptions)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st no");
//        int a = sc.nextInt();
//        System.out.println("Enter 2nd no");
//        int b= sc.nextInt();
//        int c = a+b;
//        System.out.println("The Sum is ="+c);
//        Exception in thread "main" java.util.InputMismatchException

//        Problem-02
//        int a,b,c;
//        a=10;
//        b=0;
//        try{
//            System.out.println(c=a/b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("hehe");
//        }

//        Problem-03
//        boolean flag = true;
////        int i = 0;
//        int[] marks = {4, 5, 6, 7, 8};
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while(flag && i<5){
//            try {
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("Error");
//        }

//        Problem-04
        System.out.println("Enter Array index no.: ");

        int max=1;
        Scanner scan = new Scanner(System.in);
        while(true)

        {

            try{

                if(max>5) {

                    throw new MaxRetriesException();

                }

                int index=scan.nextInt();

                System.out.println(arr[index]);break;

            }

            catch (MaxRetriesException e)

            {

                System.out.println(e);break;

            }

            catch (Exception exp)
            {
                System.out.println("Exception encountered...");
                max++;
            }
            if(max<=5)
                System.out.println("\nRe-enter array index no.: ");
        }

//        Problem-05
        System.out.println("Enter Index of array: ");

        max=1;

        while(true) {

            try {

                problem5(scan.nextInt());
                break;

            } catch (MyCustomException e) {

                System.out.println(e);

                max++;
            }
            if(max>5) {
                System.out.println("Error");
                break;
            }
            System.out.println("\nRe-enter array index no.: ");
        }
        System.out.println("Programme Finished...");
    }
}
