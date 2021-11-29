package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	 double dist;
        System.out.println("Distance in KM: ");
        Scanner sc=new Scanner(System.in);
        dist=sc.nextDouble();
        dist = (dist * 0.621371);
        //updated dist value
        System.out.println("Distance in MILES: "+dist);

    }
}
