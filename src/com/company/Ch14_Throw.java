package com.company;
class NegativeExceptions extends ArithmeticException{
    @Override
    public String toString() {
        return "Radius Cannot be less than 0";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot be less than 0";
    }
}
public class Ch14_Throw {
    public static double area(int r) throws NegativeExceptions{
        if(r<0){
            throw new NegativeExceptions();
        }
        double radius= Math.PI*r*r;
        return radius;
    }
   public static  int divide(int a,int b) throws ArithmeticException{
        int res = a/b;
        return res;
    }
    public static void main(String[] args) {
       try {
//           int c = divide(4, 0);
//           System.out.println(c);
           double ar = area(6);
           System.out.println(ar);
       }
       catch (Exception e){
           System.out.println(e);
       }
    }
}

