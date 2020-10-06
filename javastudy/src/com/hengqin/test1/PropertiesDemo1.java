package com.hengqin.test1;

import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        pro.setProperty("BJ","beijing");
        pro.setProperty("TJ","tianjin");
        System.out.println(pro.getProperty("BJ"));
        System.out.println(pro.getProperty("GZ"));
        System.out.println(pro.getProperty("SC","have no found"));
    }
}
