/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable{
    
    protected ArrayList<Usuario> listaUsuarios;
    
    private Guardar archivo = new Guardar();
    
    public Usuarios() {
        
        listaUsuarios = new ArrayList<>();
        
        listaUsuarios = archivo.leer();
    }
    
    public Usuarios(ArrayList listaUsuarios) {
        this.listaUsuarios=listaUsuarios;
    }
        
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setLista_recetas(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Guardar getArchivo() {
        return archivo;
    }

    public void setArchivo(Guardar archivo) {
        this.archivo = archivo;
    }
    
    public void guardar(){
        getArchivo().serializar(listaUsuarios);
    }
}