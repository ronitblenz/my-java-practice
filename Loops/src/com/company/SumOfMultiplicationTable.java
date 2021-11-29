package com.company;

public class SumOfMultiplicationTable {
    public static void main(String[] args) {
        int n=7,sum=0;
        for (int i=1;i<=10;i++)
        {
            sum+=n*i;
        }
        System.out.println(sum);
    }
}
