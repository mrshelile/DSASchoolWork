/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexamprep;

/**
 *
 * @author ghost
 */
public class SinglyLinkedList {
    private Node head; // first
    private Node tail; // last
    private int size=0;
    
    public boolean isEmpty(){
        return head==null;
    }
   public void removeFirst(){
       if(!isEmpty()){
//           Node temp =head.link;
//           head.link=null;
           head=head.link;
       }
   }
   public void removeLast(){
       if(isEmpty())
           return;
       Node aux=head;
       while(aux.link != tail){
       aux=aux.link;
       }
       aux.link=null;
       tail =aux;
   }
    public void addFirst(int data){
        size++;
        if(isEmpty()){
          head=tail=new Node(data);
        }
        else{
        Node newNode = new Node(data);
      
        newNode.link = head;
        head = newNode;
        }
       
    }
    public void insertAfter(int data,int after){
    if(isEmpty())
        return;
    Node aux=head;
    
    while( aux.data!=after){
        aux=aux.link;
    }
//    if(aux==tail){
//        addLast(data);       
//    }
//    else{
     Node newNode = new Node(data); 
     newNode.link =aux.link;
     aux.link=newNode;
    
   }
    public void addLast(int data){
       size++;
       if(isEmpty())
       {
     head=tail=new Node(data);
      }
       else{
           Node newNode= new Node(data);
           tail.link= newNode;
           tail=newNode;
       }
    }

    @Override
    public String toString() {
        String display="";
        for(Node aux=head;aux!=null;aux=aux.link){
            display =display+aux.data+",";
        }

        return "SinglyLinkedList ["+display+"]";
    }
    
    
    
    private class Node{
    private int data;
    private Node link;
    
    public Node(int data){
      this.data = data; 
    }
    public  Node(int data,Node link){
        this.data = data;
        this.link = link;
    }
    }
}
