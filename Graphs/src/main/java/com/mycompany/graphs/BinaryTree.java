/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphs;

/**
 *
 * @author ghost
 */
public class BinaryTree<E> {
    private Node root;
    public void addNode(E data){
      
    }
    private class Node<T>{
        private T data;
        private Node left;
        private Node right;
        
        public Node(T data){
            this.data =data;
        }
        public Node(T data,Node left,Node right){
            this.data=data;
            this.left = left;
            this.right = right;
        }
    }
}
