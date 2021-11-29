package com.company;

public class GoodMorningMethodOverloading {
    static void foo()
    {
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a)
    {
        System.out.println("Good Morning "+a+" Bro!");
    }
    static void foo(int a,int b)
    {
        System.out.println("Good Morning "+a+" "+b+" Bro!");
    }

    public static void main(String[] args) {
        foo();
        foo(1000);
        foo(3000,4000);
    }
}
