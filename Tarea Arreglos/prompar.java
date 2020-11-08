import java.util.*;
class prompar{

    int[] num = new int[10];
    int promedio=0;

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        
        char opcion;

        prompar arreglo = new prompar();

        do{
            arreglo.prompar();

            System.out.println("");

            System.out.println("Si desea repetir el programa, presione s.");

            opcion = entrada.next().charAt(0);

        }while(opcion == 's');

        System.out.println("Gracias por utilizar el programa.");

    }

        public void prompar(){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese los numeritos ");

            for(int i=0; i<10; i++){
                System.out.println("Ingrese el " + (i+1) + " valor.");
                num[i] = entrada.nextInt();
            }

            for(int i=0; i<10; i++){
                System.out.println("El valor n\u00famero " + (i+1) + " es "+ (num[i]) + ".");
            }

            for(int i=0; i<10; i++){
                if(0==num[i]%2){
                promedio += num[i];
                }
            }
        System.out.println("El promedio de los valores en las posiciones pares del arreglo es : " + promedio/5);
        }
}