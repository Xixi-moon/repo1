package com.hengqin.test1;

class Pet{
    private String name;
    private double price;
    public Pet(String name,double price){
        this.name = name;
        this.price = price;
    }
    public String getInfo(){
        return "name:"+this.name+",price:"+this.price;
    }
    public boolean compare(Pet pet){
        if(this == pet){
            return true;
        }
        if (pet == null){
            return false;
        }
        if (this.name.equals(pet.name) && this.price == pet.price){
            return true;
        }
        return false;
    }
}
class Link1{
    class Node{
        private Pet data;
        private Node next;
        public Node (Pet data){
            this.data = data;
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
        public boolean isContains(Pet data){
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
        public void deleteNode(Pet data){
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
        public Pet getNode(int index){
            if(Link1.this.foot++ == index){
                return this.data;
            }else {
                return this.next.getNode(index);
            }
        }
        public void modiNode(int index,Pet data){
            if(index == Link1.this.foot++){
                this.data = data;
            }else {
                this.next.modiNode(index,data);
            }
        }
        //第一次调用（Link），this=Link.root
        //第二次调用（Node），this=Link.root.next

        public void  toArrayNode(){
            Link1.this.retArray[Link1.this.foot++] = this.data;
            if(this.next!=null){
                this.next.toArrayNode();
            }
        }
    }
    //===========以上为内部类定义========//
    private Node root;
    private int count = 0;
    private int foot = 0;
    private Pet [] retArray;    //返回的数组
    public void addNewNode(Pet data){
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

    public boolean isContains(Pet data){
        if (data == null || this.root==null){
            return false;
        }else {
            return this.root.isContains(data);
        }
    }
    public void deleteNode(Pet data){
        if(this.root.isContains(data)){
            count--;   //这一步是为了当删除元素之后，将链表变为对象数组输出，不会产生空指针报错。
            this.root.deleteNode(data);
        }else {
            return;
        }
    }
    public Pet getNode(int index){
        foot = 0;
        if(index>this.count){
            return null;
        }else {
            return this.root.getNode(index);
        }
    }
    public void modiNode(int index,Pet data){
        if (index>this.count){
            return;
        }else {
            this.root.modiNode(index,data);
        }
    }
    public Pet [] toArray(){
        if(this.root == null){
            return null;
        }
        this.foot = 0;  //脚标控制
        this.retArray = new Pet[this.count];   //根据保存内容开辟数组
        this.root.toArrayNode();
        return this.retArray;
    }
}
public class LinkDemo3 {
    public static void main(String[] args) {
        Link1 link1 = new Link1();
        link1.addNewNode(new Pet("cat",123));
        link1.addNewNode(new Pet("dog",456));
        link1.addNewNode(new Pet("pig",789));
        System.out.println("是否為空:"+link1.isEmpty());
        System.out.println("有幾個對象："+link1.getSize());
        System.out.println("是否包含dog:"+link1.isContains(new Pet("dog",456)));
        link1.deleteNode(new Pet("dog",456));
        System.out.println("是否包含dog:"+link1.isContains(new Pet("dog",456)));
        link1.deleteNode(new Pet("d",456));
        Pet [] pets = link1.toArray();
        for(Pet pet : pets){
            System.out.println(pet.getInfo());
        }
    }
}