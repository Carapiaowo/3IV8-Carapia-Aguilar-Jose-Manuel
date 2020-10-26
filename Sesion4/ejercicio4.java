import java.util.Scanner;

class ejercicio4{

    public void ejercicio4(){
        
        Scanner entrada = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int total = 0;
        int totalnum;
        char letra;

        System.out.println("Bienvenido al ejercicio 4.");

        do{

        System.out.println("Inserte la cantidad de numeros que quiere digitar.");

        total = entrada.nextInt();

        do{
            System.out.println("Digite el numero");

            totalnum = entrada.nextInt();

            if(totalnum == 0){
                positivos = positivos+0;
            } else { 
                if(totalnum>0){
                        positivos = positivos +1;
                }else{
                    negativos = negativos+1;
                }

            }

            total = total-1;

            }while (total!=0);

            System.out.println("El total de positivos es: " + positivos);
            
            System.out.println("El total de negativos es: " + negativos);

            System.out.println("Si desea repetir el proceso, por favor presione la tecla s");
            System.out.println("Si desea regresar al menu presione n.");

            letra = entrada.next().charAt(0);

        }while(letra == 's');   
    }
}