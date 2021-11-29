package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f)
        {
            tax=tax+0;
        }
        else if(income>2.5f && income<=5.0f)
        {
            tax=tax+0.05f*(income-2.5f);
        }
        else if(income>5.0f && income<=10f)
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.02f*(income-5f);
        }
        else if(income>10f)
        {
            tax=+0.05f*(5.0f-2.5f);
            tax=+0.2f*(10.0f-2.5f);
            tax=+0.3f*(income-10f);
        }
        System.out.println("Tax to be paid is "+tax);
    }

}