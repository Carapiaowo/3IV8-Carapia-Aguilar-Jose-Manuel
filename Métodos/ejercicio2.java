import javax.swing.JOptionPane;
    public class ejercicio2{

        double p, a, b, h;
        int opcion;
        char si;

        /*Este método es al que se llama desde el principal y es el menú
        que ve el usuario antes de escoger una figura.
        */
        public void elegir(){

        //Objeto para llamar los métodos.
            ejercicio2 obj2 = new ejercicio2();

         
                    do{
                        obj2.opcion = Integer.parseInt(JOptionPane.showInputDialog("Escribe la figura de la cual quieras conocer el perimetro y el area.\n1.-Circulo \n2.-Rectangulo \n3.-Cuadrado \n4.-Triangulo"));

                        //Switch para escoger qué onda.
                        switch(obj2.opcion){

                            case 1:
                            obj2.circulo();
                            break;
                            case 2:
                            obj2.rectangulo();
                            break;
                            case 3:
                            obj2.cuadrado();
                            break;
                            case 4:
                            obj2.triangulo();
                            break;

                        }
                        obj2.salida(obj2.p, obj2.a);
                        si = JOptionPane.showInputDialog("Para repetir el programa presiona s.").charAt(0);
                    }while(si =='s');
        }

        //Método para perímetro y área del círculo.
        public void circulo(){

            b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo."));

            a = 3.1416 * b * b;
            p = 2 * 3.1416 * b;

        }
        //Método para perímetro y área del rectángulo.
        public void rectangulo(){

            b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del rectangulo."));
            h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del rectangulo."));

            a = (b*h);
            p = (b*2)+(h*2);

        }
        //Método para perímetro y área del cuadrado.
        public void cuadrado(){

            b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del cuadrado."));

            a = b*b;
            p = b*4;


        }
        //Método para perímetro y área de un triángulo equilatero. (Porque era más fácil que pedir otro 2 lados).
        public void triangulo(){

            b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triangulo equilatero."));
            h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triangulo equilatero."));

            a = (b*h)/2;
            p = b*3;

        }
        //Este método muestra los valores del períemtro y área que el usuario haya escogido.
        public void salida(Double a, Double p){

            JOptionPane.showMessageDialog(null, "El perimetro es:\n " + a + " \ny el area:\n " + p + ".");

        }
    }
