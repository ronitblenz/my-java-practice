package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("This is an Organisational Website");
        }
        if(website.endsWith(".com"))
        {
            System.out.println("This is a Commercial Website");
        }
        if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian Website");
        }
    }
}
