package com.company;
//Question-01
//class Thread1 extends Thread
//{
//    public void run()
//    {
//        while(true)
//        {
//            System.out.println("Good Morning");
//        }
//    }
//}
//class Thread2 extends Thread
//{
//    public void run()
//    {
//        while(true)
//        {
//            System.out.println("Welcome");
//            try {
//                Thread2.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//  QUESTIONS -04
//class Thread1 extends Thread{
//    public void run(){
//        System.out.println("Good Morning");
//    }
//}

//  Question -04
//class Thread1 implements  Runnable{
//    public void run(){
//        Thread.State state = Thread.currentThread().getState();
//        System.out.println("Running Thread name ="+Thread.currentThread().getName());
//        System.out.println("State of Thread is = "+state);
//    }
//}

//      Question-05
class Thread1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Ch13_Threads_PracticeSet {
    public static void main(String[] args) {
//        Question-01
//       Thread1 obj = new Thread1();
//       obj.start();
//       Thread2 obj1 = new Thread2();
//       obj1.start();


//        QUESTIONS -03
//        Thread1 t1 = new Thread1();
//        Thread1 t2 = new Thread1();
//        Thread1 t3 = new Thread1();
//
//        System.out.println("The Thread1 Priority is "+t1.getPriority());
//        System.out.println("The Thread2 Priority is "+t2.getPriority());
//        System.out.println("The Thread3 Priority is "+t3.getPriority());
//
//        System.out.println("After changing");
//        t1.setPriority(2);
//        t2.setPriority(5);
//        t3.setPriority(8);
//
//        System.out.println("Now the thread1 Priority is "+t1.getPriority());
//        System.out.println("The Thread2 Priority is "+t2.getPriority());
//        System.out.println("The Thread3 Priority is "+t3.getPriority());

//        Question-04
//        Thread1 t = new Thread1();
//        Thread obj = new Thread(t);
//        obj.start();

//        Question-05
        Thread1 t = new Thread1();
        Thread1 t1 = new Thread1();
        t.start();
        t1.start();
    }
}
