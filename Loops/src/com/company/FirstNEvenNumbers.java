package com.company;
import java.util.Scanner;
public class FirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(2*i);
        }
    }
}