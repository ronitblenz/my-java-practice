package com.company;
class Phone{
    public void welcome(){
        System.out.println("Good Morning Sir");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Best of luck for your day");
    }
    public void on() {
        System.out.println("Turning on Smartphone");
    }
}

public class DynamicMemoryDispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        obj.welcome();
        obj.on();
    }
}
