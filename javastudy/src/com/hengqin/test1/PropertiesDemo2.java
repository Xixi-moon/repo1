package com.hengqin.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception{
        Properties pro = new Properties();
        pro.setProperty("BJ","beijing");
        pro.setProperty("TJ","tianjin");
        pro.setProperty("YZ","yangzhou");
        pro.load(new FileInputStream(new File("D:"+File.separator+"area.properties")));
        System.out.println(pro.getProperty("BJ"));

        //设置属性文件的保存路径
        File file = new File("D:"+File.separator+"area.xml");
        try {
            //保存属性到普通文件中，并设置注释内容
            pro.storeToXML(new FileOutputStream(file),"Area Info");
        }catch (Exception e){
            e.printStackTrace();
        }
        //设置属性文件的操作路径
        File file1 = new File("D:"+File.separator+"area.xml");
        try {
            pro.loadFromXML(new FileInputStream(file));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(pro.getProperty("TJ"));

    }


}
