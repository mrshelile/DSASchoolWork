/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackpreptest;

/**
 *
 * @author ghost
 */
public class StackArray {
    private int top=-1;
    private char[]stack;
    private final int defaultCapacity=1000;
    
    public StackArray(){
        this.stack = new char[this.defaultCapacity];
    }
    public StackArray(int size){
        this.stack =new char[size];
    }
    
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(char value) throws IllegalStateException{
        if(size()==stack.length)
            throw new IllegalStateException("Stack Overflow");
        stack[++top]=value;
    }
    public char pop() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Stack Underflow");
        return stack[top--];
    }
    public char peek()throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Stack Underflow");     
        return stack[top];
    }
}
