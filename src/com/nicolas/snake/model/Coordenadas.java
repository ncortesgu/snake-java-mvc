package com.nicolas.snake.model;

// va a ser nuestra clase principal para saber las coordenadas de cada objeto en nuestro juego

public class Coordenadas {

    // ATRIBUTOS 

    private int y; // FILAS
    private int x; // COLUMNAS
    
    
    // CONSTRUCTOR GETTERS Y SETTERS

    public Coordenadas(int y, int x) {
        this.y = y;
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }



}
