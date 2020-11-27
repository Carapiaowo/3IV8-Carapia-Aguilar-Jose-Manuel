import java.util.*;

public class Tablero{

    protected char[][] tablero = new char[3][3];
    protected int fila, columna;

    public Tablero(char[][]tablero, int fila, int columna){

        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
    }

    public char[][] getTablero(){
        return tablero;
    }

    public void setTablero(char[][]tablero){
        this.tablero = tablero;
    }

    public int getFila(){
        return fila;
    }

    public void setFila(int fila){
        this.fila = fila;
    }

    public int getColumna(){
        return columna;
    }

    public void setColumna(int columna){
        this.columna = columna;
    }

    public void llenarTablero(){

        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
            tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero(){

        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
            System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }  
    }
}