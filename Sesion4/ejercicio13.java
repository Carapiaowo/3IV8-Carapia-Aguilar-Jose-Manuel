import javax.swing.JOptionPane;
    class ejercicio13{
        public void ejercicio13(){
        double n1, n2, suma, resta, division, multiplicacion;
        char letra, operacion;
        JOptionPane.showMessageDialog(null, "Bienvenido al ejercicio 13.");


            do{
                n1=Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero de la operacion."));
                n2=Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero de la operacion."));

                operacion = JOptionPane.showInputDialog("Escriba que operacion desea realizar.").charAt(0);

                    switch(operacion){
                        case 's':
                            suma=n1+n2;
                            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma +".");
                        break;
                        case 'r':
                            resta=n1-n2;
                            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta +".");
                        break;
                        case 'd':
                            division=(n1)/(n2);
                            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + division +".");
                        break;
                        case 'm':
                            multiplicacion=n1*n2;
                            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicacion +".");
                        break;
                        default:
                    }
                letra = JOptionPane.showInputDialog("Si desea repetir el proceso, por favor presione la tecla y. Si desea regresar ak menu, presione n.").charAt(0);
            }while(letra == 'y');
        }
    }