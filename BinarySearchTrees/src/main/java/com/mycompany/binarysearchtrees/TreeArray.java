/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtrees;

/**
 *
 * @author ghost
 */
public class TreeArray {
   private int[]tree;
   private int size=0;
   private final int CAPACITY=1000;
   
   public TreeArray(){
       tree = new int[this.CAPACITY];
   }
   public TreeArray(int size){
       tree  = new int[size];
   }
   private boolean isEmpty(){
       return size==0;
   }
   private void insertChild(int p,int value){
       
       if(tree[p]>value){ // left child insertion
         int left =2*p+1;
         if(p<size){
             insertChild(p++,value);
         }else{
             tree[left]=value;
             size++;
         }
       }
       else if(tree[p]<value){ // right child insertion
        int right= 2*p+2;
         if(p<size){
             insertChild(p++,value);
         }else{
             tree[right]=value;
             size++;
         }
       }
   }
   public void displayPreOrder(){
      for(int i=0;i<size;i++){
          int left =2*i+1;
          int right = 2*i+2;
          System.out.print(tree[i]+",");
          System.out.print(tree[left]+",");
          System.out.print(tree[right]+",");
      } 
   }
   public void insert(int value){
       if(isEmpty()){
           tree[0]=value;
       }else{
           insertChild(0,value);
       }
   }
}
