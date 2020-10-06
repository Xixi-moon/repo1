package com.hengqin.test1;

class MyThread implements Runnable{
    private String name;
    public MyThread(String name){  //定义构造方法
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0;i<200;i++){
            System.out.println(this.name+"-->"+i);
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("A");
        MyThread myThread1 = new MyThread("B");
        MyThread myThread2 = new MyThread("C");

        new Thread(myThread).start();
        new Thread(myThread1).start();
        new Thread(myThread2).start();

    }
}
