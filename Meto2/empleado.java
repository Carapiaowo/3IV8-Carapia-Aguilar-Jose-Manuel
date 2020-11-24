import javax.swing.JOptionPane;

public class empleado extends empleadoGeneral{

    protected int horasDiurnas;
    protected int horasNocturnas;

    public empleado(int idEmpleado, float sueldoQuincenal, String nombre, String puesto, int horasDiurnas, int horasNocturnas){
        super(idEmpleado, sueldoQuincenal, nombre, puesto);

        this.horasDiurnas = horasDiurnas;
        this.horasNocturnas = horasNocturnas;

    }

    public int getHorasDiurnas(){
        horasDiurnas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas diurnas extra que trabajo el empleado."));
        return horasDiurnas;
    }
    public void setHorasDiurnas(int horasDiurnas){
        this.horasDiurnas = horasDiurnas;
    }

    public int getHorasNocturnas(){
        horasNocturnas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas nocturnas extra que trabajo el empleado."));
        return horasNocturnas;
    }
    public void setHorasNocturnas(int horasNocturnas){
        this.horasNocturnas = horasNocturnas;
    }

    public int horasDiurnas_exc(){

        boolean correcto = false;

        while(correcto==false){
            try{

                getHorasDiurnas();

                if(horasDiurnas>0 && horasDiurnas<99){
  
                    correcto=true;

                }else{

                    JOptionPane.showMessageDialog(null, "Las horas extras no pueden ser menores a 0 ni mayores a 100.");

                }
                

            }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null,"Solo se aceptan valores numericos.");

            }
        }

        return horasDiurnas;

    }

    public int horasNocturnas_exc(){

        boolean correcto = false;

        while(correcto==false){
            try{

                getHorasNocturnas();

                if(horasNocturnas>0 && horasNocturnas<99){
  
                    correcto=true;

                }else{

                    JOptionPane.showMessageDialog(null,"Las horas extras no pueden ser menores a 0 ni mayores a 100.");

                }
                

            }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null,"Solo se aceptan valores numericos.");

            }
        }

        return horasNocturnas;

    }

    public float calculoEmpleado(){
        sueldoQuincenal = (5000 + (horasDiurnas_exc()*50) + (horasNocturnas_exc()*60));
        return sueldoQuincenal;
    }

    
    public void mostrarEmpleado(){
        empleadoGeneral obj1 = new empleadoGeneral(0, 5000, "", "");
        JOptionPane.showMessageDialog(null, "Id de Empleado: " + obj1.idEmpleado_exc() 
        + "\nNombre: " + getNombre()
        + "\nHoras extra Diurnas: " + horasDiurnas 
        + "\nHoras extra Nocturnas: " + horasNocturnas
        + "\nSu sueldo total es: $" + sueldoQuincenal);
    }
}
