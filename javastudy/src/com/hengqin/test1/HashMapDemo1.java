package com.hengqin.test1;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

//Map存放数据的最终目的实际上就是为了信息的查找，collection存放数据的目的是为了输出.\
//Hashtable的 key和value都不允许设置成null
public class HashMapDemo1 {
    public static void main(String[] args) throws Exception {
        Map<String,Integer>map = new HashMap<String,Integer>();
        Map<String,Integer>map2 = new Hashtable<String, Integer>();
        map.put("一",1);
        map.put("二",2);
        map.put("三",3);
        map.put(null,0);
        map2.put("一",1);
        map2.put("二",2);
        map2.put("三",3);
        //map2.put(null,0);
        System.out.println(map2);
        Set<String> keys = map.keySet();//取得全部的key
        Collection<Integer> values = map.values();
        Iterator<String> iter =keys.iterator();
        Iterator<Integer> iter2 = values.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+"\t");
            System.out.println(iter2.next()+"\t");
        }
//        System.out.println(map.get("一"));
//        System.out.println(map.get("yi"));//如果key不存在，返回null
//        System.out.println(map.get(null));
    }
}
