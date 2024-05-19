/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackpreptest;

/**
 *
 * @author ghost
 */
public class ParamsChecker {
    private final char[] opening = {'{','[','('};
    private final char[] closing = {'}',']',')'};
    
    private int getOpening(char c){
        for(int i=0;i<opening.length;i++)
            if(opening[i]==c)
                return i;
        return -1;
    }
    private int getClosing(char c){
        for(int i=0;i<closing.length;i++)
            if(closing[i]==c)
                return i;
        return -1;
    }
    public boolean check(String sequence){
        StackArray stack = new StackArray();
        for(char c:sequence.toCharArray()){
            if(getOpening(c)!=-1){
               stack.push(c);
            }
            else{
             
             int op = getClosing(c);
             int opP = getOpening(stack.peek());
             if(op!=opP)
                 return false;
             stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
