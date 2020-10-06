package com.hengqin.test1;

interface A2{
    public void funA();
}
interface B2{
    public void funB();
}
//C2接口同时继承了A2和B2两个接口
interface C2 extends A2,B2{
    public void funC();
}

class X2 implements C2{
    public void funA(){}
    public void funB(){}
    public void funC(){}
}
public class InterfaceDemo2 {
}
