package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Full marks in each subject");
        int max = sc.nextInt();
                max=max*5;
        System.out.println("First Subject Marks");
        int n1 = sc.nextInt();
        System.out.println("Second Subject Marks");
        int n2 = sc.nextInt();
        System.out.println("Third Subject Marks");
        int n3 = sc.nextInt();
        System.out.println("Fourth Subject Marks");
        int n4 = sc.nextInt();
        System.out.println("Fifth Subject Marks");
        int n5 = sc.nextInt();

        int total=(n1+n2+n3+n4+n5);
        float percentage=((float)total/max)*100;
        System.out.println("Percentage is: "+percentage);

    }
}
