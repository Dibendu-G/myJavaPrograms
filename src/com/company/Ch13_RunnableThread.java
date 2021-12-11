package com.company;
class MyThreadRunable implements Runnable{
    public void run() {
        while (true) {
            System.out.println("I'am Thread not a threat");
        }
    }
}
class MyThreadRunable2 implements Runnable{
    public void run() {
        while (true) {
            System.out.println("I'am Thread2 not a threat");
        }
    }
}
public class Ch13_RunnableThread {
    public static void main(String[] args) {
        MyThreadRunable bullet1 = new MyThreadRunable();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
        MyThreadRunable2 bullet2 = new MyThreadRunable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
