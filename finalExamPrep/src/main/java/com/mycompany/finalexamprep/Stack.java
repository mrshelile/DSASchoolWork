/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexamprep;

/**
 *
 * @author ghost
 */
public class Stack {
  private Node top;
  
  public boolean isEmpty(){
   return top==null;
  }
  public void push(int data){
      if(isEmpty()){
          top=new Node(data);
      }else{
          Node newNode = new Node(data);
          newNode.link=top;
          top =newNode;
      }
  }
  public void pop(){
      if(!isEmpty()){
          top = top.link;
      }
  }
  
  public void displayStack(){
  
  Node aux=top;
  while(aux!=null){
      System.out.println(aux.data);
      aux= aux.link;
  }
  }
  private class Node{
      private int data;
      private Node link;
      
      public Node(){}
      public Node(int data){
          this.data =data;
      }
      public Node(int data,Node link){
        this.data=data;
        this.link = link;
      }
  }  
}
