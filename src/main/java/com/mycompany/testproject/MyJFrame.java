/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testproject;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jack2
 */
public class MyJFrame {
    
    public static void makeWindow(String window, String textIn)
    {
       // Create a new JFrame
        JFrame frame = new JFrame(window);

        // Create a label
        JLabel label = new JLabel(textIn);

        // Add the label to the frame
        frame.add(label);

        // Set frame properties
        frame.setSize(600, 400); // Set the size of the frame

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true); 
    }
        
}
