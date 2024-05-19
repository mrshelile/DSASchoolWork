/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist1;

/**
 *
 * @author ghost
 */
public class myList {
    private Node pointer;
    public boolean isEmpty(){
    return pointer==null;
    }
    public void insert(int value){
     if(isEmpty()){   
         pointer = new Node(value);
    }else{
       pointer= new Node(value,pointer);
       
     }
   }
    public void display(){
    for(Node aux=pointer;aux!=null;aux=aux.link){
        System.out.print(aux.data+"=>");
    }
    System.out.println();
    }
    private class Node{
        private int data;
        private Node link;
        public Node(int data,Node link){
            this.data=data;
            this.link=link;
        }
        public Node(){}
        public Node(int data){}
    }
}
