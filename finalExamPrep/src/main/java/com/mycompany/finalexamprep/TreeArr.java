/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalexamprep;

/**
 *
 * @author ghost
 */
public class TreeArr {
    private float tree[];
    private int size=0;

    public TreeArr(int size){
        tree= new float[size];
    }
    public TreeArr(){
        tree = new float[20];
    }
    public boolean isEmpty(){
      return size==0;
    }

    @Override
    public String toString() {
        String display="";
        for(int i=0;i<tree.length;i++){
            if(tree[i]!=0){
                int left=2*i+1;
                int right = 2*i+2;
                display = display +tree[i]+", ";
                if(left<tree.length)
                    if(tree[left]!=0 ){
                        display = display+ tree[left]+", ";
                    }
                if(right<tree.length)
                    if(tree[right]!=0){
                        display = display + tree[right]+ ", ";
                    }
            }
        }
        return "TreeArr[" +display+ ']';
    }
    
    public void insert(float data){
        if(isEmpty()){
          tree[0]=data;
          size++;
        }else{
        insertRec(0,data);
        }
    }
    private void insertRec(int parent,float data){
        if(tree[parent]>data){   //left child insertion
            int left =2*parent+1;
            if(tree[left]!=0){
                insertRec(left,data);
            }else{
                tree[left]=data;
                 size++;
            }
        }
        else if(tree[parent]<data){  // right child insertion
        int right =2 * parent +2;
        if(tree[right]!=0){
            insertRec(right,data);
        } 
        else{
         tree[right]=data;
         size++;
        }
        }
    }
    public void displayArr(){
        for(int i=0;i<tree.length;i++)
            System.out.print(tree[i]+", ");
        System.out.println();
    }
}
