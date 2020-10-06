package com.hengqin.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("jwoevhoweh");
        c.add("888888");
        c.add("wuge");
        c.add("yueyue");
        // 迭代器循环输出
        System.out.println("删除之前："+c);
        Iterator<String> iter = c.iterator();
        iter.next();
        iter.remove();
        iter.next();
        iter.remove();
        System.out.println("删除之后："+c);
        //迭代器循环输出
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
        // foreach循环输出
        for(String x:c){
            System.out.println(x);
        }
    }
}


