import javax.swing.JOptionPane;

public class supervisor extends empleadoGeneral{

    public supervisor(int idEmpleado, float sueldoQuincenal, String nombre, String puesto){
        super(idEmpleado, sueldoQuincenal, nombre, puesto);
    }


    public float calculoSupervisor(){
        sueldoQuincenal = 8000f - (8000f*0.002f) - (8000f*0.001f) - (8000f*0.0016f);
        return sueldoQuincenal;
    }
    
    public void mostrarSupervisor(){
        empleadoGeneral obj1 = new empleadoGeneral(0, 5000, "", "");
        JOptionPane.showMessageDialog(null, "Id de Empleado: " + obj1.idEmpleado_exc()
        + "\nSu nombre es: " + getNombre() 
        + "\nEl sueldo total es: $" + sueldoQuincenal);
    }
}
