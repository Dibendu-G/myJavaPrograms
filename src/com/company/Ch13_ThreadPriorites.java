package com.company;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run() {
        int i = 34;
        while (true) {
            System.out.println("Thank You " + this.getName());
        }
    }
}
public class Ch13_ThreadPriorites {
    public static void main(String[] args) {
//        Ready Queue : T1 T2 T3 T4 T5
        MyThr1 t = new MyThr1("Dibendu");
        MyThr1 t1 = new MyThr1("Dibendu1");
        MyThr1 t2 = new MyThr1("Dibendu2");
        MyThr1 t3 = new MyThr1("Dibendu3 (Most Important)");
        t3.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
