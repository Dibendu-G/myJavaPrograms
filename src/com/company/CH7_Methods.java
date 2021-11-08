package com.company;

public class CH7_Methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=(x+y)*5;
        }
        else{
            z=x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=4;
        int b=5;
//        This is Called Method invocation
//        CH7_Methods obj = new CH7_Methods();
//        int c=obj.logic(a,b);
        int c=logic(a,b);
//        if(a>b){
//            c=(a+b)*5;
//        }                                 // This is Old Fashioned
//        else{
//            c=a+b;
//        }
        int a1=8;
        int b1=5;
        int c1=logic(a1,b1);
//        if(a1>b1){
//            c1=(a1+b1)*5;
//        }                                         // Be a Pro Don't become Noob
//        else{
//            c1=a1+b1;
//        }
        System.out.println(c);
        System.out.println(c1);
    }
}
