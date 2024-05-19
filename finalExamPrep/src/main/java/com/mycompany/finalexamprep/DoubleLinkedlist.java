/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexamprep;

/**
 *
 * @author ghost
 */
public class DoubleLinkedlist {
    private Node head;
    private Node tail;
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void addFirst(int data){
        if(isEmpty()){
            head=tail=new Node(data);
//            head.next=tail;
            tail.prev=head;
        }else{
         head=new Node(data,null,head);
        }
    }
    public void addLast(int data){
    if(isEmpty()){
       head=tail=new Node(data);
    
    }
    else{
    Node newNode = new Node(data);
    newNode.prev=tail;
    tail.next=newNode;
    tail=newNode;
    }
   }
    @Override
    public String toString() {
        String display="";
        for(Node aux=head;aux!=null;aux=aux.next){
        display = display +aux.data +",";
        }
        return "DoubleLinkedlist[" + display + "]";
    }
    
    private class Node{
    private int data;
    private Node next;
    private Node prev;
    
    public Node(){}
    public Node(int data){
        this.data=data;
    }
    public Node(int data,Node prev,Node next){
        this.data= data;
        this.prev = prev;
        this.next = next;
    }
   }
}
