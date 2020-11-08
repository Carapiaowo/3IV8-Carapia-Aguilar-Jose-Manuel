import java.util.*;

public class sumatriz{

    Scanner entrada = new Scanner (System.in);

    //Variables globales
    int matriza[][] = new int [3][3];
    int matrizb[][] = new int [3][3];
    int matrizs[][] = new int [3][3];
    int i, j;
    
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        char opcion;

        do{
            sumatriz suma = new sumatriz();
            
            suma.sumatriz();

            System.out.println("");

            System.out.println("Si desea repetir el programa, presione s.");

            opcion = entrada.next().charAt(0);

        }while(opcion == 's');

        System.out.println("Gracias por utilizar el programa.");
    }
    
    public void sumatriz(){

        sumatriz suma = new sumatriz();

        suma.ma();
        suma.mb();
        suma.ms();
        
    }
    
    public int ma(){
        System.out.println("Matriz A:");

        for (i = 0; i <= 2; i++){

            for (j = 0; j <= 2; j++){

                System.out.print("Ingrese el valor de [" + (i+1) + "] [" + (j+1) + "]: ");

                matriza [i][j] = entrada.nextInt();
            }
        }
        return 1;
    }
    
    public int mb(){
        System.out.println("Matriz B:");

        for (i = 0; i <= 2; i++){

            for (j = 0; j <= 2; j++){

                System.out.print("Ingrese el valor de [" + (i+1) + "] [" + (j+1) + "]: ");

                matrizb[i][j] = entrada.nextInt();
            }
        }
            
        for (i = 0; i <= 2; i++){

            for (j = 0; j <= 2; j++){

                 matrizs [i][j] = matriza[i][j] + matrizb[i][j];
            }
        }
        return 1;
    }
        
    public int ms(){
        System.out.println("Matriz resultante de la suma:");

        for (i = 0; i <= 2; i++){

            for (j = 0; j <= 2; j++) {
                
                System.out.print(matrizs[i][j] + " ");
            }
            
            System.out.println("");
        }
        return 1;
    }
}