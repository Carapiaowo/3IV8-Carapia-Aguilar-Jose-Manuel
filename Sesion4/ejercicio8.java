import java.util.Scanner;
    class ejercicio8{
        public void ejercicio8(){

            int n, f; 
            char letra;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Bienvenido al ejercicio 8.");
            
            do{
            
            System.out.println("Escriba un numero para conocer su factorial y despues presione 1 para confirmar.");

            n = entrada.nextInt();
            f = entrada.nextInt();

            if(n>0 && f==1){

            do{
                f=f*n;
                    n=n-1;
            }while(n!=0);

            System.out.println("El valor factorial del numero es " + f + ".");
        }else{
            System.out.println("Introduzca un valor positivo y despues un 1.");
        }
        System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
        System.out.println("Si desea regresar al menu presione n.");

            letra = entrada.next().charAt(0);

            }while(letra == 's');   
        }
    }