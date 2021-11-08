package com.company;
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float surfacearea(){
        return (float)(2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }
    public float volume(){
        return (float)(Math.PI*radius*radius*height);
    }
}
class Rectangle{
    public int length;
    public int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float volume(){
        return (float)(1.333*Math.PI*radius*radius*radius);
    }
    public  float surfacearea(){
        return (float)(4*Math.PI*radius*radius);
    }
}
public class CH9_PracticeSet_Soln {
    public static void main(String[] args) {

//        Problem -01

        cylinder mycylinder = new cylinder(6,5);
//        mycylinder.setHeight(6);
//        mycylinder.setRadius(5);
//        System.out.println(mycylinder.getHeight());
//        System.out.println(mycylinder.getRadius());

//        Problem-02

//        System.out.println("The Surface Area is " +mycylinder.surfacearea());
//        System.out.println("The volume is "+mycylinder.volume());

//        Problem-03
//        cylinder mycylinder = new cylinder(6,5);

//        Problem-04
//        Rectangle r = new Rectangle(15,58);
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());

//        Problem-05
        sphere mysphere = new sphere();
        mysphere.setRadius(4);
        System.out.println("The volume of Sphere is "+mysphere.volume());
        System.out.println("The Surface Area of Sphere is "+mysphere.surfacearea());
    }
}
