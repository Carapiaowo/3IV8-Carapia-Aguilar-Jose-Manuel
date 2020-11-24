import javax.swing.JOptionPane;

public class Desglose extends Libreria{

    public void ejecucion(){
        int op;
        char letra;

        getTitulo();
        getAutor();
        ejemplares_exc();

        do{

        op = Integer.parseInt(JOptionPane.showInputDialog("1.-Tomar libros prestados. \n2.-Regresar libros.\n3.-Salir."));

            switch(op){
            case 1:
            prestar();
            break;
            case 2:
            regresar();
            break;
            }

        letra = JOptionPane.showInputDialog("Para repetir el programa presiona s.").charAt(0);

        }while(letra=='s');
    }
}