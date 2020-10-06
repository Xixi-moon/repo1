package com.hengqin.test1;

import java.util.Arrays;
import java.util.Comparator;

class BinaryTree{
    class Node{
        private Node left;
        private Node right;
        private Comparable data;
        public void addNode(Node node){
            //确定是放左子树还是右子树
            if (node.data.compareTo(this.data)<0){
                if (this.left == null){
                    this.left = node;
                }else {
                    this.left.addNode(node);
                }
            }
            if (node.data.compareTo(this.data)>=0){
                if (this.right == null){
                    this.right = node;
                }else {
                    this.right.addNode(node);
                }
            }
            if (node == null){
                return;
            }
        }
        public void printNode(){
            if (this.left!=null){
                this.left.printNode();
            }
            System.out.println(this.data+"\t");
            if (this.right!=null){
                this.right.printNode();
            }
        }
    }
    private Node root;
    public void add(Comparable data){
        Node newNode = new Node();
        newNode.data = data;
        if (root == null){
            root = newNode;
        }else {
            root.addNode(newNode);
        }
    }
    public void print(){
        this.root.printNode();
    }
}
class ArrayCom {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayCom(String title, double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title="+this.title+",price="+this.price+"\n";
    }

//    @Override
//    public int compareTo(ArrayCom o) {  //Arrays.sort会自动调用
//        if (this.price>o.price){
//            return 1;
//        }else if (this.price<o.price){
//            return -1;
//        }else {
//            return 0;
//        }
//    }
}
class ArrayComparator implements Comparator<ArrayCom>{

    @Override
    public int compare(ArrayCom o1, ArrayCom o2) {
        if (o1.getPrice()>o2.getPrice()){
            return 1;
        }else if (o1.getPrice()<o2.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}
public class ComparableDemo1 {
    public static void main(String[] args) {
        ArrayCom arr1 = new ArrayCom("java",78.3);
        ArrayCom arr2 = new ArrayCom("oracle",52.2);
        ArrayCom arr3 = new ArrayCom("c",99.99);
        ArrayCom arr4 = new ArrayCom("jsp",66.6);

        ArrayCom [] arr = new ArrayCom[]{arr1,arr2,arr3,arr4};
        Arrays.sort(arr,new ArrayComparator());
        System.out.println(Arrays.toString(arr));

//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.add(arr1);
//        binaryTree.add(arr2);
//        binaryTree.add(arr3);
//        binaryTree.add(arr4);
//        binaryTree.print();
    }
}
