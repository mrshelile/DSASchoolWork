/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackprep1test;

/**
 *
 * @author ghost
 */
public class StackPrep1Test {

    public static void main(String[] args) {
        InfixPostFix calc = new InfixPostFix();
        calc.toPostFix("A+B*C/D");
        System.out.println(calc.getPostfix());
        calc.toPostFix("(A+c)*B/D");
        System.out.println(calc.getPostfix());
        calc.toPostFix("A-C*B/(D+E)^F");
        System.out.println(calc.getPostfix());
        
        calc.toPostFix("5-4*2/(4+4)^2");
        System.out.println(calc.getPostfix());
        System.out.println("="+calc.evaluate(calc.getPostfix()));
    }
}
