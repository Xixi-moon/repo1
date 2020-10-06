package com.hengqin.test1;

public class StringDemo {
    public static void main(String[] args) {
        String str="12316841w91";
        if(isNumber(str)){
            System.out.println("是由数字组成");
        }else {
            System.out.println("不是由数字组成");
        }
    }
    public static boolean isNumber(String temp){
        char [] data = temp.toCharArray();
        for(int x=0;x<data.length;x++){
            if(data[x]>'9' || data[x]<'0'){
                return false;
            }
        }
        return true;
    }

}
