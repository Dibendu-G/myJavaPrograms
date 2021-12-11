package com.company;
class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    public void run() {
        int i =0;
        while (true) {
            System.out.println("Thank You " + this.getName());
//            i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThr3 extends Thread{
    public void run() {
        int i =0;
        while (i<560) {
            System.out.println("Thank You " + this.getName());
            i++;
        }
    }
}
public class Ch13_ThreadMethods {
    public static void main(String[] args) {
        MyThr2 obj = new MyThr2("Dibendu");
        MyThr3 t = new MyThr3();
        obj.start();
        try{
            obj.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t.start();
    }
}
