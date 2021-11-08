package com.company;
interface MyCammera2{
    void takingSnap();
    void ClickingSelfie();
    default void greet(){
        System.out.println("Good Morning");
    }
    private void wish(){
        System.out.println("Happy Birthday");
    }
}
interface MyWifi2{
    String[] GettingNetworks();
    void ConnectingWifi();
}
class MyCellphone2{
    void MakeCall(int PhoneNumber){
        System.out.println("Making a Call..."+PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting......");
    }
}
class MySmartphone2 extends MyCellphone2 implements MyWifi2,MyCammera2{
    public void takingSnap(){
        System.out.println("Taking Snap....");
    }
    public void ClickingSelfie(){
        System.out.println("Clicking Selfie....");
    }
    public void Mth1(){
        System.out.println("This is Meth1");
    }
    public String[] GettingNetworks(){
        System.out.println("Getting Networks List...");
        String[] NetworksList = {"Samrat","Rakhi","Shriti"};
        return NetworksList;
    }
    public void ConnectingWifi(){
        System.out.println("Connecting to Wifi....");
    }
}
public class Ch11_Polymorphism {
    public static void main(String[] args) {
        MyCammera2 cam1 = new MySmartphone2(); //use only cammera on this smartphone
        cam1.ClickingSelfie();
//        cam1.MakeCall(); ---> It will give error

        MySmartphone2 s = new MySmartphone2();
        s.Mth1();
        s.GettingNetworks();
        s.takingSnap();
        s.ClickingSelfie();
    }
}
