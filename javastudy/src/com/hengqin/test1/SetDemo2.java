package com.hengqin.test1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set <String> hs = new HashSet<>();
        long totaltime = 0;

        for (int x = 0;x<10;x++){
            Scanner in = new Scanner(System.in);
            String word = in.next();
            long calltime = System.currentTimeMillis();
            hs.add(word);
            calltime = System.currentTimeMillis() - calltime;
            totaltime+=calltime;
        }


        Iterator<String> iter = hs.iterator();
        for (int i = 1; i<=10 && iter.hasNext();i++){
            System.out.print(iter.next()+"\t");
        }
        System.out.println();
        System.out.println(hs.size()+ " distinct words."+totaltime+" milliseconds");
    }
}
