
package gato;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Guardar implements Serializable {
    
    ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public ArrayList<Usuario> leer(){
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Usuarios.txt"));
            
            usuarios = (ArrayList<Usuario>)in.readObject();
            
            in.close();
        
        }catch(Exception e){
            System.out.println("Esperando ..... " + e.getMessage());
        
        }
        return usuarios;
    }
    
    void serializar(ArrayList<Usuario> guardar){
        try{
            FileOutputStream out = new FileOutputStream("Usuarios.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(guardar);
            objout.close();
        
        }catch(Exception e){
            System.out.println("Error ... "+ e.getMessage());
        
        }
    }

}