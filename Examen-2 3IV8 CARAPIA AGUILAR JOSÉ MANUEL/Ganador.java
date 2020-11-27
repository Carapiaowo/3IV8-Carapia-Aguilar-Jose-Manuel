import java.util.*;

public class Ganador extends Movimientos{

    public Ganador(char[][]tablero, int fila, int columna){
        super(tablero,fila,columna);
    }

    public boolean ganador1(char jugador){

        if(tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador){
            return true;
        }
        else if(tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador){
            return true;
        }
        else if(tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador){
            return true;
        }
        else if(tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador){
            return true;
        }
        else if(tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador){
            return true;
        }
        else if(tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador){
            return true;
        }
        else if(tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador){
            return true;
        }
        else if(tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean sinOpcion(){

        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                if(tablero[i][j] == '-'){
                    return true;
                }
            }
        }
        return false;
    }
}