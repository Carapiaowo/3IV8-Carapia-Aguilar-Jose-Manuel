package gato;

import javax.swing.JOptionPane;

/*
 * @author Jose Manuel
 */
public class Juego extends javax.swing.JFrame{

    Tablero obj3 = new Tablero();
    Usuarios uss = new Usuarios();   
    protected String Jugador1;
    protected boolean existe;
   
    public Juego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton2.setText("0, 1");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton1.setText("0, 0");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setText("0, 2");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton6.setText("1, 2");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton5.setText("1, 1");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton4.setText("1, 0");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton9.setText("2, 2");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton8.setText("2, 1");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton7.setText("2, 0");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/gato.png"))); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/menu.png"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/salir.png"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/reiniciar.png"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializarIconos();
        
        seleccion();
        
        obj3.llenarTablero();
    }//GEN-LAST:event_formWindowOpened

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        Menu obj = new Menu();

        obj.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        obj3.columna = 0;
        obj3.fila = 2;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Oder.png")));

        }else if (obj3.turno == 'O'){

            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Xder.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        obj3.columna = 1;
        obj3.fila = 2;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Oder.png")));

        }else if (obj3.turno == 'O'){

            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Xder.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        obj3.columna = 2;
        obj3.fila = 2;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Oxd.png")));

        }else if (obj3.turno == 'O'){

            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Xxd.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        obj3.columna = 0;
        obj3.fila = 1;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/O.png")));

        }else if (obj3.turno == 'O'){

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/X.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        obj3.columna = 1;
        obj3.fila = 1;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/O.png")));

        }else if (obj3.turno == 'O'){

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/X.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        obj3.columna = 2;
        obj3.fila = 1;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Oabj.png")));

        }else if (obj3.turno == 'O'){

            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Xabj.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        obj3.columna = 2;
        obj3.fila = 0;

        obj3.jugadaSerVivo();
        
        if(obj3.turno == 'X'){

            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Oabj.png")));

        }else if (obj3.turno == 'O'){

            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/Xabj.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //Llamamos el método
        obj3.columna = 0;
        obj3.fila = 0;

        obj3.jugadaSerVivo();

        if(obj3.turno == 'X'){

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/O.png")));

        }else if (obj3.turno == 'O'){

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/X.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        obj3.columna = 1;
        obj3.fila = 0;

        obj3.jugadaSerVivo();
        
        if(obj3.turno == 'X'){

            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/O.png")));

        }else if (obj3.turno == 'O'){

            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/X.png")));

        }
        obj3.comprobarGanadorX();
        obj3.comprobarGanadorO();
        iconos();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        inicializarIconos();
        
        seleccion();
        
        obj3.llenarTablero();
    }//GEN-LAST:event_jButton12MouseClicked

    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });

    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    protected javax.swing.JButton jButton2;
    protected javax.swing.JButton jButton3;
    protected javax.swing.JButton jButton4;
    protected javax.swing.JButton jButton5;
    protected javax.swing.JButton jButton6;
    protected javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
   
    
    public void inicializarIconos(){
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/null.png")));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/null.png")));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/nullabj.png")));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/null.png")));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/null.png")));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/nullabj.png")));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/nullder.png")));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/nullder.png")));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/imagenes/nullxd.png")));
    }
    
    public void seleccion(){
        
        int seleccion = JOptionPane.showOptionDialog( null,"¿Con qué quiere jugar el primer jugador?",
        "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
        new Object[]{ "X", "O"},"opcion 1");
     
        if (seleccion == 0){
           obj3.turno = 'X';
           Jugador1="X";
        }else if(seleccion == 1){
            obj3.turno = 'O';
            Jugador1="O";
        }else{
            seleccion();
        }
    }
    
    public void iconos(){
        
        if(obj3.ganador == 1){
            inicializarIconos();
            obj3.ganador = 0;
        }else if(obj3.ganador == 0){
            
        }else if(obj3.ganador==2){
            dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
        }
    }
}

