package com.company;
import java.util.Scanner;
public class WhileDemo {

    //Write a program print natural numbers
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        while(i<=10000)
        {
            System.out.println(i);
            i++;
        }
    }
}
