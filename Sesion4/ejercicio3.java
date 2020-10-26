import java.util.Scanner;

class ejercicio3{
    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);

        int opcion;
        double  temperaturafinal, temperatura;
        char letra;

        System.out.println("Bienvenido al ejercicio 3.");

        do{

        System.out.println("Ingrese su temperatura en grados Farenheit");
        temperatura = entrada.nextInt();

        System.out.println("Escoja a que grados quiere convertir");
        System.out.println("1.- Celsius.");
        System.out.println("2.- Kelvine.");
        System.out.println("3.- Rankine.");

        opcion = entrada.nextInt();

        switch (opcion){

            case 1: 
            temperaturafinal = (temperatura-32)*5/9;
            System.out.println(temperatura + " farehnheit es igual a " + temperaturafinal + " celsius.");
            break;
            case 2:
            temperaturafinal = ((temperatura-32)*5/9)+273.15;
            System.out.println(temperatura + " farehnheit es igual a " + temperaturafinal + " kelvine.");
            break;
            case 3:
            temperaturafinal = temperatura+459.67;
            System.out.println(temperatura + " farehnheit es igual a " + temperaturafinal + " rankine.");
            break;
            default:

            
        } 
        System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
        System.out.println("Si desea regresar al menu presione n.");

            letra = entrada.next().charAt(0);
    }while(letra == 's');   
}
}