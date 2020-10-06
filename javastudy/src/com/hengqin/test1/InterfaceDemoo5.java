package com.hengqin.test1;

interface Network{
    public void browse();
}
class Real implements Network{
    public void browse(){
        System.out.println("正在上网");
    }
}
class Proxy implements Network{
    private Network network;
    public Proxy(Network network){
        this.network = network;
    }
    public void check(){
        System.out.println("检查用户是否合法");
    }
    public void browse(){
        this.check();
        this.network.browse();
    }
}
public class InterfaceDemoo5 {
    public static void main(String[] args) {
        Network network = new Proxy(new Real());
        network.browse();
    }
}
