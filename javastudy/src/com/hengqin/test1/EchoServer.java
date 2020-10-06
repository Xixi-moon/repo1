package com.hengqin.test1;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class EchoThread implements Runnable{
    private Socket client = null;
    public EchoThread(Socket client){
        this.client = client;
    }
    @Override
    public void run() {
       try{
           //得到客户端输入数据以及向客户端输出数据的对象
           Scanner scanner = new Scanner(client.getInputStream());
           PrintStream out = new PrintStream(client.getOutputStream());
           boolean flag = true;
           while (flag){
               if (scanner.hasNext()){
                   String str = scanner.next().trim();
                   if (str.equalsIgnoreCase("byebye")){
                       out.println("***关闭***下次再回***");
                       flag=false;
                   }else {
                       out.println("Echo:"+str);
                   }
               }
           }
           client.close();

       }catch (Exception e){
           System.err.println(e);
       }

    }
}
public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);
        boolean flag =true;
        while (flag){
            Socket client = server.accept();  //等待连接
            new Thread(new EchoThread(client)).start();
        }
    }
}
