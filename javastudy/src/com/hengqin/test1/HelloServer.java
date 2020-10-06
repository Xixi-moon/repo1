package com.hengqin.test1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999); //所有服务器都必须有端口
        System.out.println("等待客户连接");
        Socket client = server.accept();
        PrintStream out = new PrintStream(client.getOutputStream());  //实例化打印流对象，输出信息
        out.println("hello world");
        out.close();
        client.close();
        server.close();
    }
}
