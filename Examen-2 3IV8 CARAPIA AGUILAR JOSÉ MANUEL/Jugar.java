import java.util.*;

public class Jugar{

    public static void main(String[]args){

        Ejecucion obj1 = new Ejecucion();

        Scanner entrada = new Scanner(System.in);

        char opcion;

        String azul = "\033[34m";

        String amarillo = "\033[33m";

        String reset="\u001B[0m";

        System.out.println(azul + "Bienvenido al juego de gato." + reset + amarillo + "\nCreado por: \nCarapia Aguilar Jose manuel - 3IV8" + reset);

            do{
            System.out.println("Tu juegas con X.");
            obj1.ejecutar();
            System.out.println("Desea jugar de nuevo?\nSi             No");
            opcion = entrada.next().charAt(0);
            }while(opcion=='s' || opcion=='S');
    }
}