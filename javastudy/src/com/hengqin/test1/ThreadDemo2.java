package com.hengqin.test1;

class MyThread1 implements Runnable{
    private int ticket =59;

    @Override
    public void run() {
        for (int x =0;x<200;x++){
            this.sale();  // 调用同步方法
        }
    }
    public synchronized void sale(){  //同步方法
        if (ticket>0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票,ticket="+this.ticket--);
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread1 my = new MyThread1();
        new Thread(my,"A").start();
        new Thread(my,"B").start();
        new Thread(my,"C").start();
        new Thread(my,"D").start();
    }
}
