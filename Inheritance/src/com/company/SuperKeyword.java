package com.company;
class CSE{
    int a;
    public int getA() {
        return a;
    }
    CSE(int a){
        this.a=a;     //this keyword helps to reference an object of a class which is already being created .
        // Here a=a(It clears the confusion of the compiler)
    }
    public int return1()
    {
        return 1;
    }
}
class Derived1 extends CSE{

    Derived1(int c){
       super(c);

        System.out.println("I am a constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        CSE c=new CSE(56);
        Derived1 d=new Derived1(8);
        System.out.println(c.getA());
        System.out.println(d.getA());
    }
}
