package com.company;
//class employee{
//    int salary;
//    String name;
//        public int getSalary(){
//            return salary;
//        }
//        public String getName(){
//            return name;
//        }
//        public void setName(String n){
//            name=n;
//        }
//}
//class cellphone{
//    public void ring(){
//        System.out.println("Ringing....");
//    }
//    public void vib(){
//        System.out.println("Vibrating....");
//    }
//}
//class Square{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}
//class rectangle{
//    int length;
//    int wedith;
//    public int area(){
//        return wedith*length;
//    }
//    public int perimeter(){
//        return 2*(length+wedith);
//    }
//}
//class TommyVecetti{
//    public void hit(){
//        System.out.println("Hitting the Enemy...");
//    }
//    public void run(){
//        System.out.println("Running form Enemy...");
//    }
//    public void firing(){
//        System.out.println("Enemy is Firing....");
//    }
//}
class circle{
    float radius;
    public float area(){
        return (float) (3.14*radius*radius);
    }
    public float circumfrances(){
        return (float) (2*3.14*radius);
    }
}
public class CH8_PracticeSet {
    public static void main(String[] args) {

//        Problem-01
//        employee samrat = new employee();
//        samrat.salary=1456;
//        samrat.setName("Code With Dibendu");
//        System.out.println(samrat.getName());
//        System.out.println(samrat.getSalary());

//        Problem-02
//        cellphone sc = new cellphone();
//        sc.ring();
//        sc.vib();

//        Problem-03
//        Square bc = new Square();
//        bc.side =54;
//        System.out.println("Area of Given Square is "+bc.area());
//        System.out.println("Perimeter of Given Square is "+bc.perimeter());

//        Problem-04
//        rectangle rc = new rectangle();
//        rc.length=14;
//        rc.wedith=7;
//        System.out.println("Area of Given Square is "+rc.area());
//        System.out.println("Perimeter of Given Square is "+rc.perimeter());

//        Problem-05
//        TommyVecetti tc = new TommyVecetti();
//        tc.firing();
//        tc.hit();
//        tc.run();

//        Problem-06
        circle c = new circle();
        c.radius=4;
        System.out.println("Circumfrances of circle is "+c.circumfrances());
        System.out.println("Area of circle is "+c.area());
    }
}
