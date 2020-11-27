import java.util.*;

public class Movimientos extends Tablero{

    public Movimientos(char[][]tablero, int fila, int columna){
        super(tablero,fila,columna);
    }
    

    //Un método por Exception :D
    public void jugadaSerVivo(){

        Scanner entrada = new Scanner(System.in);

        do{
            fila();
            columna();
            fila--;
            columna--;
        }while(tablero[fila][columna] != '-');
        tablero[fila][columna] = 'X';
    }

    public int columna(){

        boolean correcto=false;

        Scanner entrada = new Scanner(System.in);

        while(correcto==false){
            try{    
                do{
                    System.out.println("Ingresa la columna sobre la que quieras tirar.");
                    columna = entrada.nextInt();
                }while(columna<0 || columna>3);
                correcto=true;
            }catch(Exception e){
                System.out.println("Solo valores numericos.");
                columna();
                break;
            }
        }
        return columna;
    }

    public int fila(){

        String rojo="\033[31m"; 

        String reset="\u001B[0m";

        String verde ="\033[32m"; 

        boolean correcto=false;

        Scanner entrada = new Scanner(System.in);

        while(correcto==false){
            try{    
                do{
                    System.out.println(rojo + "Ingresa la fila sobre la que quieras tirar.");
                    fila = entrada.nextInt();
                }while(fila<0 || fila>3);
                correcto=true;
            }catch(Exception e){
                System.out.println("Solo valores numericos.");
                fila();
                break;
            }
        }
        return fila;
    }

    public void jugadaIA(){

        String rojo="\033[31m"; 

        String reset="\u001B[0m";

        String verde ="\033[32m"; 

        System.out.println( reset + verde + "Es el turno de la IA mas avanzada a dia de hoy");

        do{
            fila = (int)(Math.random()*(3-1+1)+1);

            columna = (int)(Math.random()*(3-1+1)+1);

        }while(tablero[fila-1][columna-1] != '-');
        tablero[fila-1][columna-1] = 'O';

    }
}
