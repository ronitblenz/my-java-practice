package com.company;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,34,67,875,923};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }

        if(isSorted)
        { System.out.println("Array is sorted");}
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
