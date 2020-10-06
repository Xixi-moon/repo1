package com.hengqin.test1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomDemo1 {
    public static void main(String[] args) {
        int r = 0;
        Random random = new Random();
        Set<Integer> set = new TreeSet<>();
        while (set.size()<7){
            r = random.nextInt(37);
            if (r!=0){
                set.add(r);
            }
        }
        for (int x:set){
            System.out.print(x+"\t");
        }
    }
}
