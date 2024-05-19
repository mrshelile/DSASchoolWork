/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackprep1test;

/**
 *
 * @author ghost
 */
public class InfixPostFix {
  private Stack stack;
  private String postfix;
  
  private int operatorPrecendence(char operator){
      return switch (operator) {
          case '(' -> 0;
          case ')' -> -1;
          case '+', '-' -> 1;
          case '/', '*' -> 2;
          case '^' -> 3;
          default -> -2;    // All operands
      };
  }
  public String getPostfix(){
      return postfix;
  }
  public void toPostFix(String infix){
      stack = new Stack();
      postfix="";
      for(char c:infix.toCharArray()){
          int precedence = this.operatorPrecendence(c);
          switch (precedence) {
              case -2 -> postfix += c;
              case 0 -> stack.push(c);
              case -1 ->               {   
                  if(stack.isEmpty())
                     break;
                  while(this.operatorPrecendence((char)stack.peek())!=0){
                      
                      postfix+=(char)stack.pop();
                  }
                  stack.pop();
              }
              default -> {
                  if(stack.isEmpty())
                      stack.push(c);
                  else{
                      while(true){
                          if(stack.isEmpty())
                          {
                              stack.push((char)c);
                              break;
                          }
                          else if(this.operatorPrecendence((char)stack.peek())>= precedence)
                              postfix+=(char)stack.pop();
                          else
                          {
                              stack.push((char)c);
                              break;
                          }
                      }
                  }
              }
          }
      }
      while(!stack.isEmpty())
          postfix+=(char)stack.pop();
  }
  public double evaluate(String postFfix){
      stack = new Stack();
//      stack.push("0");
      for(char c:postfix.toCharArray()){
          if(this.operatorPrecendence(c)==-2){
              stack.push(c);
          }
          else{
           double res=0;
           double num1 = Double.parseDouble(stack.pop().toString());
           double num2 = Double.parseDouble(stack.pop().toString());
           switch(c){
               case '+':
                   res =num2+num1;
                   break;
               case '-':
                    res =num2-num1;
                   break;
               case '*':
                    res =num2*num1;
                   break;
               case '/':
                    res =num2/num1;
                   break;
               case '^':
                    res =Math.pow(num1, num2);
                   break;
           }
           stack.push(res);
          }
      }
      return Double.parseDouble(stack.pop().toString());
  }
}
