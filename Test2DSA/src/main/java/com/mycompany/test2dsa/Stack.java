/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2dsa;

/**
 *
 * @author ghost
 */
public class Stack <E> {
    private Node top;
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(E data){
        if(isEmpty())
            top = new Node(data);
        else
            top= new Node(data,top);
    }
    public E pop() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Stack Underflow");
        E temp =(E) top.data;
        top = top.link;
        return temp;
    }
    public void displayStack(){
        Node temp = top;
         System.out.print(" --> : ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.println();
    }
    public E peek() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Stack Underflow");
       return (E) top.data;
    }
    private class Node<E>{
        private E data;
        private Node link;
        
        public Node(E data){
            this.data =data;
        }
        public Node(E data,Node link){
            this.data = data;
            this.link = link;
        }
    }
}