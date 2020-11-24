import javax.swing.JOptionPane;

public class Registro{

    Registro_1 obj1 = new Registro_1();
    
    protected int x = obj1.arrax();
    protected int[] ejemplares = new int[x];
    private int[] prestamos = new int[x];
    private int totales;
    protected String[] titulo = new String[x];
    private String[] autor = new String[x];
   
    

    public int[] getEjemplares(){
        for(int i=0; i<x;i++){

            ejemplares[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de ejemplares del libro " + titulo[i] + "."));
      
        }

        return ejemplares;
    }
    public void setEjemplares(int[] ejemplares){

        this.ejemplares = ejemplares;

    } 
    public int[] ejemplares_exc(){

        int i=0;

        boolean correcto = false;
        
        while(correcto==false){
        
        try{

            getEjemplares();

            correcto = true;

        }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos.");
            }
        }
        return ejemplares;
    }


    public int[] getPrestamos(){

        for(int i=0; i<x; i++){

            prestamos[i] = Integer.parseInt(JOptionPane.showInputDialog("xD"));

        }

        return prestamos;
    }
    public void setPrestamos(int[] prestamos){

        this.prestamos = prestamos;
    } 



    public int getTotales(){


        return totales;
    }
    public void setTotales(){

        this.totales = totales;
    } 



    public String[] getTitulo(){

        for(int i=0; i<x; i++){

            titulo[i]  = JOptionPane.showInputDialog("Ingrese el nombre del libro numero " + (i+1) + ".");

        }

        return titulo;
    }
    public void setTitulo(){
        this.titulo = titulo;
    } 


    public String[] getAutor(){

        for(int i=0; i<x; i++){

            autor[i]  = JOptionPane.showInputDialog("Ingrese el nombre del autor del libro " + titulo[i] + ".");

        }

        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    } 


}