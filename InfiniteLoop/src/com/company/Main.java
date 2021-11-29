package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Infinite Loop
        long i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your no.: ");
        i=sc.nextLong();
        while(i>0)
        {
            System.out.println(i++);
        }


    }
}
