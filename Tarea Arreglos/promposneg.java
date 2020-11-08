import java.util.*;
class promposneg{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        
        char opcion;

        promposneg hola = new promposneg();

        do{
            hola.promposneg();

            System.out.println("");

            System.out.println("Si desea repetir el programa, presione s.");

            opcion = entrada.next().charAt(0);



        }while(opcion == 's');

        System.out.println("Gracias por utilizar el programa.");

    }

        public void promposneg(){

            Scanner entrada = new Scanner(System.in);

            int[] num = new int[10];
            int po=0;
            int ne=0;
            float promediopo=0;
            float promedione=0;

            System.out.println("Ingrese los numeritos ");

            for(int i=0; i<10; i++){

                System.out.println("Ingrese el " + (i+1) + " valor.");

                num[i] = entrada.nextInt();

            }
            for(int i=0; i<10; i++){
            
                if(num[i]>0){

                promediopo += num[i];

                po+=1;

            }else{

               promedione +=num[i];

               ne+=1;
            }
        }
        System.out.println("El promedio de los valores positivos es : " + promediopo/po);
        System.out.println("El promedio de los valores negativos es : " + promedione/ne);
    }
}