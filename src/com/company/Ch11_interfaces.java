package com.company;
interface bicycle{
    int a =45;
    void speedup(int increment);
    void Brake(int decrement);
}
interface horn{
    void hornMHN();
    void hornK3G();
}
class Avoncycle implements bicycle{
    void blowhorn(){
        System.out.println("pee poo pee");
    }
   public  void speedup(int increment){
        System.out.println("Speeding Up");
    }
  public  void Brake(int decrement){
      System.out.println("Applying Brake");
  }
}
class Herocycle implements horn{
    void blowhorn(){
        System.out.println("pee pooo pee poooo");
    }
    public void hornMHN(){
        System.out.println("Main Hooon Nah");
    }
    public void hornK3G(){
        System.out.println("Kabhi Kushi Gam");
    }
}
public class Ch11_interfaces {
    public static void main(String[] args) {
        Avoncycle cycle = new Avoncycle();
        cycle.speedup(5);
        cycle.Brake(4);
        cycle.blowhorn();
        Herocycle bike = new Herocycle();
        bike.blowhorn();
        bike.hornK3G();
        bike.hornMHN();
    }
}
