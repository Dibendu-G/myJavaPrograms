package com.company;
class MyMainEmployee{
    private int id;
    private String name;
    private  int salary;
    public MyMainEmployee(){
        name="Raqnchod Das";
        id=12;
        salary=10000;
    }
public MyMainEmployee(String MyName, int MyId,int MySalary){
    name=MyName;
    id=MyId;
    salary=MySalary;
}
public void setSalary(int s){
        salary=s;
}
public int getSalary(){
        return salary;
}
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class CH9_Constructor {
    public static void main(String[] args) {
        MyMainEmployee samrat = new MyMainEmployee();
        System.out.println(samrat.getId());
        System.out.println(samrat.getName());
        System.out.println(samrat.getSalary());
    }
}
