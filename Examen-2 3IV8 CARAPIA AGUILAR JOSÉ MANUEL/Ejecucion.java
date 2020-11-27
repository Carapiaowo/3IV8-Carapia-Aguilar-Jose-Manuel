import java.util.*;

public class Ejecucion{

    protected char[][] tablero = new char[3][3];
    protected int fila, columna;

    Tablero obj1 = new Tablero(tablero, 0, 0);

    Movimientos obj2 = new Movimientos(tablero, 0, 0);

    Ganador obj3 = new Ganador(tablero, 0, 0);


    public void ejecutar(){
        obj1.llenarTablero();
        obj1.imprimirTablero();

        do{
            
            obj2.jugadaSerVivo();
            obj1.imprimirTablero();
            boolean resultado = obj3.ganador1('X');
            if(resultado == true){
                System.out.println("Ha ganado el jugador.");
                break;
            }

            obj2.jugadaIA();
            obj1.imprimirTablero();
            resultado = obj3.ganador1('O');
            if(resultado == true){                
                System.out.println("Ha ganado el robot");
                break;
            }
            resultado = obj3.sinOpcion();
            if(resultado == false){
                System.out.println("Nadie gano.");
                break;
            }
        }while(true);
    }
    
}
