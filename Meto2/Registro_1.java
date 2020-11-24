import javax.swing.JOptionPane;

public class Registro_1{

    private int x;
    
    public int getX(){

        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros distintos que tiene."));

    return x;        
    }

    public void setX(){
        this.x = x;
    }

    public int arrax(){

        boolean correcto = false;

        while(correcto==false){
            try{

                getX();

                if(x>0 && x<10){
  
                    correcto=true;

                }else{

                    JOptionPane.showMessageDialog(null, "La cantidad no puede ser menor que cero ni mayor a diez.");

                }
                

            }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null,"Solo se aceptan valores numericos.");

            }
        }

        return x;

    }


}