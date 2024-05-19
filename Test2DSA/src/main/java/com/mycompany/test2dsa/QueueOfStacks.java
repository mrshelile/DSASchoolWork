/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2dsa;

/**
 *
 * @author ghost
 */
public class QueueOfStacks<E> {
    private Stack enqueueStack;
    private Stack dequeueStack;
    
    public QueueOfStacks(){
        enqueueStack = new Stack();
        dequeueStack = new Stack();
    }
    
    private boolean isEmpty(){
      return this.enqueueStack.isEmpty() 
              && this.dequeueStack.isEmpty();
    }
    
    public void enqueue(E value){
        while(!enqueueStack.isEmpty())
            dequeueStack.push(enqueueStack.pop());        
        while(!dequeueStack.isEmpty()){
             enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);
        
    }
    public void showQueue(){
        while(!enqueueStack.isEmpty())
            dequeueStack.push(enqueueStack.pop());
        dequeueStack.displayStack();
        
    }
    public E dequeue(){
        while(!enqueueStack.isEmpty())
            dequeueStack.push(enqueueStack.pop());
        return (E) dequeueStack.pop();
    }
}
