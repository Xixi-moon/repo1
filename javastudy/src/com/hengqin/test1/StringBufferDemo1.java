package com.hengqin.test1;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sbu = new StringBuffer("Hello");
        String str = sbu.toString();
        System.out.println(sbu.reverse());
    }
}

//        sbu.append("Hello").append("World").append("!!!");
//        System.out.println("修改之前："+sbu);
//        System.out.println("修改之后："+change(sbu));
//
//    }
//    public static StringBuffer change(StringBuffer temp){
//        return temp.append("jxqwc").append("gaile");
//    }
//}
