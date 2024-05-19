/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2dsa;

/**
 *
 * @author ghost
 */
public class BinaryTree{
    private Node root;
    public BinaryTree(int root){
        this.root = new Node(root);
    }
    public BinaryTree(){
        this.root = null;
    }
   private boolean isEmpty(){
       return root ==null;
   }
   public void preorder(){
      preorderRec(root);
      System.out.println();
   }
   private void preorderRec(Node parent){
       if(parent==null)
           return;
       System.out.print(parent.data+",");
       preorderRec(parent.left);
       preorderRec(parent.right);
   } 
   private void insertChild(Node parent,int data){
       if(data<parent.data){
           if(parent.left==null){
               parent.left =new Node(data);
           }else{
               insertChild(parent.left,data);
           }
       }
       else if(data>parent.data){
           if(parent.right==null){
               parent.right = new Node(data);
           }
           else{
               insertChild(parent.right,data);
           }
       }
       
   }
   private Node searchNode(Node parent,int data){
       if(parent==null){
           return null;
       }
       if(parent.data==data){
           return parent;
       }
       else if(data < parent.data){
          return searchNode(parent.left,data);
       }
       else if(data > parent.data){
          return searchNode(parent.right,data);
       }
       
       return null;
   }
   public int hightFrom(int data){
       Node temp = searchNode(root,data);
       if(temp!=null)
           return findHeight(temp,1);
      return -1;
   }
   private int findHeight(Node parent,int height){
       
       int left = findLeftHeight(parent);
       int right = findRightHeight(parent);
       if(left>right)
           return left;
       else if(right>left)
           return right;
       return left;
   }
   private int findLeftHeight(Node parent){
       int cnt=0;
      while(parent!=null){
          cnt++;
          parent= parent.left;
      }
       return cnt;
   }
   private int findRightHeight(Node parent){
        int cnt=0;
      while(parent!=null){
          cnt++;
          parent= parent.right;
      }
       return cnt;
   }
   public void insert(int data){
       if(isEmpty()){
           root = new Node(data);
       }else{
           insertChild(root,data);
       }
   }
   private class Node{
       private int data;
       private Node left;
       private Node right;
       public Node(int data){
           this.data=data;
       }
   }
}
