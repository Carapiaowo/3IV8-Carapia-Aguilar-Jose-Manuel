import javax.swing.JOptionPane;
import java.util.*;

public class empleadoGeneral{

    private int idEmpleado;
    protected float sueldoQuincenal;
    private String nombre;
    protected String puesto;

    public empleadoGeneral(int idEmpleado, float sueldoQuincenal, String nombre, String puesto){

        this.idEmpleado = idEmpleado;
        this.sueldoQuincenal = sueldoQuincenal;
        this.nombre = nombre;
        this.puesto = puesto;

    }

    public int getIdEmpleado(){
       idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del empleado."));
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }

    public float getSueldoQuincenal(){
        return sueldoQuincenal;
    }
    public void setSueldoQuincenal(float sueldoQuincenal){
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public String getNombre(){
        nombre = JOptionPane.showInputDialog("Introduzca el nombre del empleado.");
        return nombre;
    }
    public void setNombre(String nombre){   
        this.nombre = nombre;    
    }

    public String getPuesto(){
        puesto = JOptionPane.showInputDialog("Introduzca el puesto del empleado.");

        return puesto;
    }
    public void setPuesto(String puesto){   
        this.puesto = puesto; 
    }

    public int idEmpleado_exc(){

        boolean correcto = false;

        while(correcto==false){
            try{

                getIdEmpleado();

                if(idEmpleado>10000 && idEmpleado<99999){
  
                    correcto=true;

                }else{

                    JOptionPane.showMessageDialog(null,"Los id empiezan por 1 y tienen 5 cifras.");

                }
                

            }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null,"Solo se aceptan valores numericos.");

            }
        }

        return idEmpleado;

    }

    public void mostrarGeneral(){
        JOptionPane.showMessageDialog(null, "Su puesto es: " + puesto);
            
    }
}