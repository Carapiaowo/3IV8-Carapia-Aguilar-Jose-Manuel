import java.util.Scanner;

class ejercicio2{

    public void ejercicio2(){

        Scanner entrada = new Scanner (System.in);

        int numero, residuo;
        String binario = "";
        char letra;

        System.out.println("Bienvenido al ejercicio 2.");

        do{
        System.out.println("Ingrese un numero para conocer su valor binario.");

        numero = entrada.nextInt();

        do { 
        residuo = numero%2;
        binario = binario + residuo;
        numero = numero/2;
        } while (numero != 0);

        binario = new StringBuilder(binario).reverse().toString();

        System.out.println("El numero en binario es: " + binario);

        System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
        System.out.println("Si desea regresar al menu presione n.");
  
        letra = entrada.next().charAt(0);

    }while(letra == 's');
}
}
