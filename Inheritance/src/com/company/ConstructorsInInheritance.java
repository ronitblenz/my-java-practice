package com.company;
class One{
    One(){
        System.out.println("I am the main Constructor");
    }
}
class Two extends One{
    Two(){
        System.out.println("I am the derived constructor");
    }
}
public class ConstructorsInInheritance {
    public static void main(String[] args) {

        One n=new One();
        Two d=new Two();
    }
}
