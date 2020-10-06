package com.hengqin.test1;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo1 {
    public static void main(String[] args) throws Exception {
        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
        Reader reader = new FileReader(file);
        int foot = 0;
        int temp = 0;
        char [] chars = new char[1024];
        while ((temp=reader.read())!=-1){
            chars[foot++]= (char) temp;
        }
        reader.close();
        System.out.println("["+new String(chars,0,foot)+"]");
    }
}
