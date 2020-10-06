package com.hengqin.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        File file = new File("d:"+File.separator+"demo"+File.separator+"test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer sbf = new StringBuffer();
        while (scanner.hasNext()){
            sbf.append(scanner.next()).append("\n");
        }
        System.out.println(sbf);
    }
}
