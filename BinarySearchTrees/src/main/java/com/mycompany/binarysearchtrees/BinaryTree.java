/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtrees;

/**
 *
 * @author ghost
 */
public class BinaryTree {
    private Node root;
    
    private boolean isEmpty(){
    return root==null;
    }
    
    public void addToNode(int data){
        if(isEmpty()){
            root =new Node(data);
        }else{
            
        }
    }
    
    class Node{
        private int data;
        private Node left;
        private Node right;
        
        public Node(int data){
          this.data=data;
        }
    }
    
}
