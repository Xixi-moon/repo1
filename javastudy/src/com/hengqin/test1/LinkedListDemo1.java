package com.hengqin.test1;


import java.util.*;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add(0,"1");
        list.add("Amy");
        list.add("Bob");
        list.add(1,"2");
        list.add("Carl");
        list.addFirst("djwojc");
        List<String> list1 = new ArrayList<>();
        list1.add("AMY");
        list1.add("Bob");
        list.removeAll(list1);


        System.out.println(list);
        System.out.println(list.indexOf(1));//-1
        System.out.println(list.indexOf("1"));//1

        Iterator<String> iter = list.iterator();
        iter.next();
        iter.next();
        iter.remove();
        list.removeLast();
        System.out.println(list);

        ListIterator<String> iter2 = list.listIterator();
        iter2.next();
        iter2.add("xjoqiwhc");
        System.out.println(list);
        while (iter2.hasPrevious()){
            String str = iter2.previous();
            System.out.print(str+"\t");
        }
    }
}
