package com.nicolas.snake.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;



import com.nicolas.snake.model.Snake;
import com.nicolas.snake.model.game;



public class Panel extends JPanel{

    public Snake snake = new Snake();
    public game juego = new game();
    

    public Panel(){
            this.setBackground(Color.green);
            this.setPreferredSize(new Dimension(800,800));
          
    }
    
    


    

        

       
       

    }


    

    

