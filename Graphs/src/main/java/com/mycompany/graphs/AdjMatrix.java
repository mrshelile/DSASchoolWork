/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphs;

/**
 *
 * @author ghost
 */
public class AdjMatrix<E> {
   private E[] vertex; 
   private int iterator;
   private int[][]adjMatrix;
   public AdjMatrix(){
       vertex = (E[]) new Object[1000];
       this.iterator=-1;
       this.adjMatrix=new int[1000][1000];
   }
   public AdjMatrix(int size){
      vertex = (E[]) new Object[size];
      this.iterator = -1;
      this.adjMatrix = new int[size][size];
   }
   public void addVertex(E data){
     if(this.iterator>=this.vertex.length)
           return;
      this.vertex[++iterator] = data; 
   }
   public int findIndex(E a){
       for(int i=0;i<vertex.length;i++){
           if(vertex[i]==a)
               return i;
       }
       return -1;
   }
   public void addEdge(E a,E b){
       int row = findIndex(a);
       int col = findIndex(b);
       
       if(row==-1 ||col ==-1)
           return;
       adjMatrix[row][col]=1;
       adjMatrix[col][row]=1;
   }
   public void displayAdjMatrix(){
       for(int row=0;row<adjMatrix.length;row++){
           for(int col =0;col<adjMatrix[row].length;col++)
                System.out.print(adjMatrix[row][col]+"\t");
           System.out.println();
       }
   }
   public void nodeConnecteTo(E node){
      int index =findIndex(node);
      if(index ==-1)
          return;
      
      for(int i=0;i<adjMatrix[index].length;i++){
          if(adjMatrix[index][i]==1)
              System.out.print(vertex[i]+"=>");
         
      }
      System.out.println();
      
   }
   public  void depthFirstSearch(E start){
       int index = findIndex(start);
       boolean[] visited = new boolean[vertex.length];
        depthFirstSearchRec(index,visited);
        System.out.println();
   }
   private void depthFirstSearchRec(int start,boolean[] visited){
     if(start==-1)
         return;
     System.out.print(vertex[start].toString()+" => ");
     visited[start]=true;
     
     for(int i=0;i<adjMatrix[start].length;i++)
         if(adjMatrix[start][i]==1 && (!visited[i]))
            depthFirstSearchRec(i,visited);
   }
}
