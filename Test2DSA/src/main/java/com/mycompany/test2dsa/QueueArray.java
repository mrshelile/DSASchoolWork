/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2dsa;

/**
 *
 * @author ghost
 * @param <E>
 */
public class QueueArray<E> {
  private int front;
  private int sz;
  private E[] queue;
  private final int CAPACITY=1000;
  public QueueArray(){
      front =0;
      sz=0;
      queue=(E[])new Object[CAPACITY];
  }
  public QueueArray(int CAPACITY){
      front =0;
      sz=0;
      queue=(E[])new Object[CAPACITY];  
  } 
  public boolean isEmpty(){
      return sz ==0;
  }
  public int size(){
      return sz;
  }
  public void enqueue(E value) throws IllegalStateException{
     if(sz==queue.length) 
         throw new IllegalStateException("Queue Overflow");
     int index = (front+sz)%queue.length;
     queue[index] = value;
     sz++;
  }
public void showQueue() {
  if (isEmpty()) {
    System.out.println("Queue is empty.");
    return;
  }
  
  System.out.print(" --->  : ");
  // Start from the front index and iterate until reaching the rear
  int index = front;
  for (int i = 0; i < sz; i++) {
    System.out.print(queue[index] + " ");
    index = (index + 1) % queue.length;
  }
  System.out.println();
}

public E dequeue(){
    if(isEmpty())
        return null;
    E temp =queue[front];
    queue[front]=null;
    front =(front+1)%queue.length;
    sz--;
    return temp;
  }
}
