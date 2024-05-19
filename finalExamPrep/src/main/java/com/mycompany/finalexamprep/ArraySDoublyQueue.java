/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexamprep;

/**
 *
 * @author ghost
 */
public class ArraySDoublyQueue {
  private int queue[];
  private int f=0;
  private int size=0;
  public ArraySDoublyQueue(){
      queue = new int[1000];
  }
  public ArraySDoublyQueue(int size){
      queue = new int[size];
  }
  
  public void enqueue(int data){
      if(size!=queue.length){
          int avail = (f+size)%queue.length;
          queue[avail]=data;
          size++;
      }
  }
  public void dequeue(){
      if(size!=0){
          f = (f+1)%queue.length;
          size--;
      }
  }
  public void showQueue() {
  if (size==0) {
    System.out.println("Queue is empty.");
    return;
  }
  
  System.out.print("Queue (front -> rear): ");
  // Start from the front index and iterate until reaching the rear
  int index = f;
  for (int i = 0; i < size; i++) {
    System.out.print(queue[index] + ", ");
    index = (index + 1) % queue.length;
  }
  System.out.println();
}

}
