package com.hengqin.test1;

import java.util.Arrays;
import java.lang.Math;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5};
        // for each 循环
        for (int element : a){
            System.out.println(element);
        }
        // 返回一个包含数组元素的字符串
        String b = Arrays.toString(a);
        System.out.println(Arrays.toString(a));

        //数组拷贝
        int [] copieda = Arrays.copyOf(a,2*a.length);
        System.out.println(Arrays.toString(copieda));

        //命令行参数
        if (args.length==0 || args[0].equals("-h")){
            System.out.println("Hello");
        }else if(args[0].equals("-g")){
            System.out.println("Goodbye");
        }
        for(int i = 1; i<args.length;i++){
            System.out.println(" "+args[i]);
        }
        System.out.println("!");

        //数组排序
        int [] data = new int[]{2,5,6,4,1,9,7,3,0};
        int [] datasort = new int[data.length];
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        //生成随机数
        int n = 100;
        int [] numbers = new int[n];
        int [] result = new int[20];
        for(int i = 0; i<numbers.length;i++){
            numbers[i]=i+1;
        }
        for (int x = 0 ; x<result.length; x++){
            int r = (int)(Math.random()*n);
            // 随机输出50~100的数
            if(r<50){
                x--;
            }else {
                result[x] = numbers[r];
                // 产生不重复的数字
                //将当前的数字用数组的最后一个数字代替，再改变数组大小，删掉数组的最后一个数字
                numbers[r] = numbers[n-1];
                n--;
            }

        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));


    }
}

