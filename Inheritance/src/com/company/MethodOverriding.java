package com.company;
class A{
    int a;
    public void meth2(){
        System.out.println("I AM METHOD 2 OF CLASS A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("I AM METHOD 2 OF CLASS B");
    }
    public void meth3(){
        System.out.println("I AM METHOD 3 OF CLASS B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.meth2();
        b.meth2();
    }
}
