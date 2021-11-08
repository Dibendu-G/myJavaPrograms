package com.company;
class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class animal{
    public void Speak(){
        System.out.println("Bark.............,");
    }
}
class dog extends animal{
    public void angry(){
        System.out.println("woah woah ......");
    }
}
public class CH10_Inheritance {
    public static void main(String[] args) {

//        Base Class

        base b = new base();
        b.setX(24);
        System.out.println(b.getX());

//        Derived class from base

        derived d = new derived();
        d.setY(56);
        System.out.println(d.getY());
        d.setX(45);
        System.out.println(d.getX());

//        Quick-Quiz
//        animal a = new animal();
//        a.Speak();
//        dog e = new dog();
//        e.angry();
//        e.Speak();
    }
}
