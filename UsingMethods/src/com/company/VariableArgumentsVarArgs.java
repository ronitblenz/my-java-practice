package com.company;

public class VariableArgumentsVarArgs {
    static int sum(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum is "+sum(4,5));
        System.out.println("Sum is "+sum(4,5,7));
        System.out.println("Sum is "+sum(8,3,1,9));
        System.out.println("Sum is "+sum(10,12,15,20,18));

    }
}
