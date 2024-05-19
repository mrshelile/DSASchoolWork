/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayss;

/**
 *
 * @author ghost
 */
public class Arrayss {

    public static void main(String[] args) {
       ArraysStruc arr= new ArraysStruc();
       arr.insert(5);
       arr.insert(7);
       arr.insert(1);
       arr.insert(10);
       arr.insert(2);
       arr.insert(3);
       arr.insert(0);
       arr.display();
       arr.delete(10);
       arr.display();
    }
}
