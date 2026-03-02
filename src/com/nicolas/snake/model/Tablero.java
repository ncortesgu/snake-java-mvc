package com.nicolas.snake.model;

public class Tablero {
    
    private final int ancho = 20 ;
    private final int alto = 20 ;

    public Tablero() {
    }

    // verificamos que cierta coordenada este dentro de los limites del mapa

    public boolean esValido(Coordenadas c){

        if(c.getY()<1 || c.getY() > alto-2 || c.getX()<1 || c.getX()>ancho-2){

            return false;
        }

        return true;
    }
    

}
