package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float v;
        float u;
        float a;
        float s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter V: ");
        v = sc.nextFloat();
        System.out.println("Enter U: ");
        u = sc.nextFloat();
        System.out.println("Enter A: ");
        a = sc.nextFloat();
        System.out.println("Enter S: ");
        s = sc.nextFloat();

        float result=(v*v-u*u)/2*a*s;
        System.out.println("The Result is: "+result);
    }
}