import javax.swing.JOptionPane;
public class todo{
    private int opcion;
    private char decision;
    public static void main(String[]args){

        todo obj = new todo();

        JOptionPane.showMessageDialog(null, "Bienvenido al programa de Metodos\nCreado por: Carapia Aguilar Jose Manuel");
        do{
            obj.opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge que programa quieres utilizar.\n1.- Edad \n2.- Calcular figuras. \n3.- Llamadas."));

            switch(obj.opcion){
                case 1:
                ejercicio1 obj1 = new ejercicio1();
                obj1.menu();
                obj.decision = JOptionPane.showInputDialog("Para regresar el menu principal presiona s.").charAt(0);
                break;
                case 2:
                ejercicio2 obj2 = new ejercicio2();
                obj2.elegir();
                obj.decision = JOptionPane.showInputDialog("Para regresar el menu principal presiona s.").charAt(0);
                break;
                case 3:
                ejercicio3 obj3 = new ejercicio3();
                obj3.elegir1();
                obj.decision = JOptionPane.showInputDialog("Para regresar el menu principal presiona s.").charAt(0);
                break;
            }
        }while(obj.decision=='s');
    }
}