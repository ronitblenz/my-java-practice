package com.company;
class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class CylinderHeightRadius {
    public static void main(String[] args) {
        cylinder lpg=new cylinder();
        lpg.setHeight(12);
        System.out.println(lpg.getHeight());
        lpg.setRadius(7);
        System.out.println(lpg.getRadius());

    }
}
