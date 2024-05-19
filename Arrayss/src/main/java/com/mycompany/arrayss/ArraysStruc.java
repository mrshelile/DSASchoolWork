/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayss;

/**
 *
 * @author ghost
 */
public class ArraysStruc {
    private int data[];
    private int point=-1;
    public ArraysStruc(){
        data = new int[1000];
    }
    public ArraysStruc(int size){
        data = new int[size];
    }
    public void insert(int value){
        if(point<data.length)
            data[++point]=value;
    }
    public int search(int value){
        int found =-1;
        for(int i=0;i<data.length;i++)
            if(value==data[i])
                found=i;
        return found;
    }
    private void swap(int first,int second){
        int temp=data[first];
        data[first]=data[second];
        data[second]=temp;
    }
    public void delete(int value){
       int index = search(value);
       if(index!=-1){
           if(index==data.length-1)
               point--;
           else
           {
              for(int i=index;i<data.length-1;i++){
                  data[index]=data[i+1];
              }
              point--;
           }
       }
    }
    public void display(){
        for(int i=0;i<=point && point!=-1;i++)
            System.out.print(data[i]+",");
        System.out.println();
    }
}
