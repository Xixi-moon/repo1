package com.hengqin.test1;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //1、定义输出文件的路径
        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
        if (!(file.getParentFile().exists())){  //文件目录不存在
            file.getParentFile().mkdir();  //创建目录
        }
        //2、使用Outputstream与其子类进行对象的实例化,此时目录存在，文件不存在。
        OutputStream outputStream = new FileOutputStream(file,true);
        //3、进行文件内容的输出
        String str = "weishenmene \r\n";
        byte [] bytes = str.getBytes();
        outputStream.write(bytes);
        //4、资源操作后一定要进行关闭
        outputStream.close();
    }
}
