package com.company;

public class SumofFirstNnumbersRecursion {
    static int SumRec(int n){
        if(n==1)
        {
            return 1;
        }
        return n + SumRec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(SumRec(4));
    }
}
