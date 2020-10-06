package com.hengqin.test1;

import java.util.Arrays;

class Array{
    private int [] array;
    private int foot;
    public Array(int len){
        if (len>0){
            this.array = new int[len];
        }else {
            this.array = new int[1];
        }
    }
    public void add(int data){
        if (foot<this.array.length){
            this.array[foot] = data;
            foot++;
        }else {
            return;
        }
    }
    public int getData(int index){
        return this.array[index];
    }
    public void getAllDta(){
        for(int x = 0;x<array.length;x++){
            System.out.println(array[x]);
        }
    }
    public int [] getArray(){
        return this.array;
    }
}

class SortArray extends Array{
    public SortArray(int len) {
        super(len);
    }
    public void  sortArray(){
        java.util.Arrays.sort(super.getArray());
    }
}

class ReverseArray extends Array{

    public ReverseArray(int len) {
        super(len);
    }
    public void reverseArray(){
        int lastindex = super.getArray().length-1;
        int firstindex = 0;

        for (int x = lastindex;x>lastindex/2;x--){
            int a = super.getArray()[firstindex];
            super.getArray()[firstindex++] = super.getArray()[x];
            super.getArray()[x] = a;
        }
    }
}
public class ArrayExtendsDemo {
    public static void main(String[] args) {
        SortArray arr = new SortArray(3);
        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.sortArray();
        System.out.println("排序测试：");
        arr.getAllDta();
        ReverseArray arr2 = new ReverseArray(6);
        arr2.add(6);
        arr2.add(4);
        arr2.add(2);
        arr2.add(5);
        arr2.add(3);
        arr2.add(1);
        arr2.reverseArray();
        System.out.println("反转测试：");
        arr2.getAllDta();
    }
}
