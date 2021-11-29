package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int firstNo,secondNo,Add;
        System.out.println("Enter the 1st no: ");
        firstNo=sc.nextInt();
        System.out.println("Enter the 2nd no: ");
        secondNo=sc.nextInt();

        Add=firstNo+secondNo;
        System.out.println("The Sum is: "+Add);
    }
}
