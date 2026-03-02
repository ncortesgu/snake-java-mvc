package com.nicolas.snake.model;


public class Manzana {
    
Coordenadas ubicacionManzana ;

public Manzana() {
}

public Manzana(Coordenadas ubicacionManzana) {
  this.ubicacionManzana = ubicacionManzana;
}


// verificamos que cierta coordenada iguala las de nuestra manzana

public boolean estaManzana(Coordenadas c){

    if(ubicacionManzana.getY() == c.getY() && ubicacionManzana.getX() == c.getX()){;
        
            return true;
          }
          return false;
}


}
