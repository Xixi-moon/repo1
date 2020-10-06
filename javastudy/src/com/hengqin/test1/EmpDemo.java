package com.hengqin.test1;

class Employee {
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    public Employee() {
    }

    public Employee(int empno, String ename, String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public double getSal() {
        return sal;
    }

    public double getComm() {
        return comm;
    }
    public String getInfo(){
        return "雇员编号"+empno+"\n"+
                "雇员姓名"+ename+"\n"+
                "雇员职位"+job+"\n"+
                "基本工资"+sal+"\n"+
                "佣   金"+comm;
    }
}

public class EmpDemo {
    public static void main(String[] args) {
        Employee e = new Employee(7396,"jerry","editor",3000,200);
        e.setEname("mary");
        System.out.println(e.getInfo());
        System.out.println("姓名："+e.getEname());
    }
}
