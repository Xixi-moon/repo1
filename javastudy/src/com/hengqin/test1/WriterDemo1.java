package com.hengqin.test1;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo1 {
    public static void main(String[] args) throws Exception {
        //定义要输入文件的路径
        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
        if (!file.getParentFile().exists()){
            file.mkdir();
        }
        //通过子类实例化父类对象
        Writer writer = new FileWriter(file,true);
        //进行写操作
        String str = "hello world";
        writer.write(str);
        writer.flush();

    }
}
