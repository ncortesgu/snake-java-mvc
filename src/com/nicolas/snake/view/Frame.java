package com.nicolas.snake.view;

import javax.swing.JFrame;
import com.nicolas.snake.model.game;

public class Frame extends JFrame {

    public Frame() {
        // 1. Configuraciones básicas
        this.setTitle("Snake Game - Nicolás");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); 

        // 2. Inicializamos el Modelo y el Panel
        game modelo = new game();
        Panel lienzo = new Panel(modelo);

        // 3. ARMADO DE LA VENTANA (Lo que falta en tu captura)
        this.add(lienzo);           // Pegamos el panel azul
        this.pack();                // Ajusta el tamaño al panel (950x950)
        this.setLocationRelativeTo(null); // Centra la ventana en tu pantalla
        
        // 4. EL ACTO FINAL
        this.setVisible(true);      // ¡Esto es lo que la hace aparecer!
        
        System.out.println("DEBUG: Ventana abierta correctamente.");
    }
}




