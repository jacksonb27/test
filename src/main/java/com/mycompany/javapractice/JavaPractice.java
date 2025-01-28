/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractice;

/**
 *
 * @author Jackson Bullard
 */

import java.util.Scanner;

public class JavaPractice {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        //input numbers
        System.out.print("Input number 1: ");
        float num1 = scanner.nextFloat();
        System.out.print("Input number 2: ");
        float num2 = scanner.nextFloat();
    
        //output numbers
        System.out.print("Added: ");
        System.out.println(mathUtils.addNums(num1, num2));
        
        System.out.print("Subtracted: ");
        System.out.println(mathUtils.subtractNums(num1, num2));
        
        System.out.print("Mulitplied: ");
        System.out.println(mathUtils.multiplyNums(num1, num2));
        
        System.out.print("Divided");
        System.out.println(mathUtils.divideNums(num1, num2));
    }
    

}
