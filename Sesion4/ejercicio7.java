import java.util.Scanner;
class ejercicio7{
    public void ejercicio7(){

        Scanner entrada = new Scanner (System.in);
        int n;
        char letra;

        System.out.println("Bienvenido al ejercicio 7.");

        do{
        for(n=1; n<=10; n=n+1){

        System.out.println(n+" "+(n*10)+" "+(n*100)+" "+(n*1000));

            }

            System.out.println("Si desea repetir el programa presione s.");
            System.out.println("Si desea regresar al menu presione n.");
            letra = entrada.next().charAt(0);
            
        }while(letra == 's');
    } 
}