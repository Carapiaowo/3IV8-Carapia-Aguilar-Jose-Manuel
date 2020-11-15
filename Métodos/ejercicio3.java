import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio3{
    //Variables privadas y así.
    private float credfi, credfin;
    private int numc;
    private char opcion;
    
   
    //Método que llama a todas las opciones y permite elegir.
    public void elegir1(){
        ejercicio3 obj3 = new ejercicio3();

        opcion = JOptionPane.showInputDialog("Para realizar una llamada presione 1.\nPara consultar y recargar credito presione 2.\nPara consultar credito presione 3.\nPara salir presione 4.").charAt(0);
        do{
            if(opcion=='1'){
                obj3.llamadas(credfi);
                obj3.elegir1();
            }else if(opcion=='2'){
                obj3.recarga();
                obj3.elegir1();
            }else if(opcion=='3'){
                obj3.mostrar(credfi, credfin);
                obj3.elegir1();
            }
        }while(opcion == '1' && opcion == '2' && opcion == '3');
    }
    //Método para mostrar el saldo.
    public void mostrar(float credfi, float credfin){
        JOptionPane.showMessageDialog(null, "El saldo es de : " + credfin);
    }
    //Método para la recarga.
    public float recarga(){

        ejercicio3 obj3 = new ejercicio3();
        float cuanto=0;

        numc = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero celular."));

        cuanto = Float.parseFloat(JOptionPane.showInputDialog("Nuestros planes de recarga son.\n 10 pesitos.\n 50 pesitos.\n 100 pesitos."));

        credfi += cuanto;

        JOptionPane.showMessageDialog(null,"Tu saldo es de: " + credfi + " pesitos.");
        return credfi; 

    }
    //Método para las llamadas.
    public float llamadas(float credfi){

        ejercicio3 obj3 = new ejercicio3();
        int llamada;
        float minutos, costo=0;
        llamada = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de llamda quieres realizar \n1.- Nacional.\n2.- Internacional.\n3.- Celular"));

            //Como no pidio que el usuario metiera la duración de la llamada lo hice al azar. :D
            minutos = (float )(Math.random() * 60) + 1;
            switch(llamada){
                case 1:

                costo = minutos * 0.5f;

                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio de telefonia\nEl costo total de su llamada es de: " + costo);

                break;
                case 2:

                costo = minutos * 0.65f;

                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio de telefonia\nEl costo total de su llamada es de: " + costo);


                break;
                case 3:

                costo = minutos * 0.2f;

                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio de telefonia\nEl costo total de su llamada es de: " + costo);


                break;

                default: 
                JOptionPane.showMessageDialog(null, "Por favor, introduzca una opcion valida.");
                obj3.llamadas(credfi);

            }
            credfin=credfi-costo;

            JOptionPane.showMessageDialog(null,"Tu saldo final es de: " + credfin);

            return credfin;
        }
}