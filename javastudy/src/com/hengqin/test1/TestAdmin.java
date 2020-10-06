package com.hengqin.test1;

class Admin{
    private String aid;
    private String password;
    private Role role;
    public void setRole(Role role){
        this.role = role;
    }
    public Role getRole(){
        return this.role;
    }
    public Admin(String aid,String password){
        this.aid = aid;
        this.password = password;
    }
    public String getInfo(){
        return "管理员编号："+this.aid+"密码"+this.password;
    }

}
class Role{
    private int rid;
    private String title;
    private Admin [] admins;
    private Group [] groups;
    public void setGroups(Group [] groups){
        this.groups = groups;
    }
    public Group [] getGroups(){
        return this.groups;
    }
    public void setAdmins(Admin [] admins){
        this.admins = admins;
    }
    public Admin [] getAdmins(){
        return this.admins;
    }
    public Role(int rid,String title){
        this.rid = rid;
        this.title = title;
    }
    public String getInfo(){
        return "角色编号："+this.rid+"，名称："+this.title;
    }
}
class Group{
    private int gid;
    private String title;
    private Role [] roles;
    private Action [] actions;

    public void setActions(Action [] actions){
        this.actions = actions;
    }
    public Action [] getActions(){
        return this.actions;
    }
    public void setRoles(Role [] roles){
        this.roles = roles;
    }
    public Role [] getRoles(){
        return this.roles;
    }
    public Group(int gid,String title){
        this.gid = gid;
        this.title = title;
    }
    public String getInfo(){
        return "权限组编号："+this.gid+"，权限组名称："+this.title;
    }
}
class Action{
    private int aid;
    private String title;
    private String url;
    private Group group;

    public void setGroup(Group group){
        this.group=group;
    }
    public Group getGroup(){
        return this.group;
    }
    public Action(int aid, String title, String url){
        this.aid= aid;
        this.title = title;
        this.url = url;
    }
    public String getInfo(){
        return "权限编号："+this.aid+"，权限名称："+this.title+"，路径："+this.url;
    }
}
public class TestAdmin {
    public static void main(String[] args) {
        Admin a1 = new Admin("admin","hello");
        Admin a2 = new Admin("guest","hello");
        Admin a3 = new Admin("ayou","hello");
        Role r1 = new Role(1,"系统管理员");
        Role r2 = new Role(2,"信息管理员");
        Group g1 =new Group(10,"信息管理");
        Group g2 =new Group(11,"用户管理");
        Group g3 =new Group(12,"数据管理");
        Group g4 =new Group(13,"接口管理");
        Group g5 =new Group(14,"备份管理");
        Action action1 = new Action(1001,"新闻发布","-");
        Action action2 = new Action(1002,"新闻列表","-");
        Action action3 = new Action(1003,"新闻审核","-");
        Action action4 = new Action(1004,"增加用户","-");
        Action action5 = new Action(1005,"用户列表","-");
        Action action6 = new Action(1006,"登录日志","-");
        Action action7 = new Action(1007,"雇员数据","-");
        Action action8 = new Action(1008,"部门数据","-");
        Action action9 = new Action(1009,"公司数据","-");
        Action action10 = new Action(1010,"服务传输","-");
        Action action11 = new Action(1011,"短信平台","-");
        Action action12 = new Action(1012,"全部备份","-");
        Action action13 = new Action(1013,"局部备份","-");
        //2 、设置基本关系
        //设置管理员与角色
        a1.setRole(r1);
        a2.setRole(r2);
        a3.setRole(r2);
        r1.setAdmins(new Admin[]{a1});
        r1.setAdmins(new Admin[]{a2,a3});
        //设置角色与管理员组
        r1.setGroups(new Group[]{g1,g2,g3,g4,g5});
        r2.setGroups(new Group[]{g1,g2});
        g1.setRoles(new Role[]{r1,r2});
        g2.setRoles(new Role[]{r1,r2});
        g3.setRoles(new Role[]{r1});
        g4.setRoles(new Role[]{r1});
        g5.setRoles(new Role[]{r1});
        //设置管理员组与权限
        g1.setActions(new Action[]{action1,action2,action3});
        g2.setActions(new Action[]{action4,action5,action6});
        g3.setActions(new Action[]{action7,action8,action9});
        g4.setActions(new Action[]{action10,action11});
        g5.setActions(new Action[]{action12,action13});
        action1.setGroup(g1);
        action2.setGroup(g1);
        action3.setGroup(g1);
        action4.setGroup(g2);
        action5.setGroup(g2);
        action6.setGroup(g2);
        action7.setGroup(g3);
        action8.setGroup(g3);
        action9.setGroup(g3);
        action10.setGroup(g4);
        action11.setGroup(g4);
        action12.setGroup(g5);
        action13.setGroup(g5);
        //取出数据
        System.out.println("------------------------------");
        System.out.println(a1.getInfo());
        System.out.println("\t"+a1.getRole().getInfo());
        for (int x = 0; x<a1.getRole().getGroups().length;x++){
            System.out.println("\t\t"+a1.getRole().getGroups()[x].getInfo());
            for (int y = 0; y<a1.getRole().getGroups()[x].getActions().length;y++){
                System.out.println("\t\t\t"+a1.getRole().getGroups()[x].getActions()[y].getInfo());
            }
        }
    }
}
