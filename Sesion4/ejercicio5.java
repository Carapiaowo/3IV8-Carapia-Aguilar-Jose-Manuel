import java.util.Scanner;
    class ejercicio5{
        public void ejercicio5(){

            int cf, cant;
            int c1=0;
            int c2=0;
            int c3=0;
            int c4=0;
            int c5=0;
            char produc, repeat;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Bienvenido al ejercicio 5.");
            System.out.println("Los productos que le ofrecemos son:");
            System.out.println("Frituras: $12");
            System.out.println("Refresco: $15");
            System.out.println("Chocolate: $5");
            System.out.println("Agua: $10");
            System.out.println("Galletas: $17");

        do{    
            do{

                System.out.println("Digite el total de cantidades que desea ingresar, no puede pasar de 5.");
                cant = entrada.nextInt();

            switch(cant){
                case 1:
                System.out.println("Digite cuantas frituras quiere.");
                c1 = entrada.nextInt();
                break;
                case 2:
                System.out.println("Digite cuantas frituras quiere");
                c1 = entrada.nextInt();
                System.out.println("Digite cuantos refrescos quiere.");
                c2 = entrada.nextInt();
                break;
                case 3:
                System.out.println("Digite cuantas frituras quiere");
                c1 = entrada.nextInt();
                System.out.println("Digite cuantos refrescos quiere.");
                c2 = entrada.nextInt();
                System.out.println("Digite cuantos chocolates quiere.");
                c3 = entrada.nextInt();
                break;
                case 4:
                System.out.println("Digite cuantas frituras quiere");
                c1 = entrada.nextInt();
                System.out.println("Digite cuantos refrescos quiere.");
                c2 = entrada.nextInt();
                System.out.println("Digite cuantos chocolates quiere.");
                c3 = entrada.nextInt();
                System.out.println("Digite cuantas aguas quiere.");
                c4 = entrada.nextInt();
                break;
                case 5:
                System.out.println("Digite cuantas frituras quiere");
                c1 = entrada.nextInt();
                System.out.println("Digite cuantos refrescos quiere.");
                c2 = entrada.nextInt();
                System.out.println("Digite cuantos chocolates quiere.");
                c3 = entrada.nextInt();
                System.out.println("Digite cuantas aguas quiere.");
                c4 = entrada.nextInt();
                System.out.println("Digite cuantas galletas quiere.");
                c5 = entrada.nextInt();

                break;
                default:
                System.out.println("Gracias por utilizar el software..");


                
            }
            cf = ((c1*12)+(c2*15)+(c3*5)+(c4*10)+(c5*17));
            System.out.println("Si desea agregar algo mas presione s");

                produc = entrada.next().charAt(0);
            }while(produc=='s');
            

    System.out.println("El total de su compra es de: $" + cf);  

    System.out.println("Si desea reiniciar la cuenta, presione y");
    System.out.println("Si desea regresar al menu presione n.");

            repeat = entrada.next().charAt(0);

        }while(repeat=='y');
    }  
}