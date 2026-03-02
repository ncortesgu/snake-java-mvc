package com.nicolas.snake.model;
import java.util.Random;
import com.nicolas.snake.model.Coordenadas;
import com.nicolas.snake.model.Manzana;
import com.nicolas.snake.model.Snake;
import com.nicolas.snake.model.Tablero;
import java.util.Random;

public class game {

    // Limites tablero
    private final int ancho = 20 ;
    private final int alto = 20 ;
  
    // declaramos el numero random
    private Random random = new Random();
    
    
    

    // le damos conocimiento a game de manzana snake y tablero 
    private Manzana manzanita ; 
    private Tablero tablerito;
    private Snake serpiente ;
    private boolean estaCreciendo;
    private Coordenadas manzanaGenerada;
    


    public game() { // les damos vida a nuestras variables declaradas

        this.serpiente = new Snake();
        this.tablerito = new Tablero();
        this.manzanita = new Manzana();
        this.generarManzana();
        this.estaCreciendo = manzanita.estaManzana(this.manzanaGenerada);

    }

     
    

// metodo que nos comprueba si hemos perdido ya sea por colision con pared o con nuestro propio cuerpo

    private boolean gameOver(boolean crece){

        Coordenadas futura = serpiente.cabezaNueva();

        if(!tablerito.esValido(futura))  // validamos colision con muros
            return true;

            if(crece){                     // validamos colision con propio cuerpo
                return serpiente.coliCuerpo(futura,crece);
            }
            
            return false;
            }

       // metodo que solamente nos almacena una manzana generada en nuestra variable previamente creada     
            
   public void generarManzana() {

    int x = random.nextInt(ancho);
    int y = random.nextInt(alto);
    Coordenadas nueva = new Coordenadas(x, y);

    while (serpiente.estaSerpiente(nueva)) {

        if(serpiente.tamañoSerpiente() == alto*ancho){

            break;
        }

        x = random.nextInt(ancho);
        y = random.nextInt(alto);
        nueva = new Coordenadas(x, y);
    }

    manzanaGenerada = nueva; // aquí guardas la nueva manzana en el estado del juego

        }
        
        // metodo que nos retorna las coordenadas de esa manzana

        public Coordenadas nuevaManzana(){
            return manzanaGenerada;
        }

        // metodo que hace que la serpiente crezca si esta en la misma pocision de una manzana
        
        private void serpienteCrece(){

            if(serpiente.estaSerpiente(manzanaGenerada)){
                serpiente.crecer();
            }
        }
         
}
