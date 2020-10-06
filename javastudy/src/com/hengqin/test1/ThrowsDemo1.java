package com.hengqin.test1;

class Math{
    //throws表示此方法中存在的异常由调用出处理
    public static int div(int x,int y)throws Exception{
        int result = 0;
        try{
            System.out.println("***计算开始***");
            result = x/y;
        }catch (Exception e){
            throw e;  //继续抛出异常
        }finally {
            System.out.println("***计算结束***");
        }
        return result;
    }
}
public class ThrowsDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println(Math.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
