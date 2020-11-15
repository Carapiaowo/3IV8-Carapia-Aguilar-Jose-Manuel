import javax.swing.JOptionPane;
public class ejercicio1{

    private int a, m, d, af, mf, df;
    char opcion;
    /*Métodos bonitos para la entrada de datos, el cálculo y la salida de datos.
     */
        public void menu(){
            ejercicio1 obj1 = new ejercicio1();
            do{
                obj1.entrada();
                obj1.calculo();
                obj1.salida(obj1.a, obj1.m, obj1.d);
                obj1.opcion = JOptionPane.showInputDialog("Para repetir presiona s. Para salir presiona n.").charAt(0);
                }while(obj1.opcion == 's');
        }
        public void entrada(){
            JOptionPane.showMessageDialog(null, "Ingresa qu\u00e9 d\u00eda es hoy.");
            af = Integer.parseInt(JOptionPane.showInputDialog("A\u00f1o: "));
            mf= Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
            df= Integer.parseInt(JOptionPane.showInputDialog("D\u00eda: "));

            JOptionPane.showMessageDialog(null, "Ingresa tu fecha de nacimiento por favor.");
            a = Integer.parseInt(JOptionPane.showInputDialog("A\u00f1o: "));
            m = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
            d = Integer.parseInt(JOptionPane.showInputDialog("D\u00eda: "));

        }

        public void calculo(){

            a = (af-a);
            m = (mf-m);

                if(d<df){

                    d = (df-d);

                }else{
                    d = 1;
                }
           
        }

        public void salida(int a, int m, int d){

            JOptionPane.showMessageDialog(null, "Tu edad es de: " + a + " a\u00f1os, " + m + " mes(es) y " + d + " d\u00eda(s).");

        }
}