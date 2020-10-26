//crear archivo que pueda obtener un texto como entrada de datos

class EntradaTexto{
    //cuerpo principal del programa
    public static void main(String[] args){
        //primero variables
        String nombre;
        System.out.println("Por favor, dime tu nombre: ");
        //println significa imprime con salto de línea
        //queremos obtener el nombre de la entrada estándar de la computadora
        //¿Quién es la entrada estándar?
        // La terminal.

        //Forma de obtener un texto.
        nombre = System.console().readLine();

        //Sistema, lee la línea de la consola
        //Console es un elemento reservado, pues va a detectar todo lo que hay en la terminal
        //readline es una acción reservada 
        System.out.println("Hola, " +nombre+ ", bienvenido a tu segundo programa.");
    }
}