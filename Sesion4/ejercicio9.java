import java.util.Scanner;
    class ejercicio9{
        public void ejercicio9(){

            Scanner entrada = new Scanner(System.in);

            int lado, m, n;
            char letra;

            System.out.println("Bienvenido al ejercicio 9.");

            do{

            System.out.println("Digite uno de los lados del cuadrado.");

            lado = entrada.nextInt();

            if(lado>0 && lado<20){
                for(n = 0;n<lado;n=n+1){
                      for(m = 0;m<lado;m=m+1){ 
                         System.out.print("*");  
                    }
                     System.out.println("");
                }
                }else{
                    System.out.println("Por favor, ingrese un numero entre 1 y 20.");
                }  
                System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
                System.out.println("Si desea regresar al menu presione n.");

            letra = entrada.next().charAt(0);
            }while(letra == 's');        
        }
    }