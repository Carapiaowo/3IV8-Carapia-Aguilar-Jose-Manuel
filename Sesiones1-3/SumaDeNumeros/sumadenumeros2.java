import java.util.Scanner;
//suma de numeros positivos
// más de dos numeros, los que sea no import jajaj 
class sumadenumeros2{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        int resultado=0;
        do{
            System.out.println("Escriba su numero: ");

            num1 = entrada.nextInt();

            while (num1<0){
                System.out.println("Introduzca un valor positivo, por favor: ");
                num1 = entrada.nextInt();
            }
            resultado = resultado + num1;
             }while (num1!=0);
            System.out.println("La el resultado de la suma es: "+resultado);
    }
}

