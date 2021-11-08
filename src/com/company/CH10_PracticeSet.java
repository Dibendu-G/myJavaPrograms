package com.company;
class Circles
{
    int radius;
    Circles(int r){
        this.radius=r;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double diameters()
    {
        return 2* radius;
    }
    public double circumference()
    {
        return 2 * Math.PI *radius;
    }
}
class cylinders extends Circles{
    int height;
    cylinders(int r , int h){
        super(r);
        this.height=h;
    }
    public double surfaceArea(){
        return (2* Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
}
class Rectangle1{
    int width;
    int length;

    public Rectangle1(int width, int length)
    {
        this.width = width;
        this.length = length;
    }
    public int area(){
        return width*length;
    }
    public void GetArea(){
        System.out.println(area());
    }
    public int perimeter(){
        return 2*(length+width);
    }
    public void getPerimeters(){
        System.out.println(perimeter());
    }
}
class cuboid extends Rectangle1{
    int height;
    cuboid(int w, int l , int h){
        super(w, l);
        this.height=h;
    }
    public int surfaceArea(){
        return 2*(width*length+height*length+height*width);
    }
    public void getSurfaceArea(){
        System.out.println(surfaceArea());
    }
    public int volume(){
        return width*height*length;
    }
    public void getVolume(){
        System.out.println(volume());
    }
}
public class CH10_PracticeSet {
    public static void main(String[] args) {

//        Problem -01
//        Circles c = new Circles(14);
//        System.out.println(c.area());
//        System.out.println(c.diameters());
//        System.out.println(c.circumference());
//
//        cylinders obj = new cylinders(14,8);
//        System.out.println(obj.surfaceArea());
//        System.out.println(obj.area());

//        problem-02
            Rectangle1 r = new Rectangle1(4,5);
        r.getPerimeters();
        r.GetArea();

        cuboid c = new cuboid(4,5,6);
        c.getVolume();
        c.getSurfaceArea();
    }
}
