/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexamprep;

/**
 *
 * @author ghost
 */
public class Tree {
    private Node root;
    
    private boolean isEmpty(){
      return root ==null;
    }
    private void deleteLeafNode(Node node){
//       System.out.println(node.parent.left);
      if(node.parent.left!=null){
        if(node.parent.left.data==node.data){
          node.parent.left=null; 
          return;
        }    
        
      }
      node.parent.right=null;
      
    }
    public void delete(int data){
        Node found = searchNode(data,root);
//        System.out.println(found.parent);
        if(found==null)
            return;
        else if(found.left==null && found.right==null)
        {
          deleteLeafNode(found);
        }
        
        else if((found.right==null&& found.left!=null)
                || found.right!=null&& found.left==null){
             deleteWithchild(found);
        }
        else{
         deleteBothchild(found);
        }
    }
    private void deleteBothchild(Node node){

      Node max = findMax(node.left);
      node.data=max.data;
      deleteLeafNode(max);
    }
    private void deleteWithchild(Node node){
        System.out.println(node);
      if(node.parent.left!=null){ // is deleted node on parent left
         if(node.parent.left.data==node.data){ // is deleted node on parent left
             if(node.left!=null) // is deleted node child on left
                 node.parent.left=node.left;
             else{
               node.parent.left = node.right;
             }
             return;
         }
      }
      if(node.left!=null) // is deleted node child on left
         node.parent.right=node.left;
      else{
         node.parent.right = node.right;
      }
    }
    public void insert(int data){
        if(isEmpty()){
        root= new Node(data);
        }else{
            insertRec(root,data);
        }
    }
    public void search(int data) {
       Node found = searchNode(data,root);
       if(found!=null)
          System.out.println(found.data);
       else{
           System.out.println("Node not found");
       }
    }
    private void insertRec(Node parent,int data){
       if(parent.data > data){ // left parent insertion
            if(parent.left==null){
                parent.left = new Node(data,parent);
            }
            else{
             insertRec(parent.left,data);
            }
       }else if(parent.data<data){
          if(parent.right==null){
              parent.right = new Node(data,parent);
          }
          else{
           insertRec(parent.right,data);
          }
       }
    }
    private Node searchNode(int data,Node parent){
        if(parent==null)
           return null;
       if(parent.data==data)
           return parent;
       else if(parent.data>data)
           return searchNode(data,parent.left);
       return searchNode(data,parent.right);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree{");
        preorder(root,sb);
        sb.append('}');
        return sb.toString();
    }
    private void preorder(Node root,StringBuilder sb){
        
        if(root == null) 
           return ;
        sb.append(root.data+", ");
        preorder(root.left,sb);
        preorder(root.right,sb);
    }

    private Node findMax(Node node) {
         if(node.right==null)
             return node;
         return findMax(node.right);
    }

   
    private class Node{
        private int data;
        private Node left;
        private Node right;
        private Node parent;
        public Node(){}
        public Node(int data){
           this.data = data; 
        }
        public Node(int data,Node parent){
           this.data = data; 
           this.parent = parent;
        }
        public Node(int data,Node left,Node right,Node parent){
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
        }

        @Override
        public String toString() {
            return data+"" ;
        }
        
    }
}
