package com.company;
class Employee{
    int id;
    String name;
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }

}
public class DemoOfOwnJavaClass {
    public static void main(String[] args) {
        Employee harry=new Employee();
        Employee raj=new Employee();
        harry.id=13;
        harry.name="CodeWithHarry";
        raj.id=1130;
        raj.name="RonitBanerjeeCodes";
        harry.printDetails();
        raj.printDetails();
    }
}
