package com.nicolas.snake.model;

import java.util.LinkedList;

public class Snake {

    // ATRIBUTOS 

   private LinkedList<Coordenadas> cuerpo = new LinkedList<Coordenadas>(); // CUERPO
   private Direccion direccionActual;
   
   public Snake() {
    cuerpo.add(new Coordenadas(1, 1));
    cuerpo.add(new Coordenadas(1, 2));
    cuerpo.add(new Coordenadas(1, 3));

    direccionActual = Direccion.DERECHA; // dirección inicial
}


    // METODOS 

    public void mover(){
        
        switch(direccionActual){

            case ARRIBA : cuerpo.add (new Coordenadas(cuerpo.getLast().getY()-1, cuerpo.getLast().getX())); // CREAMOS LA NUEVA CABEZA
            cuerpo.removeFirst();  // ELIMINAMOS LA COLA 
            break;

            case ABAJO : cuerpo.add (new Coordenadas(cuerpo.getLast().getY()+1, cuerpo.getLast().getX())); // CREAMOS LA NUEVA CABEZA
            cuerpo.removeFirst();
            break;

            case DERECHA : cuerpo.add (new Coordenadas(cuerpo.getLast().getY(), cuerpo.getLast().getX()+1)); // CREAMOS LA NUEVA CABEZA
            cuerpo.removeFirst();
            break;

            case IZQUIERDA : cuerpo.add (new Coordenadas(cuerpo.getLast().getY(), cuerpo.getLast().getX()-1)); // CREAMOS LA NUEVA CABEZA
            cuerpo.removeFirst();
            break;
        }
    }

    public Coordenadas cola(){

        return cuerpo.getFirst();
    }

    
    public Coordenadas cabeza(){

       return cuerpo.getLast(); 
    }
      
    public Coordenadas cabezaNueva(){
       
        switch(direccionActual){

            case ARRIBA : 
            return new Coordenadas(cabeza().getY()-1, cabeza().getX());
            case ABAJO : 
            return new Coordenadas(cabeza().getY()+1, cabeza().getX());
            case DERECHA : 
            return new Coordenadas(cabeza().getY(), cabeza().getX()+1);
            case IZQUIERDA : 
            return new Coordenadas(cabeza().getY(), cabeza().getX()-1);
        }
        return null;
    }

    public void crecer(){  // lo mismo que mover pero sin borrar la cola 

        switch(direccionActual){

            case ARRIBA : cuerpo.add (new Coordenadas(cuerpo.getLast().getY()-1, cuerpo.getLast().getX())); // CREAMOS LA NUEVA CABEZA
            
            break;

            case ABAJO : cuerpo.add (new Coordenadas(cuerpo.getLast().getY()+1, cuerpo.getLast().getX())); // CREAMOS LA NUEVA CABEZA
            
            break;

            case DERECHA : cuerpo.add (new Coordenadas(cuerpo.getLast().getY(), cuerpo.getLast().getX()+1)); // CREAMOS LA NUEVA CABEZA
            
            break;

            case IZQUIERDA : cuerpo.add (new Coordenadas(cuerpo.getLast().getY(), cuerpo.getLast().getX()-1)); // CREAMOS LA NUEVA CABEZA
            
            break;
        }

    }

    public boolean estaSerpiente (Coordenadas c){

        
        
        for(int i = 0 ; i < cuerpo.size() ;i++){

            if(cuerpo.get(i).getY() == c.getY() && cuerpo.get(i).getX() == c.getX());
                    return true;
            }

         return false;
            
    }
        
    public boolean coliCuerpo (Coordenadas c, boolean crece){

        int indice = crece ? 0 : 1;
        int limite = cuerpo.size()-1;
        for(int i= indice ; i < limite ;i++){

            if(cuerpo.get(i).getY() == c.getY() && cuerpo.get(i).getX() == c.getX()){;
        
            return true;
          }
        }

         return false;
            
    }

}
