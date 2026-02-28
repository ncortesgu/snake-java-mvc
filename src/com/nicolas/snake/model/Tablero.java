package com.nicolas.snake.model;

public class Tablero {
    
    private final int ancho = 20 ;
    private final int alto = 20 ;

    public Tablero() {
    }

    public boolean esValido(Coordenadas c){

        if(c.getY()<1 || c.getY() > alto-2 || c.getX()<1 || c.getX()>ancho-2){

            return false;
        }

        return true;
    }
    

}
