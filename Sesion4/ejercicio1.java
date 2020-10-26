import java.util.*; /*se llama a lo que se ocupa nada más

*/

class ejercicio1{
    public void ejercicio1(){

        Scanner entrada = new Scanner(System.in);

    
        int edad, socios; 
        double abono;
        char letra;
        
        System.out.println("Bienvenido al ejercicio 1.");
        
        do{

        System.out.println("Escribe tu edad: "); 
        edad = entrada.nextInt();
        System.out.println("Escribe tu abono: "); 
        abono = entrada.nextDouble();
        
       if (edad > 65){
           
            abono = abono*.6;
            System.out.println("El total a pagar es: " + abono);
        }
        if (edad < 21){
           System.out.println("Si tus padres son socios, selecciona 1. De lo contrario, selecciona 2.");

           socios = entrada.nextInt();

            switch (socios){
                case 1: 
                abono = abono*.55;
                System.out.println("El total a pagar es:" + abono);

                break;
                default:
                abono = abono*.75;
                System.out.println("El total a pagar es: " + abono);

            }
            
        }
        System.out.println("Tu edad es: " + edad); 
        System.out.println("El total a pagar es: " + abono); 

        System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
        System.out.println("Si desea regresar al menu presione n.");
  
        letra = entrada.next().charAt(0);

    }while(letra == 's');
}
}