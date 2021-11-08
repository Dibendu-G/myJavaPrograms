package com.company;

public class Ch7_Methods_Overloading {
    static void tellajoke(){
        System.out.println("I invented a new word Plagiarism");
    }
    static void change(int x){
        x=48;
    }
    static void Change2(int[]a){
        a[0]=45;
    }
    static void foo(){
        System.out.println("Good Morning Samrat Bhai");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Samrat Bhai");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning "+a+" Samrat Bhai");
        System.out.println("Good Morning "+b+" Samrat Bhai");
    }    public static void main(String[] args) {
//        tellajoke();

//        Changing An integer using method
//        int a=4;
//        change(a);
//        System.out.println("After Changing the value of a is: "+a);

//        Changing an Array using Method
//        int [] marks ={78,85,65,98};
//        Change2(marks);
//        System.out.println("The value of array 0 is: "+marks[0]);
//        foo();
//        foo(3000);
//        foo(6500,4000);
    }
}
