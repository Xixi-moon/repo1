package com.hengqin.test1;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo1 {
    public static void main(String[] args) {
        Set<Item1> parts = new TreeSet<Item1>();
        parts.add(new Item1(1234,"Toaster"));
        parts.add(new Item1(4562,"Widget"));
        parts.add(new Item1(9921,"Modem"));
        System.out.println(parts);

       Set sortByDescription = new TreeSet<Item1>(Comparator.comparing(Item1::getDescription));
       sortByDescription.addAll(parts);

       System.out.println(sortByDescription);
    }
}
