package com.hengqin.test1;
class Province1{
    private int pid;
    private String pname;
    private Link2 cities = new Link2();

    public Link2 getCities(){
        return this.cities;
    }
    public Province1(int pid,String pname){
        this.pid=pid;
        this.pname=pname;
    }
    public String getInfo(){
        return "省份编号"+this.pid+"省份名称"+this.pname;
    }
    public boolean compare(Province1 province){
        if (this == province){
            return true;
        }
        if (province == null){
            return false;
        }
        if(this.pid == province.pid && this.pname.equals(province.pname)){
            return true;
        }
        return false;
    }

}
class City{
    private int cid;
    private String cname;
    private Province1 province;
    public void setProvince(Province1 province){
        this.province = province;
    }
    public Province1 getProvince(){
        return this.province;
    }
    public City(int cid,String cname){
        this.cid=cid;
        this.cname=cname;
    }
    public String getInfo(){
        return "城市编号:"+this.cid+",城市名称:"+this.cname;
    }
    public boolean compare(City city){
        if(this == city){
            return true;
        }
        if (city == null){
            return false;
        }
        if (this.cid==city.cid && this.cname.equals(city.cname)){
            return true;
        }
        return false;
    }
}
class Link2{
    class Node{
        private City data;
        private Node next;
        public Node (City city){
            this.data = city;
        }
        public void add(Node newNode){
            if(this.next==null){
                this.next = newNode;
            }else {
                this.next.add(newNode);
            }
        }
        public void print(){
            System.out.println(this.data);
            if (this.next!=null){
                this.next.print();
            }
        }
        public boolean isContains(City data){
            if(data.compare(this.data)){
                return true;
            }else {
                if(this.next!=null){
                    return this.next.isContains(data);
                }else {
                    return false;
                }
            }
        }
        public void deleteNode(City data){
            if(data.compare(this.data)){
                if(this.next!=null){
                    root = this.next;
                }else {
                    root=null;
                }

            }else {
                if(this.next!=null){
                    if(this.next.isContains(data)){
                        this.next = this.next.next;
                    }
                }else {
                    return;
                }
            }
        }
        public City getNode(int index){
            if(Link2.this.foot++ == index){
                return this.data;
            }else {
                return this.next.getNode(index);
            }
        }
        public void modiNode(int index,City data){
            if(index == Link2.this.foot++){
                this.data = data;
            }else {
                this.next.modiNode(index,data);
            }
        }
        //第一次调用（Link），this=Link.root
        //第二次调用（Node），this=Link.root.next

        public void  toArrayNode(){
            Link2.this.retArray[Link2.this.foot++] = this.data;
            if(this.next!=null){
                this.next.toArrayNode();
            }
        }
    }
    //===========以上为内部类定义========//
    private Node root;
    private int count = 0;
    private int foot = 0;
    private City [] retArray;    //返回的数组
    public void addNewNode(City data){
        Node newNode = new Node(data);
        if(this.root==null){
            this.root = newNode;
        }else {
            this.root.add(newNode);
        }
        count++;
    }
    public void printNode(){
        if (this.root!=null){
            this.root.print();
        }
    }
    public int getSize(){
        return this.count;
    }
    public boolean isEmpty(){
        return this.count == 0;
    }

    public boolean isContains(City data){
        if (data == null || this.root==null){
            return false;
        }else {
            return this.root.isContains(data);
        }
    }
    public void deleteNode(City data){
        if(this.root.isContains(data)){
            count--;
            this.root.deleteNode(data);
        }else {
            return;
        }
    }
    public City getNode(int index){
        foot = 0;
        if(index>this.count){
            return null;
        }else {
            return this.root.getNode(index);
        }
    }
    public void modiNode(int index,City data){
        if (index>this.count){
            return;
        }else {
            this.root.modiNode(index,data);
        }
    }
    public City [] toArray(){
        if(this.root == null){
            return null;
        }
        this.foot = 0;  //脚标控制
        this.retArray = new City[this.count];   //根据保存内容开辟数组
        this.root.toArrayNode();
        return this.retArray;
    }
}
public class LinkDemo4 {
    public static void main(String[] args) {
        //Link2 link1 = new Link2();
        //准备对象
        Province1 province1 = new Province1(1,"jiangsu");
        City city1 = new City(1,"yangzhou");
        City city2 = new City(2,"yancheng");
        City city3 = new City(3,"huaian");
        //设置关系
        city1.setProvince(province1);
        city2.setProvince(province1);
        city3.setProvince(province1);
        province1.getCities().addNewNode(city1);
        province1.getCities().addNewNode(city2);
        province1.getCities().addNewNode(city3);
        //第二步：取出关系
        System.out.println(province1.getInfo());
        System.out.println("包含的城市数量："+province1.getCities().getSize());
        City [] city = province1.getCities().toArray();
        System.out.println("删除前的城市信息：");
        for (int x = 0 ; x<city.length;x++){
            System.out.println(city[x].getInfo());
        }
        System.out.println("是否包含yancheng："+province1.getCities().isContains(new City(2,"yancheng")));
        System.out.println("删除yancheng:");
        province1.getCities().deleteNode(new City(2,"yancheng"));
        City [] c = province1.getCities().toArray();
        for (City x:c){
            System.out.println(x.getInfo());
        }
    }
}
