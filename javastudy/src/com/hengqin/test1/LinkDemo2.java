package com.hengqin.test1;

class Link{
    class Node{
        private String data;
        private Node next;
        public Node (String data){
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
        public boolean isContains(String data){
            if(data.equals(this.data)){
                return true;
            }else {
                if(this.next!=null){
                    return this.next.isContains(data);
                }else {
                    return false;
                }
            }
        }
        public void deleteNode(String data){
            if(data.equals(this.data)){
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
        public String getNode(int index){
            if(Link.this.foot++ == index){
                return this.data;
            }else {
                return this.next.getNode(index);
            }
        }
        public void modiNode(int index,String data){
            if(index == Link.this.foot++){
                this.data = data;
            }else {
                this.next.modiNode(index,data);
            }
        }
        //第一次调用（Link），this=Link.root
        //第二次调用（Node），this=Link.root.next

        public void  toArrayNode(){
            Link.this.retArray[Link.this.foot++] = this.data;
            if(this.next!=null){
                this.next.toArrayNode();
            }
        }
    }
    //===========以上为内部类定义========//
    private Node root;
    private int count = 0;
    private int foot = 0;
    private String [] retArray;    //返回的数组
    public void addNewNode(String data){
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

    public boolean isContains(String data){
        if (data == null || this.root==null){
            return false;
        }else {
            return this.root.isContains(data);
        }
    }
    public void deleteNode(String data){
        if(this.root.isContains(data)){
            this.root.deleteNode(data);
        }else {
            return;
        }
    }
    public String getNode(int index){
        foot = 0;
        if(index>this.count){
            return null;
        }else {
            return this.root.getNode(index);
        }
    }
    public void modiNode(int index,String data){
        if (index>this.count){
            return;
        }else {
            this.root.modiNode(index,data);
        }
    }
    public String [] toArray(){
        if(this.root == null){
            return null;
        }
        this.foot = 0;  //脚标控制
        this.retArray = new String[this.count];   //根据保存内容开辟数组
        this.root.toArrayNode();
        return this.retArray;
    }
}
public class LinkDemo2 {
    public static void main(String[] args) {
        Link link = new Link();
        link.addNewNode("A");
        link.addNewNode("B");
        link.addNewNode("C");
        link.addNewNode("B");
        link.addNewNode("C");
        link.printNode();
        System.out.println("**********");
        System.out.println("元素个数："+link.getSize());
        System.out.println("**********");
        System.out.println("是否为空："+link.isEmpty());
        System.out.println("**********");
        System.out.println("是否包含D："+link.isContains("D"));
        System.out.println("**********");
        //link.deleteNode("B");
        link.printNode();
        System.out.println("**********");
        link.modiNode(3,"D");
        System.out.println(link.getNode(3));
        System.out.println("**********");
        for (String str : link.toArray()){
            System.out.println(str);
        }
    }
}
