package com.hengqin.test1;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",8888);
        Scanner input = new Scanner(System.in);  //键盘输入数据
        Scanner scanner = new Scanner(client.getInputStream());
        input.useDelimiter("\n");
        scanner.useDelimiter("\n");  //换行为分隔符
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag =true;
        while (flag){
            System.out.println("输入信息：");
            if (input.hasNext()){
                String str = input.next().trim();
                out.println(str);
                if ("byebye".equalsIgnoreCase(str)){
                    flag = false;
                }
                if (scanner.hasNext()){
                    System.out.println(scanner.next());
                }
            }
        }
        client.close();
    }
}
