package com.hengqin.test1;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
//        int [] data =new int[3];
//        for(int x=0;x<data.length;x++){
//            data[x]=x+1;
//        }
//        for(int x=0;x<data.length;x++){
//            System.out.print(data[x]+"\t");
//        }
//        System.out.println();
//        int [] temp =data;
//        temp[1]=111;
//        System.out.println("数组引用后:");
//        for(int x=0;x<data.length;x++){
//            System.out.print(+data[x]+"\t");
//        }

        //数组的排序
//        int [] data= new int[]{3,5,6,9,8,7,4,2,1};
//        print(data);
//        System.out.println("\n"+"排序后");
//        sort(data);
//        print(data);
//
        //数组的转置
//        int [] data =new int[]{1,3,5,7,9,2,4,6,8};
//        print(data);
//        System.out.println("\n"+"转置后");
//        reverse(data);
//        print(data);
        //数组的拷贝
        int [] dataA= new int[]{1,2,3,4,5,6,7,8};
        int [] dataB = new int[]{11,22,33,44,55,66,77,88};
        System.arraycopy(dataA,4,dataB,2,3);
        print(dataB);
        System.out.println();
        Arrays.sort(dataB);
        print(dataB);
    }
//    public static void sort(int [] temp){
//        for(int x=0;x<temp.length;x++){
//            for(int y=0;y<temp.length-1;y++){
//                if(temp[y]>temp[y+1]){
//                    int t = temp[y];
//                    temp[y]=temp[y+1];
//                    temp[y+1]=t;
//                }
//            }
//        }
//    }

    public static void reverse(int [] temp){
        int y=temp.length-1;
        for(int x=0;x<temp.length/2;x++){
           int t = temp[x];
           temp[x]=temp[y];
           temp[y]=t;
           y--;
        }
    }
    public static void print(int [] temp){
        for(int x=0;x<temp.length;x++){
            System.out.print(temp[x]+"\t");
        }
    }

}
