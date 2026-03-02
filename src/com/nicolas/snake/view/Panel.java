package com.nicolas.snake.view;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import com.nicolas.snake.model.game;

public class Panel extends JPanel{

   private game logica;
   private int tamañoCelda;

   public Panel(game logica){

    this.logica=logica;
    this.setPreferredSize(new Dimension(950,950)); // creamos dimensiones del panel
    this.setBackground(Color.blue);// asignamos color al panel  
    this.setFocusable(true);// dejamos que el panel reciba eventos externos como el teclado
    
       }

      @Override
protected void paintComponent(Graphics g) {
    // Esta línea es la que realmente aplica el color de fondo y limpia el panel
    super.paintComponent(g); 

    // Opcional: Dibujemos un cuadradito para confirmar que el lienzo responde
    g.setColor(Color.WHITE);
    g.fillRect(50, 50, 100, 100); 
}


       
    
}


    

    

