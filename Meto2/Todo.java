import javax.swing.JOptionPane;

public class Todo{

    
    public static void main(String[]args){

        int opcion;
        char letra;

        Datos obj1 = new Datos();
        Principal obj2 = new Principal();
        Desglose obj3 = new Desglose();

        JOptionPane.showMessageDialog(null,"Programa por: \n Carapia Aguilar J. M. - 3IV8");

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el programa que desea correr. \n1.Empleado\n2.Tienda\n3.Libreria\n4.- Salir"));

            switch(opcion){
                case 1:
                obj2.proletariado();
                break;
                case 2:
                obj1.ingresarDatos_1();
                obj1.mostrarDatos_1();
                break;
                case 3:
                obj3.ejecucion();
                break;

            }
            letra = JOptionPane.showInputDialog("Para repetir el programa presione s.").charAt(0);
        }while(letra=='s');
    }
}