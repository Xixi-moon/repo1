package com.hengqin.test1;

class Member{
    private int mid;
    private String name;
    private Member child;  //表示孩子
    //car 有实例化对象表示有车
    //car 为null 表示没有车
    private Car car;     //表示属于人的车
    Member(int mid, String name){
        this.mid=mid;
        this.name=name;
    }
    public String getInfo(){
        return "人员编号"+ this.mid+",姓名"+this.name;
    }
    public void setChild(Member child){
        this.child=child;
    }
    public Member getChild(){
        return this.child;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return this.car;
    }
}

class Car{
    private Member member;    // 表示车属于人
    private String pname;
    public Car(String pname){
        this.pname=pname;
    }
    public String getInfo(){
        return  "车的名字："+this.pname;
    }
    public void setMember(Member member){
        this.member=member;
    }
    public Member getmember(){
        return this.member;
    }

}

public class yinyongDemo {
    public static void main(String[] args) {
        //第一步：设置数据
        Member m = new Member(1,"chen");
        Member chd = new Member(2,"xi");
        Car c = new Car("宝马320Li");
        Car cc = new Car("法拉利");
        m.setCar(c);  //一个人有一辆车
        c.setMember(m); //一辆车属于一个人
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);
        //第二步：取出关系
        //通过人找到车的信息
        System.out.println(m.getCar().getInfo());
        //通过车找到人的信息
        System.out.println(c.getmember().getInfo());
        //通过人找到他孩子的信息
        System.out.println(m.getChild().getInfo());
        //通过人找到他孩子的车的信息
        System.out.println(m.getChild().getCar().getInfo());//代码链
    }
}
