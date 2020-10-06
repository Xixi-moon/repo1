package com.hengqin.test1;

public class ThrowDemo1 {
    public static void main(String[] args) {
        int num =10;
        assert num == 20 : "数字不是20";
        System.out.println("num="+num);
//        try {
//            throw new Exception("自己抛的异常");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
