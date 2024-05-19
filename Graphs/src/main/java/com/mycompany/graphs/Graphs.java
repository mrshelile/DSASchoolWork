/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphs;

/**
 *
 * @author ghost
 */
public class Graphs {

    public static void main(String[] args) {
       AdjMatrix graph1 = new AdjMatrix(4);
       
       graph1.addVertex("A");
       graph1.addVertex("B");
       graph1.addVertex("C");
       graph1.addVertex("D");
       
       graph1.addEdge("A", "B");
       graph1.addEdge("B", "D");
       graph1.addEdge("D", "C");
       graph1.addEdge("C", "A");
       
//       graph1.displayAdjMatrix();
//         graph1.nodeConnecteTo("A");
//         graph1.nodeConnecteTo("D");
//       graph1.displayAdjMatrix();
       graph1.depthFirstSearch("C");
       
    }
}
