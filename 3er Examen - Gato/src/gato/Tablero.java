package gato;

import javax.swing.JOptionPane;

public class Tablero{

    protected char[][] tablero = new char[3][3];
    protected int fila, columna;
    protected int ganador=0;
    protected int puntos;
    protected boolean existe;
    Usuarios uss = new Usuarios();
    
    public Tablero(char[][]tablero, int fila, int columna){

        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
    }

    public Tablero(){
        
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
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
  
    protected char turno;

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    protected void jugadaSerVivo(){
        
       if(tablero[fila][columna] == '-'){
            if(turno == 'X'){

                //Vemos en qué casilla están, dependiendo de ello asignamos valores.

                tablero[fila][columna] = 'X';
                
                //Cambiamos de turno
                turno = 'O';
                
            }else if(turno == 'O'){

                tablero[fila][columna] = 'O';

                turno = 'X';
            }
        }else if(tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O'){
           JOptionPane.showMessageDialog(null, "Esa casilla ya está ocupada");
           
           
       } 
    }
    
    private boolean ganador(char jugador){

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
    
    protected void comprobarGanadorX(){
        boolean resultado = ganador('X');
        IniciarSesion in = new IniciarSesion();            
        
            if(resultado == true){
                                
                JOptionPane.showMessageDialog(null, "Ha ganado el jugador X" + ".");

                int resp=JOptionPane.showConfirmDialog(null,"¿Quiere volver a jugar?");
                
                if (JOptionPane.YES_OPTION == resp){

                    llenarTablero();
                    
                    ganador = 1;
                    
                }
                else{
                    
                   int respuesta=JOptionPane.showConfirmDialog(null,"¿Quieres guardar tu puntuación?");
                   
                   if(JOptionPane.YES_OPTION == respuesta){
                       
                       while(in.existe==false){
                            String nombre = JOptionPane.showInputDialog(null,"Ingresa tu usuario para poder guardar tu puntuación");

                            try{
                                in.buscarUsuario(nombre);
                            }catch(Exception e){
                                
                            }
                            uss.listaUsuarios.get(in.Usuario).setPuntuacion(uss.listaUsuarios.get(in.Usuario).getPuntuacion()+100);
                            
                            uss.guardar();
                            
                            ganador=2;
                       }

                   }else{

                       ganador=2;
                       
                   }
                    
                   
                }

        }   
    }
    
    protected void comprobarGanadorO(){
    boolean resultado = ganador('O');
    IniciarSesion in = new IniciarSesion();
                       
        
            if(resultado == true){
                                
                JOptionPane.showMessageDialog(null, "Ha ganado el jugador O" + ".");
                
                int resp=JOptionPane.showConfirmDialog(null,"¿Quiere volver a jugar?");
                
                if (JOptionPane.YES_OPTION == resp){

                    llenarTablero();
                    
                    ganador = 1;
                    
                }
                else{
                    
                   int respuesta=JOptionPane.showConfirmDialog(null,"¿Quieres guardar tu puntuación?");
                   
                   if(JOptionPane.YES_OPTION == respuesta){
                       
                       while(in.existe==false){
                            String nombre = JOptionPane.showInputDialog(null,"Ingresa tu usuario para poder guardar tu puntuación");

                            try{
                                in.buscarUsuario(nombre);
                            }catch(Exception e){
                                
                            }
                            uss.listaUsuarios.get(in.Usuario).setPuntuacion(uss.listaUsuarios.get(in.Usuario).getPuntuacion()+100);
                                                       
                            uss.guardar();
                            
                            ganador=2;
                       }

                   }else{

                       ganador=2;
                       
                   }
                }
            }   
    }
    
    
}