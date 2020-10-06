package com.hengqin.test1;

interface IFruit{
    public void eat();
}

class Appl implements IFruit{

    @Override
    public void eat() {
        System.out.println("***吃苹果***");
    }
}

class Factory2{
    public static IFruit getInstance(String classname){
        IFruit f = null;
        try {
            f = (IFruit) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return f;
    }
}
public class FactorRegexDemo1 {
    public static void main(String[] args) {
        IFruit f = Factory2.getInstance("com.hengqin.test1.Appl");
        f.eat();
    }
}
