package com.company;

public class Ch7_PracticeSet_SOln {
//    static void multiplication(int n){
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d * %d = ",n,i);
//            System.out.print(n*i);
//            System.out.println(" ");
//        }
//    }
//    static void pattern(int n){
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//    static int sum(int n){
//        if(n==1){
//            return 1;
//        }
//        else{
//            return n+sum(n-1);
//        }
//    }
//    static void pattern2(int n){
//        for(int i=0;i<n;i++) {
//            for (int j = n ; j>i-1+1; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//    static int n1=0,n2=1,n3=0;
//    static void fibonacci(int count){
//        int n3;
//        if(count>0){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(" "+n3);
//            fibonacci(count-1);
//        }
//    }
//    static int average(int... arr){
//      int sums=0;
//      int avg = 0;
//      int elements = arr.length;
//      for(int a:arr) {
//          sums = sums +a;
//      }
//        avg=sums/elements;
//      return avg;
//    }
//    static void pattern1(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(" * ".repeat(n));
//        pattern1(n-1);
//    }
//    static void pattern3(int n){
//      if(n>0){
//          pattern3(n-1);
//          for(int i=0;i<n;i++){
//              System.out.print(" * ");
//          }
//          System.out.println();
//      }
//    }
//    static void Conversions(float celsius){
//        float fahr;
//        fahr=(celsius*9/5)+32;
//        System.out.println(fahr+" F ");
//    }
    static int sum_rec(int n,int...args){
        int result=n;
       for(int b:args){
           result=result+b;
       }
       return result;
    }
    public static void main(String[] args) {
        //Problem-01
//        int x=50;
//        multiplication(x);

//        Problem-02
//        pattern(5);

//        Problem-03
//        int c = sum(3);
//        System.out.println(c);

//        Problem-04
//        pattern2(10);

//        Problem-05
//        int count =15;
//        System.out.print(n1+" "+n2);
//        fibonacci(count-2);

//        Problem-6
//        System.out.println("The Average of 5 , 4 , 3 and 6 is "+average(5,4,3,6));

//        Problem-07
//            pattern1(5);

//        Problem-08
//            pattern3(5);

//        Problem-09
//            Conversions(45);

//        Problem-10
        System.out.println("The Sum of 4 and 5 is "+sum_rec(4,5));
        System.out.println("The Sum of 4 , 6 and 5 is "+sum_rec(4,6,5));
        System.out.println("The Sum of 4 , 6 , 7 and 5 is "+sum_rec(4,6,7,5));
    }
}
