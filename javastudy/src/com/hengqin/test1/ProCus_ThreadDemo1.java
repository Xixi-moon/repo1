package com.hengqin.test1;

class Info{
    private String name;
    private String content;
    private boolean flag =true; //flag=true表示可以生产，但是不能取走。flag=false表示不可以生产，可以取走

    public synchronized void set(String name,String content){
        if (!flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag = false;
        super.notify();
    }

    public synchronized void get(){
        if (flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName()+"-->"+this.getContent());
        flag = true;
        super.notify();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class Pro implements Runnable{
    private Info info;
    public Pro(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0; x<100;x++){
            if (x%2==0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.set("cathy","student");
            }else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.set("w","wo");
            }
        }
    }
}

class Cus implements Runnable{
    private Info info;
    public Cus(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0;x<100;x++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.info.get();
        }
    }
}
public class ProCus_ThreadDemo1 {
    public static void main(String[] args) {
        Info info = new Info();
        new Thread(new Pro(info)).start();
        new Thread(new Cus(info)).start();
    }
}
