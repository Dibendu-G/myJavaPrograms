package com.company;

public class Ch14_ExceptionsHandling {
    public static void main(String[] args) {
        int a =6000;
        int b= 0;

//        Without TRY
//        int c=a/b;
//        System.out.println("The Result is = "+c);


//        With TRY
        try{
            int c=a/b;
            System.out.println("The Result is = "+c);
        }
        catch(Exception e){
            System.out.println("We failed to divide,Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
