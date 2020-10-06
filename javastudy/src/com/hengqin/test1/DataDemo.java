package com.hengqin.test1;

public class DataDemo {
    public static void main(String[] args) {
        int month = 2;
        int year = 2020;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
                System.out.println(31);
                break;
            }
            case 2: {
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    System.out.println(29);
                    break;
                } else {
                    System.out.println(28);
                    break;
                }
            }
            case 4: case 6: case 9: case 11: {
                System.out.println(30);
                break;
            }
            default:
                System.out.println("输入错误月份");
        }
    }
}
