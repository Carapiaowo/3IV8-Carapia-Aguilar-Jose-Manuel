import javax.swing.JOptionPane;
public class Principal{

    public void proletariado(){

        empleado obj1 = new empleado(0, 5000, "", "", 0, 0);

        supervisor obj2 = new supervisor(0, 8000f, "", "");

        do{
            obj1.getPuesto();
        }while(obj1.puesto.charAt(0) != 'E' && obj1.puesto.charAt(0) != 'S' && obj1.puesto.charAt(0) != 'e' && obj1.puesto.charAt(0) != 's' );



        obj1.mostrarGeneral();  
        if(obj1.puesto.charAt(0) == 'E' || obj1.puesto.charAt(0) == 'e'){
                obj1.calculoEmpleado();
                obj1.mostrarEmpleado();
            
        }else if(obj1.puesto.charAt(0) == 'S' || obj1.puesto.charAt(0) == 's'){
            obj2.calculoSupervisor();
            obj2.mostrarSupervisor();
        }
    }
}