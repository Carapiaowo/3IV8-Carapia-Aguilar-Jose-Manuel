import java.util.*;
public class calificaciones{

    //Variables globales.
    String materia;
    float[] num = new float[10];
    float caal, prom;
    int apre, mepe, imp;

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
 
        char opcion;

        calificaciones resultado = new calificaciones();

        do{
            resultado.calificaciones();

            System.out.println("");

            System.out.println("Si desea repetir el programa, presione s.");

            opcion = entrada.next().charAt(0);



        }while(opcion == 's');

        System.out.println("Gracias por utilizar el programa.");

    }
    public void calificaciones(){

            Scanner entrada = new Scanner(System.in);
            //Variables

            System.out.println("\u00bfQu\u00e9 materia es esta?");

            materia = entrada.nextLine();

            System.out.println("Ingrese las calificaciones.");

            for(int i=0; i<num.length; i++){

                System.out.print("Calificaci\u00f3n " + (i+1) + ": ");

                num[i] = entrada.nextInt();

            }
            //Métodos
            System.out.println("En la materia " + materia + ":");
            imp = imprimir();
            prom = promedio();
            mepe = mejorpeor();
            caal = calificacionesaltas(prom);
            apre = aprobadosreprobados();
    }
    public int imprimir(){

        Scanner entrada = new Scanner(System.in);

        //Variables.

        for(int i=0; i<10; i++){

           System.out.println("La calificaci\u00f3n n\u00famero " + (i+1) + " es " + num[i]);    
        }
        return 1;
    }
    public float promedio(){

        float promedio=0;

        for(int i=0; i<10; i++){

            promedio += num[i];

        }
        promedio = promedio/10;
            System.out.println("El promedio de calificaciones es: " + (promedio));
        return promedio;
    }
    public int mejorpeor(){

        float mayor, menor;

        menor = mayor = num[0];

        for(int i=0; i<10; i++){
            if(num[i]>mayor){
                mayor = num[i];

            }else if(num[i]<menor)
            menor = num[i]; 
        }
        System.out.println("La calificaci\u00f3n m\u00e1s alta es: " + mayor);
        System.out.println("La calificaci\u00f3n m\u00e1s baja es: " + menor);
        return 1;
    }
    public float calificacionesaltas(float promedio){

        float cool=0;

        for(int i=0; i<10; i++){
            if(num[i]>promedio){
                cool++;
            }
        }

        System.out.println("El n\u00famero de calificaciones m\u00e1s altas que el promedio es: " + cool);
        return 1;
    }
    public int aprobadosreprobados(){

        int apro=0;
        int repro=0;

            for(int i=0; i<10; i++){
            
                if(num[i]>=6){

                apro+=1;

            }else{

                repro+=1;
                }
            }

            System.out.println("El total de aprobados es: " + apro);
            System.out.println("El total de reprobados es: " + repro);
        return 1;
    }
}