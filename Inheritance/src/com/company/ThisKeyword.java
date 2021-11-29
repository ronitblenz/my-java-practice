package com.company;
class Ekclass{
    int a;

    public int getA() {
        return a;
    }
    Ekclass(int a){
        this.a=a;     //this keyword helps to reference an object of a class which is already being created .
        // Here a=a(It clears the confusion of the compiler)

    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(65);
        System.out.println(e.getA());
    }
}
