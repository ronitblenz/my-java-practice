package com.company;

public class MethodInvocation {
    static int logic(int x, int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(a+" "+b);
        int a1=2,b1=1,c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }

}
