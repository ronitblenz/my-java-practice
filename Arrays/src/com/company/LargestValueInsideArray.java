package com.company;

public class LargestValueInsideArray {

    public static void main(String[] args) {
        int[]arr={1,21,3,455,5,34,67};
        int max=0;
        for(int element:arr)
        {
            if (element>max) {

                max=element;
            }
        }
        System.out.println("The maximum element is "+max);
    }
}
