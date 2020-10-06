package com.hengqin.test1;

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int x = 0; x<10;x++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ThreadNameDemo1 {
    public static void main(String[] args) {
        MyThread2 my = new MyThread2();
        Thread thread = new Thread(my,"A");
        Thread thread1 = new Thread(my,"B");
        Thread thread2 = new Thread(my,"C");
        thread.setPriority(Thread.MAX_PRIORITY); //10
        thread1.setPriority(Thread.MIN_PRIORITY); //1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread.start();
        thread1.start();
        thread2.start();
    }
}
