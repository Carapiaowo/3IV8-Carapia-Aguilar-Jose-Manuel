import java.util.*;
    class MenuGeneral{
        public static void main(String[]args){

            int opcion;
            char letra;
            
            Scanner entrada = new Scanner(System.in);

            System.out.println("3IV8_Carapia_Aguilar_Jose_Manuel");

            do{

                System.out.println("Escoja el programa que prefiera utilizar.");
                System.out.println("1.- Ejercicio 1.");
                System.out.println("2.- Ejercicio 2.");
                System.out.println("3.- Ejercicio 3.");
                System.out.println("4.- Ejercicio 4.");

                opcion = entrada.nextInt();

                switch(opcion){
                    case 1:
                        promposneg hola = new promposneg();
                        hola.promposneg();
                    break;
                    case 2:
                        prompar arreglo = new prompar();
                        arreglo.prompar();
                    break;
                    case 3:
                        calificaciones idk = new calificaciones();
                        idk.calificaciones();
                    break;
                    case 4:
                        sumatriz suma = new sumatriz();
                        suma.sumatriz();
                 break;
                }
                System.out.println("Si desea correr otro programa, presione s. De lo contrario, si desea salir presione n.");

                letra = entrada.next().charAt(0);
            }while(letra == 's');

            System.out.println("Gracias por utilizar este programa.");
    }
}
