package com.hengqin.test1;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int [] arr = new int[]{5,3,2,4,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,3));
        int [] arr2 = new int[]{3,2,4,3,6,5};
        int [] arr3 = new int[]{2,3,3,4,5,6};
        System.out.println(Arrays.equals(arr,arr2));
        System.out.println(Arrays.equals(arr,arr3));
    }
}
