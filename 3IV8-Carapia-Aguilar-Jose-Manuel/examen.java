import java.util.Scanner;
class examen{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        //pikachu es squirtle porque me equivoqué xd
        /* pikachu agua
        charmander fuego
        bulbasaur planta
        */

        int vida, ataque, defensa;
        int vidap = 50;
        int vidac = 60;
        int vidab = 40;
        int ataquep = 20;
        int ataquec = 10;
        int ataqueb = 30;
        int pelea;
        char pokemon, pokepe, menu;

        System.out.println("Pokedex 3IV8");
        System.out.println("Bienvenido a la edicion remasterizada de la pokedex.");
        System.out.println("Creada por Carapia Aguilar Jose Manuel");
        System.out.println("Para iniciar presiona s.");
        menu = entrada.next().charAt(0);


    do{
        System.out.println("Para consultar los datos de cada pokemon digite su respectivo numero, si desea pelear, digite 4.");
        System.out.println("1.- Charmander");
        System.out.println("2.- Pikachu");
        System.out.println("3.- Bulbasaur");
        System.out.println("4.- Batalla");


        pelea = entrada.nextInt();

switch(pelea){

    case 1:
    System.out.println("La vida de Charmander es " + vidac + " puntos.");
    System.out.println("El ataque principal y secundario de charmander son " + ataquec + " puntos y "+ ataquec/2 + " puntos.");
    System.out.println("Para regresar al menu presione s.");
    menu = entrada.next().charAt(0);
    break;
    case 2:
    System.out.println("La vida de Pikachu es " + vidac + " puntos.");
    System.out.println("El ataque principal y secundario de pikachu son " + ataqueb + " puntos y "+ ataqueb/2 + " puntos.");
    System.out.println("Para regresar al menu presione s.");
    menu = entrada.next().charAt(0);
    break;
    case 3:
    System.out.println("La vida de Bulbasaur es " + vidac + " puntos.");
    System.out.println("El ataque principal y secundario de pikachu son " + ataquep + " puntos y "+ ataquep/2 + " puntos.");
    System.out.println("Para regresar al menu presione s.");
    menu = entrada.next().charAt(0);
    break;
case 4:
        System.out.println("Escribe el nombre del pokemon con el que quieras pelear.");
        System.out.println("Charmander con vida de " + vidac + " puntos.");
        System.out.println("Bulbasaur con vida de " + vidab + " puntos.");
        System.out.println("Pikachu con vida de " + vidap + " puntos.");

        do{

        pokemon = entrada.next().charAt(0);

        if(pokemon=='C'){

            System.out.println("Has escogido a charmander");

        }else if(pokemon == 'B'){
        System.out.println("Has escogido a Bulbasaur");

        System.out.println("");

        }else if(pokemon == 'P'){
            System.out.println("Has escogido a Pikachu");
        }else{

            System.out.println("Por favor, escribe correctamente el nombre del pokemon que quieras escoger.");
        }
    }while(pokemon != 'P' && pokemon != 'B' && pokemon != 'C');


        if(pokemon =='C'){

        System.out.println("Escoge contra que pokemon quieres pelear.");

        System.out.println("Bulbasaur con vida de " + vidab + " puntos.");

        System.out.println("Pikachu con vida de " + vidap + " puntos.");

        pokepe = entrada.next().charAt(0);

            if(pokepe == 'B'){
                System.out.println("Has escogido pelear contra bulbasaur");

                vidac = vidac - (ataqueb*2);
                vidab = vidab - (ataquec*2);

                if (vidac <= 0){
                    System.out.println("Charmander cansado");
                    } else if (vidab <= 0){
                    System.out.println("Bulbasaur cansado");
                    }
                    

                System.out.println("Si quieres pelear de nuevo presiona s.");

                menu = entrada.next().charAt(0);

            }else if (pokepe == 'P'){
                System.out.println("Has escogido pelear contra pikachu");

                vidac = vidac - (ataquep*2);
                vidap = vidap - (ataquec*2);
                if (vidac <= 0){
                    System.out.println("Charmander cansado");
                    } else if (vidap <= 0){
                    System.out.println("Bulbasaur cansado");
                    }

                System.out.println("Si quieres pelear de nuevo presiona s.");

                menu = entrada.next().charAt(0);
                
            }
        
    }
        if(pokemon =='B'){

            System.out.println("Escoge contra que pokemon quieres pelear.");
    
            System.out.println("Charmander con vida de " + vidac + " puntos.");
    
            System.out.println("Pikachu con vida de " + vidap + " puntos.");
    
            pokepe = entrada.next().charAt(0);
    
                if(pokepe == 'C'){
                    System.out.println("Has escogido pelear contra charmander");

                    vidab = vidab - (ataquec*2);
                    vidac = vidac - (ataqueb*2);
                    if (vidac <= 0){
                        System.out.println("Charmander cansado");
                        } else if (vidab <= 0){
                        System.out.println("Bulbasaur cansado");
                        }
                System.out.println("Si quieres pelear de nuevo presiona s.");

                menu = entrada.next().charAt(0);
    
                }else if (pokepe == 'P'){
                    System.out.println("Has escogido pelear contra pikachu");
                    
                    vidab = vidab - (ataquep*2);
                    vidap = vidap - (ataqueb*2);
                    if (vidap <= 0){
                        System.out.println("Pikachu cansado");
                        } else if (vidab <= 0){
                        System.out.println("Bulbasaur cansado");
                        }

                System.out.println("Si quieres pelear de nuevo presiona s.");

                menu = entrada.next().charAt(0);
                    
                }
            }
            if(pokemon =='P'){

                System.out.println("Escoge contra que pokemon quieres pelear.");
        
                System.out.println("Bulbasaur con vida de " + vidab + " puntos.");
        
                System.out.println("Charmander con vida de " + vidac + " puntos.");
        
                pokepe = entrada.next().charAt(0);
        
                    if(pokepe == 'B'){
                        System.out.println("Has escogido pelear contra bulbasaur");

                        vidap = vidap - (ataqueb*2);
                        vidab = vidab - (ataquep*2);
                        if (vidap <= 0){
                        System.out.println("Pikachu cansado");
                        } else if (vidab <= 0){
                        System.out.println("Bulbasaur cansado");
                        }

                        System.out.println("Si quieres pelear de nuevo presiona s.");
        
                        menu = entrada.next().charAt(0);

                    }else if (pokepe == 'C'){
                        System.out.println("Has escogido pelear contra charmander");

                        vidac = vidac - (ataquep*2);
                        vidap = vidap - (ataquec*2);
                        if (vidac <= 0){
                            System.out.println("Charmander cansado");
                            } else if (vidab <= 0){
                            System.out.println("Bulbasaur cansado");
                            }

                    System.out.println("Si quieres pelear de nuevo presiona s.");

                menu = entrada.next().charAt(0);
                        
                    }
                }
                menu = entrada.next().charAt(0);
            break;
            default:
}
        } while(menu=='s');
    }
}