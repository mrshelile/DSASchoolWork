/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queuepreptest;

/**
 *
 * @author ghost
 */
public class QueuePrepTest {

    public static void main(String[] args) {
        QueueArray queue = new QueueArray<Integer>(6);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.showQueue();
        queue.dequeue();
        queue.showQueue();
    }
}
