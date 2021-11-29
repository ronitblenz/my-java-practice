package com.company;
class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class RectangleConstructor {
    public static void main(String[] args) {
        rectangle rec=new rectangle(12,56);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
        System.out.println("The perimeter is = "+((rec.getBreadth())+(rec.getLength()))*2);
    }
}
