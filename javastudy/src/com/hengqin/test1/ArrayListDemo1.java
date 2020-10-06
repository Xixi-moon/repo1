package com.hengqin.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello ");
        list.add("World ");
        list.add("!!!");
        // foreach遍历
        for(String str:list){
            System.out.print(str);
        }
        System.out.println();
        // 将链表转为数组输出
        String [] str1 = new String[list.size()];
        list.toArray(str1);
        for (int i =0; i<str1.length;i++){
            System.out.print(str1[i]);
        }
        System.out.println();
        // 用迭代器遍历
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

        // ArrayList求和
        System.out.println();
        int sum = 0;
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i =1;i<11;i++){
            list1.add(i);
        }
        for (Integer x :list1){
            sum+=x;
        }
        System.out.println(sum);
    }
}
