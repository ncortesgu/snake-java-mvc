package com.nicolas.snake.view;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame  {

    

    public Frame(){

        this.setTitle("snake");
        this.setSize(950,950);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);


        this.setVisible(true);


        
        

    }
    
}




