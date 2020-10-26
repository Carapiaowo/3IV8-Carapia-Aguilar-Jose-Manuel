import java.util.Scanner;

class ejercicio6{
    public void ejercicio6(){

        /* variables: A area y perimetro rectangulo; B perimetro y area de un triangulo;  
            C volumen esfera y cilindro
        */
        Scanner entrada = new Scanner(System.in);

        int opcion;
        double  base, altura, radio, area, perimetro;
        char letra;

        System.out.println("Bienvenido al ejercicio 6.");

        do{

        System.out.println("Seleccione la opcion que requiera.");
        System.out.println("1: Area y perimetro de un rectangulo.");
        System.out.println("2: Area y perimetro de un triangulo.");
        System.out.println("3: Volumen de una esfera.");
        System.out.println("4: Volumen de un cilindro.");

        opcion = entrada.nextInt();

        switch(opcion){
            
            case 1:
            System.out.println("Por favor, ingrese la altura del rectangulo.");
            altura = entrada.nextDouble();

            System.out.println("Por favor, ingrese la base del rectangulo.");
            base = entrada.nextDouble();

            perimetro = (base*2)+(altura*2);
            area = base * altura;
            System.out.println("El perimetro del rectangulo es: " + perimetro);
            System.out.println("El area del rectangulo es: " + area);

            break;

            case 2:
            System.out.println("Por favor, ingrese la altura del triangulo.");
            altura = entrada.nextDouble();

            System.out.println("Por favor, ingrese la base del triangulo.");
            base = entrada.nextDouble();

            perimetro = (base*3);
            area = (base * altura)/2;
            System.out.println("El perimetro del triangulo es: " + perimetro);
            System.out.println("El area del triangulo es: " + area);

            break;

            case 3:
            System.out.println("Por favor, ingrese el radio de la esfera.");
            base = entrada.nextDouble();

            area = ((base*base*base*4)/3)*3.1415926;
            
            System.out.println("El volumen de la esfera es: " + area);

            break;

            case 4:
            System.out.println("Por favor, ingrese el radio del cilindro.");
            base = entrada.nextDouble();

            System.out.println("Por favor, ingrese la altura del cilindro.");
            altura = entrada.nextDouble();

            area = 3.1415926*base*base*altura;

            System.out.println("El volumen del cilindro es: " + area);

            default: 

            System.out.println("Gracias por participar.");

            }
            System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
            System.out.println("Si desea regresar al menu presione n.");

            letra = entrada.next().charAt(0);
        }while(letra == 's');   
    }
}
   