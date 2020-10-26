import java.util.Scanner; 

class Sumadenumeros{

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
// variablessss
        int  num1, num2, resultado;

        System.out.println("Escribe el primer numero: ");

        num1 = entrada.nextInt();

        System.out.println("Escribe el segundo numero: ");

        num2 = entrada.nextInt();

        resultado = num1+num2;

        System.out.println("Este es el resultado: "+resultado);

        
    }

}
