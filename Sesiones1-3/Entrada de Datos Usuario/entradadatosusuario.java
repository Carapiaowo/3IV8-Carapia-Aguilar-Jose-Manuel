/*
Holi jiji, la entrada de datos se puede recibir a partir de readLine()
que su método es de la consolo o de la entrada estándar 
*/

import java.util.*; /*se llama a lo que se ocupa nada más

*/

class entradadatosusuario{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        // Variables
        String nombre;
        int edad; 
        float altura = f;
        

        System.out.println("Escribe tu nombre: "); 
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad: "); 
        edad = entrada.nextInt();
        System.out.println("Escribe tu estatura: "); 
        altura = entrada.nextFloat();

        System.out.println("Tu nombre es: " + nombre); 
        System.out.println("Tu edad es: " + edad); 
        System.out.println("Tu altura es: " + altura); 

    }
}