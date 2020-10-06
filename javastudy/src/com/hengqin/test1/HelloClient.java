package com.hengqin.test1;

import java.net.Socket;
import java.util.Scanner;

public class HelloClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",9999);  //连接服务器端
        //取得客户端的输入数据流对象，表示接收服务器端的输出信息
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");  //换行为分隔符
        if (scanner.hasNext()){
            System.out.println("[回应数据】"+scanner.next());
        }
        //客户端只连接一次服务器，并且接收数据输出后结束操作
        scanner.close();
        client.close();
    }
}
