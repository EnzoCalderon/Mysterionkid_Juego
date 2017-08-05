package mysterionkid;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultButtonModel;
import javax.swing.JRadioButton;

public class Jugar extends javax.swing.JFrame {

    /**
     * Creates new form Jugar
     */
    
    Connection con2;
    Statement orden;
    ResultSet r;
    Conector hola =new Conector();
    JRadioButton rbtn1;
    DefaultButtonModel tm;
    ResultSet a;
    String esto="no";
    String NombreJuego;
    String NombrePartidaJugar;
    int IRespuestaUno=0;
    int IRespuestaDos=0;
    int IRespuestaTres=0;
    int IRespuestaCuatro=0;
    String holaps="primera partida";
   
    public Jugar() 
    {
        initComponents();
        Grupo.add(Boton1);
        Grupo.add(Boton2);
        Grupo.add(Boton3);
        Grupo.add(Boton4);
        
        con2= hola.conectarme();
        this.NombreOficial();   
        this.Pboton1();
        this.Pboton2();
        this.Pboton3();
        this.Pboton4();
    }
    
    
    
    private void Pboton1(){
   
        
        IRespuestaUno++;
        tm =new DefaultButtonModel();
        try {
            
            String dsa=null;
            
            orden=con2.createStatement();
            r=orden.executeQuery("Select Respuesta1 From Preguntas WHERE NombrePartida like '"+NombrePartidaJugar+"'and Id2="+IRespuestaUno+"");
            r.next();
            dsa =r.getString("Respuesta1");

            Boton1.setText(dsa);
        } catch (SQLException ex) {
            Logger.getLogger(Jugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        private void Pboton2(){
   
        
       
        tm =new DefaultButtonModel();
        try {
            IRespuestaDos++;
            String dsa=null;
            orden=con2.createStatement();
            r=orden.executeQuery("Select Respuesta2 From Preguntas WHERE NombrePartida like '"+NombrePartidaJugar+"'and Id2="+IRespuestaDos+"");


           // r=orden.executeQuery("Select Respuesta2 From Preguntas WHERE Id=24 LIMIT 1");
            r.next();
            
              dsa =r.getString("Respuesta2");

            Boton2.setText(dsa);
        } catch (SQLException ex) {
            Logger.getLogger(Jugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void Pboton3(){
   
        
        IRespuestaTres++;
        tm =new DefaultButtonModel();
        try {
            
            String dsa=null;
            
            orden=con2.createStatement();
            r=orden.executeQuery("Select Respuesta3 From Preguntas WHERE NombrePartida like '"+NombrePartidaJugar+"'and Id2="+IRespuestaTres+"");


           // r=orden.executeQuery("Select Respuesta3 From Preguntas WHERE Id=24 LIMIT 1");
            r.next();
            
              dsa =r.getString("Respuesta3");

            Boton3.setText(dsa);
        } catch (SQLException ex) {
            Logger.getLogger(Jugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void Pboton4(){
   
        
        IRespuestaCuatro++;
        tm =new DefaultButtonModel();
        try {
            
            String dsa=null;
            
            orden=con2.createStatement();
            r=orden.executeQuery("Select Respuesta4 From Preguntas WHERE NombrePartida like '"+NombrePartidaJugar+"'and Id2="+IRespuestaCuatro+"");


          //  r=orden.executeQuery("Select Respuesta4 From Preguntas WHERE Id=24 LIMIT 1");
            r.next();
            
              dsa =r.getString("Respuesta4");

            Boton4.setText(dsa);
        } catch (SQLException ex) {
            Logger.getLogger(Jugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

        public String NombreOficial()
        {
            Jugador olo=new Jugador();
            
    
            NombrePartidaJugar=olo.NombreVariable();
            
            return NombrePartidaJugar;
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        TituloPartida = new javax.swing.JLabel();
        Boton1 = new javax.swing.JRadioButton();
        Boton2 = new javax.swing.JRadioButton();
        Boton3 = new javax.swing.JRadioButton();
        Boton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloPartida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TituloPartida.setText("Pregunta");
        getContentPane().add(TituloPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, 105, -1));

        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 97, 180, 20));

        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 119, 180, -1));

        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 147, 180, -1));

        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 175, 180, -1));

        jButton1.setText("Volver a menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 273, -1, -1));

        jButton2.setText("Volver ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 28, -1, -1));

        jButton3.setText("Terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 244, 79, -1));

        jButton4.setText("Continuar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 208, -1, -1));

        jButton5.setText("Comodin");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 97, -1, -1));

        Siguiente.setText("Siguiente Pregunta");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             Jugador obj=new Jugador();
            obj.setVisible(true);        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu obj=new Menu();
        obj.setVisible(true);        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Ranking obj=new Ranking();
    obj.setVisible(true);// TODO add your handling code here:
    dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
                    this.Pboton1();
                    this.Pboton2();
                    this.Pboton3();
                    this.Pboton4();
    }//GEN-LAST:event_SiguienteActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Boton1;
    private javax.swing.JRadioButton Boton2;
    private javax.swing.JRadioButton Boton3;
    private javax.swing.JRadioButton Boton4;
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel TituloPartida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
