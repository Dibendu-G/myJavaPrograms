package com.company;
class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<400000) {
            System.out.println("My thread is running");
            System.out.println("I'am Happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<400000) {
            System.out.println("My thread2 is running");
            System.out.println("I'am Sad!");
            i++;
        }
    }
}
public class Ch13_thread {
    public static void main(String[] args) {
    MyThread obj = new MyThread();
    obj.start();
    MyThread2 obj1 = new MyThread2();
    obj1.start();
    }
}
