package com.company;
class a{
    int a;
    public int Samrat(){
        return 4;
    }
    public void meth2(){
        System.out.println("I'm Method 2 of Class A");
    }
    }
    class b extends a{
    public void meth2(){
        System.out.println("I'm Method 2 Of Class B");
    }
    public void meth3(){
        System.out.println("I'm Method 3 of Class B");
    }
    }
public class CH10_Method_Overriding {
    public static void main(String[] args) {
        a A = new a();
        A.meth2();
        b B = new b();
//        B.meth3();
        B.meth2();
    }
}
