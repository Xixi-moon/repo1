package com.hengqin.test1;

import java.io.*;

public class OutputStreamWriterDemo1 {
    public static void main(String[] args) throws Exception {
        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
        if (!file.getParentFile().exists()){
            file.mkdir();
        }
        OutputStream output = new FileOutputStream(file,true);
        //将OutputStream对象传递给OutputStreamWriter类的构造方法，而后向上转型为Writer
        OutputStreamWriter out = new OutputStreamWriter(output);
        Writer writer = (Writer)out;
        out.write("Hello world!!!");
        writer.flush();
        writer.close();
    }
}
