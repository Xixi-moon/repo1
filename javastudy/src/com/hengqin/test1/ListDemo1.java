package com.hengqin.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //增加元素
        list.add(0,"jiayou");
        list.add(1,"jiayou");
        list.add(2,"xuexi");
        list.add(3,"shiwo");
        list.add(4,"kuaile");
        System.out.println("添加完之后："+list);
        //删除元素
        list.remove(2);
        list.remove(1);
        System.out.println("删除元素之后："+list);
        //获取数据
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        //设置数据，可用来修改数据
        list.set(0,"xuexi");
        //list.set(4,"jiayou"); // IndexOutOfBoundsException
        System.out.println(list);
    }
}
