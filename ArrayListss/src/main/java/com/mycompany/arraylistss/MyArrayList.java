/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistss;

/**
 *
 * @author ghost
 */
public class MyArrayList {
 private int data[];
 private int size=0;
 public MyArrayList(){
     this.data= new int[10];
 }
 public MyArrayList(int capacity){
     this.data= new int[capacity];
 }
 public int size(){
     return size;
 }
 public boolean isEmpty(){
  return size==0;
 }
 public int get(int index){
     return this.data[index];
 }
 public int set(int index,int data){
 int temp=this.data[index];
 this.data[index]=data;
 return temp;
 }
 public void add(int index,int data){
    if(size==this.data.length) {
     this.data=new int[this.data.length*2];   
    }
     for(int k=size-1;k>=index;k--)
     {
    this.data[k+1] = this.data[k];
     }
    this.data[index]=data;
    size++;
 }
 public void add(int data){
    if(size==this.data.length) {
     this.data=new int[this.data.length*2];   
    } 
    this.data[size++]=data;
 }

    @Override
    public String toString() {
        String value="";
        for(int i=0;i<size;i++)
            value+=this.data[i]+",";
        return "MyArrayList{" + "data=[" + value + "]}";
    }
 
}
