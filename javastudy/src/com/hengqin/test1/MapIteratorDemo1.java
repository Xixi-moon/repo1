package com.hengqin.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorDemo1 {
    public static void main(String[] args) throws Exception{
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("壹",1);
        map.put("贰",2);
        map.put("叁",3);
        map.put("壹",2);

        //通过Map.keySet遍历key和value
        for(String key:map.keySet()){
            System.out.println("key="+key+",value="+map.get(key));
        }
        System.out.println("****************");
        //通过Map.entrySet使用Iterator遍历key和value
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        System.out.println("****************");
        //容量大时，用
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        System.out.println("****************");

        for (int x :map.values()){
            System.out.println(x);
        }


//        //将Map集合变为Set集合，目的是为了使用iterator()方法
//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
//        while (iter.hasNext()){
//            Map.Entry<String,Integer> me = iter.next();
//            System.out.println(me.getKey()+"="+me.getValue());
//        }
    }
}
