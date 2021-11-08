package com.company;
class base1{
    base1(){
        System.out.println("I'm a base class constructor");
    }
    base1(int x){
        System.out.println("I'm a base class constructor with a value of x "+x);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("I'm a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I'm a base class constructor with a value of y "+y);
    }
}
class parentchild extends derived1{
    parentchild(){
        System.out.println("I'm a parent child of a derived class constructor");
    }
    parentchild(int x, int y,int z){
        super(x,y);
        System.out.println("I'm a base class constructor with a value of z "+z);
    }
}
public class CH10_Constructor_Inheritance {
    public static void main(String[] args) {
//        base1 b = new base1(4);
//        derived1 d = new derived1(4,5);
//            parentchild p = new parentchild(45,65,98);
    }
}
