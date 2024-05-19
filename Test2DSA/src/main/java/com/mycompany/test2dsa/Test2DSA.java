/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2dsa;

import java.util.Scanner;

/**
 *
 * @author ghost
 */
public class Test2DSA {

    public static void main(String[] args) {


//       InfixPostFix infixconv = new InfixPostFix();
//       infixconv.toPostFix("A+B/C*(D-E*F^G)");
//       System.out.println(infixconv.getPostfix());
//         BinaryTree tree = new BinaryTree();
//         tree.insert(6);
//         tree.insert(4);
//         tree.insert(9);
//         tree.insert(10);
//         tree.insert(5);
//         tree.insert(7);
//         tree.insert(3);
////         tree.preorder();
//         System.out.println(tree.hightFrom(9));
//           QueueOfStacks queue = new QueueOfStacks();
//           
//           queue.enqueue(1);
//           queue.enqueue(2);
//           queue.enqueue(3);
//           queue.showQueue();
//           System.out.println(queue.dequeue());
//           queue.enqueue(4);
//           queue.showQueue();
//           System.out.println(queue.dequeue());
//           queue.showQueue();
             menu();
    }
    public static void showInfo(){
        System.out.println("1.Question 1 (a):");
        System.out.println("2.Question 1 (b):");
        System.out.println("3.Question 2 (a):");
        System.out.println("4.Question 2 (b):");
        System.out.println("5.Question 3 (a) and (b):");
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
        
        while(true){
            showInfo();
            System.out.print("Choose:");
            switch(input.nextInt()){
                case 1 -> {
                    System.out.println("Question 1 (a):");
                    Stack stack = new Stack();
                    while(true){
                        System.out.print("Enter num:");
                        String value = input.next();
                        
                        if("n".equals(value))
                            break;
                        stack.push(Integer.parseInt(value));
                    }
                    stack.displayStack();
                    stack.pop();
                    stack.displayStack();
                }
                case 2 -> {
                    System.out.println("Question 1 (b):");
                    InfixPostFix infixconv = new InfixPostFix();
                    System.out.print("Enter infix:");
                    infixconv.toPostFix(input.next());             ///"A+B/C*(D-E*F^G)"
                    System.out.println(infixconv.getPostfix());
                }
                case 3 -> {
                    System.out.println("Question 2 (a):");
                    QueueArray queue = new QueueArray();
                    while(true){
                        System.out.print("Enter num:");
                        String value = input.next();
                        
                        if("n".equals(value))
                            break;
                        queue.enqueue(Integer.parseInt(value));
                    }                    
                    queue.showQueue();
                    queue.dequeue();
                    queue.showQueue();
                }
                case 4 -> {
                    System.out.println("Question 2 (b):");
                    QueueOfStacks queue1 = new QueueOfStacks();
                    while(true){
                        System.out.print("Enter num:");
                        String value = input.next();
                        
                        if("n".equals(value))
                            break;
                        queue1.enqueue(Integer.parseInt(value));
                    }
                    queue1.showQueue();
                    queue1.dequeue();
                    queue1.showQueue();
                }
                case 5 -> {
                    System.out.println("Question 3 (a) and (b):");
                    BinaryTree tree = new BinaryTree();
                    while(true){
                        System.out.print("Enter num:");
                        String value = input.next();
                        if("n".equals(value))
                            break;
                        tree.insert(Integer.parseInt(value));
                        
                        
                    }
                    tree.preorder();
                    System.out.print("Enter Node:");
                    System.out.println("Height of tree:"+tree.hightFrom(input.nextInt()));
                }
                    
                    
                    
            }
        }
    }
}
