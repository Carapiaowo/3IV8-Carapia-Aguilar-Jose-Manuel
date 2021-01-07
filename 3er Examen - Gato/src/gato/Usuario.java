
package gato;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    protected int puntuacion;
    
    protected int edad;
    
    protected String nombre;
    
    protected String contraseña;
    
    public Usuario(int puntuacion, int edad, String nombre, String contraseña) {
        this.puntuacion = puntuacion;
        this.edad = edad;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    
    public Usuario(){
        
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
