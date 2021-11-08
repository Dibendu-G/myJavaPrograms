package com.company;
abstract class pen{
        abstract void write();
        abstract void refill();
        }
        class myPen extends pen{
     void write(){
        System.out.println("Writing.....");
    }
     void refill(){
        System.out.println("Refilling....");
    }
 }
 class fountainPen extends pen{
    void write(){
        System.out.println("Writing....");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changingNib(){
        System.out.println("Changing Nib.....");
    }
 }
 class Monkey{
    public void jump(){
        System.out.println("Jumping....");
     }
     public void bite(){
         System.out.println("Biting.......");
     }
 }
 interface basicAnimal{
    void eat();
    void sleep();
 }
 class Human extends Monkey implements basicAnimal{
    @Override
    public void eat(){
         System.out.println("Eating....");
     }
     public void sleep(){
         System.out.println("Sleeping....");
     }
 }
 abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
 }
 class tel extends telephone{
     @Override
     void ring() {
         System.out.println("ringing...");
     }

     @Override
     void disconnect() {
         System.out.println("disconnecting...");
     }

     @Override
     void lift() {
         System.out.println("Lifting.....");
     }
 }
 class Smartphone3 extends telephone{
    @Override
    void lift() {
        System.out.println("Lifting on smartphone...");
    }

     @Override
     void disconnect() {
         System.out.println("Disconnecting on Smartphone...");
     }

     @Override
     void ring() {
         System.out.println("Ringing on Smartphone....");
     }
 }
// Question-06
 interface tvRemote {
    void switchOn();
    void switchOff();
 }
 interface SmartTvRemote extends tvRemote{
    void playMusic();
 }
 class tv implements tvRemote, SmartTvRemote{
    public void switchOn(){
         System.out.println("On the T.v .....");
     }
     public void switchOff(){
         System.out.println("Shutting down the T.v .....");
     }
     public void playMusic(){
         System.out.println("Playing Music On T.v .....");
     }
 }
public class CH11_PracticeSet_Soln {
    public static void main(String[] args) {
//        Question-01
        myPen p = new myPen();
        p.write();
        p.refill();
//      Question-02
        fountainPen fp = new fountainPen();
        fp.changingNib();

//        question-03
        Human h = new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();

//        Question-04
        telephone t = new Smartphone3();
        t.disconnect();
        t.lift();
        t.ring();

        tel te = new tel();
        te.disconnect();
        te.lift();
        te.ring();

//        Question - 05
        basicAnimal ba = new Human();
        ba.eat();                                   //Polymorphism on question 3
        ba.sleep();

//        question-07
        tv r = new tv();
        r.playMusic();
        r.switchOn();
        r.switchOff();
    }
}
