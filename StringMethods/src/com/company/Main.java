package com.company;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name="   Ronit   "; //1
        System.out.println(name.length());  //2
        System.out.println(name.toLowerCase());  //3
        System.out.println(name.toUpperCase());  //4
        System.out.println(name.trim());  //5
        System.out.println(name.substring(4));  //6
        System.out.println(name.substring(4,7));  //7
        System.out.println(name.replace('R','p'));  //8
        System.out.println(name.startsWith("   Ro"));  //9
        System.out.println(name.endsWith("it   "));  //10
        System.out.println(name.charAt(5));  //11
        System.out.println(name.indexOf("n"));  //12
        System.out.println(name.indexOf("n",3));  //13
        System.out.println(name.lastIndexOf("i"));  //14
        System.out.println(name.lastIndexOf("i",7));  //15
        System.out.println(name.equals("   ronit   "));  //16
        System.out.println(name.equalsIgnoreCase("   ronit   "));  //17

    }
}
