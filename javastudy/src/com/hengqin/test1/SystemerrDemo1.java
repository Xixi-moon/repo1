package com.hengqin.test1;

public class SystemerrDemo1 {
    public static void main(String[] args) {
        String str = "hello";
        try {
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
