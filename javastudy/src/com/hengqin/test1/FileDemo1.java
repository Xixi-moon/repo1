package com.hengqin.test1;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator);
        File [] result = file.listFiles();
        BigDecimal b1 = new BigDecimal((double) file.length()/1024/1024);

        for (int i = 0;i<result.length;i++){
            System.out.println(result[i].getName()+"\t\t\t\t"+
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()))+"\t\t\t"+
                    (result[i].isDirectory()?"文件夹":"文件")+"\t\t"+
                    (result[i].isFile()?b1.divide(b1,2,BigDecimal.ROUND_HALF_UP):""));
        }
    }
}


//        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
//        if (!file.getParentFile().exists()){
//            file.getParentFile().mkdir();
//        }
//        if (file.exists()){
//            file.delete();
//        }else {
//            System.out.println(file.createNewFile());
//        }