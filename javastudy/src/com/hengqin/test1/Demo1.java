package com.hengqin.test1;

public class Demo1 {
    //psvm+enter 可以快捷生成   public static void main
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //所有的变量在同一块代码之中只允许声明一次。
        int num =10;
        num = num *2;
        System.out.println(num);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //int 变量±int型变量=int型变量
        System.out.println(max + 1);//最大值加1等于最小值
        System.out.println(min - 1);//最小值减1等于最大值
        //int 变量± long型变量 = long型变量
        System.out.println(max + 1L);
        System.out.println(min - (long)1);
        //long 变量±int型变量=long型数据
        System.out.println((long)min - 2);

        //大范围强制转小范围
        long num1 = 1000;
        int x1 = (int) num1;
        System.out.println(x1);

        long num2 = 2147483650L;
        int y1 = (int) num2;
        System.out.println(y1);

        //A(65),Z(90),a(97),z(122),0(48),9(57)
        char c = 'A';
        int num3 = c;
        num3 = num3 + 32;
        //char 只能与 int 相互转换
        c = (char)num3;
        System.out.println(c);

        //字符串的拼接
        int num4 = 100;
        double num5 =99.0;
        String str = "加法计算：" + num4 +num5;
        System.out.println(str);
        String str1 = "加法计算="+(num4+num5);
        System.out.println(str1);

        //三目运算
        int numA = 10;
        int numB = 20;
        //如果numA>numB，返回true，将numA的值赋给maxnum；
        //如果numA<numB，返回false，将numB的值赋给maxnum。
        int maxnum = numA > numB ? numA:numB;
        System.out.println(maxnum);

        //位运算
        int num6 = 2;
        int result = num6 << 2;
        System.out.println(num6);
        System.out.println(result);

        //乘法口诀表
        for(int x =1 ; x<=9; x++){
            for(int y=1;y<=x; y++){
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
        }
        printInfo();
        printInfo();
        printInfo();
        //对返回值进行接收
        int addresult = add(10,20);
        System.out.println(addresult);
        //对返回值直接进行输出
        System.out.println(add(10,20));
        System.out.println(sum(100));
    }
    //定义没有参数，没有返回值的方法
    public static void printInfo(){//定义方法的名称，第一个首字母小写，而后每个单词首字母大写
        System.out.println("************");
        System.out.println("Hello world");
        System.out.println("************");
    }
    //定义有参数，有返回值的方法
    public static int add(int x, int y){
        return x+y;
    }
    //递归计算
    public static int sum(int num){
        if(num == 1){
            return 1;
        }
        return num+sum(num-1);
    }

}
