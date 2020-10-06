package com.hengqin.test1;

class Dept{
    private int deptno;
    private String dname;
    private String loc;
    private Emp [] emps;
    public void setEmps(Emp [] emps){
        this.emps=emps;
    }
    public Emp [] getEmps(){
        return this.emps;
    }
    //setter、getter、无参构造略
    public Dept(int deptno,String dname,String loc){
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }
    public String getInfo(){
        return "部门编号:"+this.deptno+"名称："+this.dname+"位置"+this.loc;
    }
}

class Emp{
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;
    private Dept dept;//部员对应的部门
    private Emp mgr;  //部员对应的领导
    public void setMgr(Emp mgr){
        this.mgr=mgr;
    }
    public Emp getMgr(){
        return this.mgr;
    }
    public void setDept(Dept dept){
        this.dept = dept;
    }
    public Dept getDept(){
        return this.dept;
    }
    //setter、getter无参构造省略
    public Emp(int empno,String ename,String job,double sal,double comm){
        this.empno=empno;
        this.ename=ename;
        this.job=job;
        this.sal=sal;
        this.comm=comm;
    }
    public String getInfo(){
        return "员工编号"+this.empno+"员工姓名"+this.ename+"职位"+"工资"+
                this.sal+"佣金"+this.comm;
    }

}
public class Dept_emp_Demo {
    public static void main(String[] args) {
    //设置数据
        //1、产生各自的独立对象
        Dept dept = new Dept(10,"ACCUNTING","New York");
        Emp emp1 = new Emp(1,"chen","CLERK",800,100);
        Emp emp2 = new Emp(2,"guan","MANAGER",1000,200);
        Emp emp3 = new Emp(3,"you","PRESENT",700,8);
        //2、设置部员与领导的关系
        emp1.setMgr(emp2);
        emp2.setMgr(emp3);
        //设置部员与部门的关系
        emp1.setDept(dept);
        emp2.setDept(dept);
        emp3.setDept(dept);
        dept.setEmps(new Emp[] {emp1,emp2,emp3});
        //第二步：取出数据
//        System.out.println("领导："+emp1.getMgr().getInfo());
//        System.out.println("部门："+emp1.getDept().getInfo());
        System.out.println(dept.getInfo());
        for (int x=0;x<dept.getEmps().length;x++){
            System.out.println(dept.getEmps()[x].getInfo());
            if(dept.getEmps()[x].getMgr()!=null){
                System.out.println("\t"+dept.getEmps()[x].getMgr().getInfo());
            }
        }
    }
}
