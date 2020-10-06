package com.hengqin.test1;

import java.util.*;

public class IteratorDemo1 {
    public static void main(String[] args) throws Exception{
        List<String> all = new ArrayList<String>();
        all.add("A");
        all.add("b");
        all.add("c");
        for (String str :all){
            System.out.println(str);
        }
        System.out.println("由前向后输出：");
        ListIterator<String> iter = all.listIterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.print(str+"、");
        }
        System.out.println("\n由后向前输出：");
        while (iter.hasPrevious()){
            System.out.print(iter.previous()+"、");
        }
    }
}
