package com.hengqin.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo1 {
    public static void main(String[] args)throws Exception {
        //1、定义要输入文件的路径
        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
        //需要判断文件是否存在后，才可以进行读取
        if (file.exists()){
            //2、使用InputStream读取
            InputStream inputStream = new FileInputStream(file);
            //3、进行数据读取
            byte [] bytes = new byte[1024];
            int foot = 0;
            int temp = 0;
            while ((temp = inputStream.read())!=-1){
                bytes[foot++] = (byte) temp;
            }
            //4、关闭输入流
            inputStream.close();
            System.out.println("["+new String(bytes,0,foot)+"]");
        }
    }
}
