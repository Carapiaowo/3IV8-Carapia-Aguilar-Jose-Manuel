import java.util.Scanner;

class figurasclasico{

  

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion;
        char letra;
        //char es un solo símbolo y va con comilla simple, String va con comilla doble
        double resultado, perimetro;
    do{
        //este es todo el programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area y perimetro de un cuadrado ");
        System.out.println("2.- Calcular el area y perimetro de un triangulo ");
        System.out.println("3.- Calcular el area y perimetro de un circulo ");
        System.out.println("4.- Calcular el area y perimetro de un rectangulo ");
        System.out.println("5.- Calcular el area y perimetro de un pentagono ");
        System.out.println("6.- Salir ");

        //aquí ponemos las opcines

        opcion = entrada.nextInt();

        //segun

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;

                perimetro = base*4;
                System.out.println("El area del cuadrado es de: "+resultado);
                System.out.println("El perimetro del cuadrado es de: "+perimetro);
                
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura)/2;

                perimetro = base*3;
                System.out.println("El area del triangulo es de: "+resultado);

                System.out.println("El perimetro del triangulo es de: "+perimetro);
                
                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;

                perimetro = 2*base*3.1416;
                System.out.println("El area del circulo es de: "+resultado);

                System.out.println("El perimetro del circulo es de: "+perimetro);
                
                break;

            case 4: 
            System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura);

                perimetro = (base*2)+(altura*2);
                System.out.println("El area del rectangulo es de: "+resultado);

                System.out.println("El perimetro del rectangulo es de: "+perimetro);

            case 5:
            System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor del apotema");
                altura = entrada.nextInt();

                perimetro = base*5;

                resultado = (perimetro*altura)/2;
                System.out.println("El area del pentagono es de: "+resultado);

                System.out.println("El perimetro del pentagono es de: "+perimetro);
            default:
                System.out.println("Gracias.");
        

            
                
                
        }

        System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
    
    }while(letra == 's');
        
       
    }
}