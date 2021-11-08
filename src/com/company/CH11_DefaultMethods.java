package com.company;
interface MyCammera{
    void takingSnap();
    void ClickingSelfie();
    default void greet(){
        System.out.println("Good Morning");
    }
    private void wish(){
        System.out.println("Happy Birthday");
    }
}
interface MyWifi{
    String[] GettingNetworks();
    void ConnectingWifi();
}
class MyCellphone{
    void MakeCall(int PhoneNumber){
        System.out.println("Making a Call..."+PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting......");
    }
}
class MySmartphone extends MyCellphone implements MyWifi,MyCammera{
    public void takingSnap(){
        System.out.println("Taking Snap....");
    }
    public void ClickingSelfie(){
        System.out.println("Clicking Selfie....");
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
public class CH11_DefaultMethods {
    public static void main(String[] args) {
        MySmartphone mg = new MySmartphone();
        mg.ClickingSelfie();
        String[] ar = mg.GettingNetworks();
        for (String item: ar ) {
            System.out.println(item);
        }
        mg.greet();
//        mg.wish();--> Throws an error!
    }
}
