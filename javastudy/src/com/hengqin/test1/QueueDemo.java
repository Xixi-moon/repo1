package com.hengqin.test1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add(new String("Harry"));
        System.out.println(q);
    }
}
