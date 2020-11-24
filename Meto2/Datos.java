import javax.swing.JOptionPane;

public class Datos{
    private String cliente;
    private String[] productos = new String[10];
    private int[] precios = new int[10];
    private int[] disponibilidad = new int[10];
    
    
    public void ingresarDatos_prod(){
        for(int i=0; i<10; i++){
        productos[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto numero " + (i+1) + ".");
        }
    }

    public int[] ingresarDatos_prc_exc(){

        int i=0;

        boolean correcto = false;
        
        while(correcto==false){
        
        try{
            for(i=0; i<10; i++){

                precios[i] = Integer.parseInt(JOptionPane.showInputDialog("Precio del producto  " + (i+1) + "."));
    
            
            if(precios[i]>0){
                correcto = true;
            }else{
                JOptionPane.showMessageDialog(null,"Los valores no pueden ser menores de 0.");
            }
        }
    
        }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos.");
            }
        }
        return precios;
    }

    public int[] ingresarDatos_disp_exc(){

        int i=0;

        boolean correcto = false;
        
        while(correcto==false){
        
        try{
            for(i=0; i<10; i++){

                disponibilidad[i] = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del producto  " + (i+1) + "."));
    
            
            if(disponibilidad[i]>0){
                correcto = true;
            }else{
                JOptionPane.showMessageDialog(null,"Los valores no pueden ser menores de 0.");
            }
        }
    
        }catch(NumberFormatException e){

                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos.");
            }
        }
        return disponibilidad;
    }

    public void ingresarDatos_1(){
        cliente = JOptionPane.showInputDialog(null,"Ingrese su nombre.");
        
        ingresarDatos_prc_exc();
        ingresarDatos_disp_exc();
        ingresarDatos_prod();
        
    }

    public void caro_barato(){

        int mayor;
        int menor;

        menor = mayor = precios[0];

        for(int i=0; i<10; i++){
            if(precios[i]>mayor){
                mayor = precios[i];

            }else if(precios[i]<menor)
            menor = precios[i]; 
        }

        System.out.println("El producto mas caro cuesta: $" + mayor);
        System.out.println("El producto mas barato cuesta: $" + menor);
         
    }

    public void suma_total(){

        int suma_total=0;


        for(int i=0; i<10; i++){

            suma_total += (precios[i]*disponibilidad[i]);
        }

        System.out.println("La suma total de los productos es: $" + suma_total);
        
    }
    
    public void precio_promedio(){

        int suma=0;
        int promedio=0;


        for(int i=0; i<10; i++){

            suma += (precios[i]);
        }

        promedio= (suma/10);

        System.out.println("El promedio costo promedio de los productos es: $" + promedio);
    }

    public void suma_total_producto(){

        int[] suma_productos = new int[10];

        for(int i=0; i<10; i++){

            suma_productos[i] = precios[i] * disponibilidad[i];

            System.out.println("El costo total de todos los " + productos[i] + "s es de $" + suma_productos[i]);
        
        }
    }

    public void mostrarDatos_1(){

            System.out.println("Hola " + cliente);
    
            for(int i=0; i<10; i++){
    
                System.out.print("De " + productos[i] + " que cuesta $" + precios[i] + " hay " + disponibilidad[i] + " unidad(es) disponible(s).\n");
                
            }
        caro_barato();
        suma_total();
        precio_promedio();
        suma_total_producto();
    }
}