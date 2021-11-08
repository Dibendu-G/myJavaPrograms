package com.company;
abstract class base2{
    public base2(){
        System.out.println("I'm a constructor of base2 class");
    }
    public void name(){
        System.out.println("Mera namm samrat hain");
    }
    abstract void greet();
    abstract void greet2();
}
class parent extends base2{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class parent2 extends base2{
    public void th(){
        System.out.println("TH");
    }
}
public class CH11_abstract {
    public static void main(String[] args) {
//        base2 b = new base2(); ---> error we cannot call abstract class directly
        parent p = new parent();
        p.greet();
        p.greet2();
//        parent2 q = new parent2(); ---> error we cannot call abstract class directly
    }
}
