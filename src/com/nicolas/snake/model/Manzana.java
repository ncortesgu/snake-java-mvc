package com.nicolas.snake.model;


public class Manzana {
    
Coordenadas ubicacionManzana ;


public Manzana(Coordenadas ubicacionManzana) {
  this.ubicacionManzana = ubicacionManzana;
}




public boolean estaManzana(Coordenadas c){

    if(ubicacionManzana.getY() == c.getY() && ubicacionManzana.getX() == c.getX()){;
        
            return true;
          }
          return false;
}


}
