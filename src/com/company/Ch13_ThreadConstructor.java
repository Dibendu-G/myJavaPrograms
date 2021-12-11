package com.company;
class Myclass1 extends Thread implements Runnable{
    public Myclass1(int i,String name){
        super(name);
    }
    public void run(){
        System.out.println("Good Night");
    }
}
public class Ch13_ThreadConstructor {
    public static void main(String[] args) {
        Myclass1 ab = new Myclass1(4,"Samrat");
        Thread cd = new Thread(ab);
        cd.start();
        System.out.println(cd.getId());
        System.out.println(cd.getName());
//        My t = new My("Samrat");
//        My a = new My("Dibendu");
//        My b = new My("Tobo");
//        t.start();
//        a.start();
//        b.start();
//        System.out.println("The id of thread is "+t.getId());
//        System.out.println("The id of thread is "+t.getName());
//        System.out.println("The id of thread is "+a.getId());
//        System.out.println("The id of thread is "+a.getName());
//        System.out.println("The id of thread is "+b.getId());
//        System.out.println("The id of thread is "+b.getName());
    }
}
