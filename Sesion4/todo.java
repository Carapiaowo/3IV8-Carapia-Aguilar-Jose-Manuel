import java.util.*;
import javax.swing.JOptionPane;
    class todo{
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
            System.out.println("5.- Ejercicio 5.");
            System.out.println("6.- Ejercicio 6.");
            System.out.println("7.- Ejercicio 7.");
            System.out.println("8.- Ejercicio 8.");
            System.out.println("9.- Ejercicio 9.");
            System.out.println("10.- Ejercicio 10.");
            System.out.println("11.- Ejercicio 11.");
            System.out.println("12.- Ejercicio 12.");
            System.out.println("13.- Ejercicio 13.");
            System.out.println("14.- Salir.");

            opcion = entrada.nextInt();

                switch(opcion){
                    case 1:
                        ejercicio1 ej1=new ejercicio1();
                        ej1.ejercicio1();
                    break;
                    case 2:
                        ejercicio2 ej2=new ejercicio2();
                        ej2.ejercicio2();
                    break;
                    case 3:
                    ejercicio3 ej3=new ejercicio3();
                        ej3.ejercicio3();
                    break;
                    case 4:
                    ejercicio4 ej4=new ejercicio4();
                        ej4.ejercicio4();
                    break;
                    case 5:
                    ejercicio5 ej5=new ejercicio5();
                        ej5.ejercicio5();
                    break;
                    case 6:
                    ejercicio6 ej6=new ejercicio6();
                        ej6.ejercicio6();
                    break;
                    case 7:
                    ejercicio7 ej7=new ejercicio7();
                        ej7.ejercicio7();
                    break;
                    case 8:
                    ejercicio8 ej8=new ejercicio8();
                        ej8.ejercicio8();
                    break;
                    case 9:
                    ejercicio9 ej9=new ejercicio9();
                        ej9.ejercicio9();
                    break;
                    case 10:

                    System.out.println("No disponible por el momento.");

                    break;
                    case 11:
                    
                    System.out.println("No disponible por el momento.");

                    break;
                    case 12:
                    
                    System.out.println("No disponible por el momento.");

                    break;
                    case 13:
                    
                    ejercicio13 ej13=new ejercicio13();
                        ej13.ejercicio13();

                    break;
                    default:
                    System.out.println("Gracias por utilizar el software.");
                }
           
                System.out.println("Si desea correr otro programa, presione y. De lo contrario, si desea salir presione n.");

                letra = entrada.next().charAt(0);

            }while(letra == 'y');

            System.out.println("Gracias por utilizar el software.");
        }
    }