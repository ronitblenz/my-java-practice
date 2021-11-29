package com.company;

public class Factorial {
    public static void main(String[] args) {
        int n=5,i=1,factorial=1;
        while(i<=n)
        {
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
}
