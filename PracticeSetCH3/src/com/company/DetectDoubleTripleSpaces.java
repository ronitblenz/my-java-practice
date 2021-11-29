package com.company;

public class DetectDoubleTripleSpaces {
    public static void main(String[] args) {
        String hey ="I  love   Coding";

        System.out.println(hey.indexOf("   "));
        System.out.println(hey.indexOf("  "));
    }
}
