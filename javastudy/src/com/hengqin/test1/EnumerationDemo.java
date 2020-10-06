package com.hengqin.test1;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> all =new Vector<String>();
        all.add("A");
        all.add("B");
        all.add("D");
        Enumeration<String> enu = all.elements();
        while (enu.hasMoreElements()){
            System.out.print(enu.nextElement()+"、");
        }
    }
}
