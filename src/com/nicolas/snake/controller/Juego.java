package com.nicolas.snake.controller;
import java.util.Random;
import java.util.LinkedList;

import com.nicolas.snake.model.Coordenadas;
import com.nicolas.snake.model.Manzana;
import com.nicolas.snake.model.Snake;
import com.nicolas.snake.model.Tablero;

public class Juego {

    private final int ancho = 20 ;
    private final int alto = 20 ;
    
    private Random random = new Random();
    
    private Manzana manzanita ; 
    private Coordenadas manzanaGenerada;


    private Tablero tablerito;
    private Snake serpiente ;
    
   

    

    private boolean estaVacio(Coordenadas c){

        if(tablerito.esValido(c)==true && serpiente.estaSerpiente(c)==false ){
            
            return true;
        }


        return false;
    }

    
    boolean estaCreciendo = manzanita.estaManzana(serpiente.cabezaNueva());




    private boolean gameOver(boolean crece){

        Coordenadas futura = serpiente.cabezaNueva();

        if(!tablerito.esValido(futura))  // validamos colision con muros
            return true;

            if(crece){                     // validamos colision con propio cuerpo
                return serpiente.coliCuerpo(futura,crece);
            }
            
            return false;
            }


            
   public void generarManzana() {

    int x = random.nextInt(ancho);
    int y = random.nextInt(alto);
    Coordenadas nueva = new Coordenadas(x, y);

    while (serpiente.estaSerpiente(nueva)) {
        x = random.nextInt(ancho);
        y = random.nextInt(alto);
        nueva = new Coordenadas(x, y);
    }

    manzanaGenerada = nueva; // aquí guardas la nueva manzana en el estado del juego

        }


        private void serpienteCrece(){

            if(serpiente.estaSerpiente(manzanaGenerada)){
                serpiente.crecer();
            }
        }
    }

        

   

