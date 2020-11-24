import javax.swing.JOptionPane;

public class Libreria extends Registro{

    int prestados=0;

    public int prestar(){

        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que libro deseas tomar prestado."));

        JOptionPane.showMessageDialog(null,"Escogiste el libro " + titulo[opcion-1]);

        prestados = ejemplares[opcion-1] - 1;

        if(ejemplares[opcion-1]>0){
            JOptionPane.showMessageDialog(null,"Hay " + prestados + " disponibles.");
        }else{
            JOptionPane.showMessageDialog(null,"No puedes pedir prestados mas libros, ya no hay :(");
        }
        return prestados;
    }

    public int regresar(){


        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que libro deseas regresar."));

        prestados = ejemplares[opcion-1] + 1;

        JOptionPane.showMessageDialog(null,"Hay " + prestados + " disponibles del libro " + titulo[opcion-1]);

        return prestados;

    }
}