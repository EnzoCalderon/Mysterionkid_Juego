package mysterionkid;

import java.sql.*;
import javax.swing.JOptionPane;

public class PreguntasC extends javax.swing.JFrame {  //preguntasC= creacion de preguntas

  Personalizacion ClaseP=new Personalizacion();
 
  String EsteNombre;
  String OpcionCorrecta;
  int Identificador2=0;
   
    public PreguntasC() 
    {
        initComponents();
        buttonGroup1.add(Boton1);
        buttonGroup1.add(Boton2);
        buttonGroup1.add(Boton3);
        buttonGroup1.add(Boton4);

    }

    String Eleccion()
    {
        if(Boton1.isSelected()==true)
        {
        OpcionCorrecta="Opcion1";
        }
        if(Boton2.isSelected()==true)
        {
        OpcionCorrecta="Opcion2";
        }
        if(Boton3.isSelected()==true)
        {
        OpcionCorrecta="Opcion3";
        }
        if(Boton4.isSelected()==true)
        {
        OpcionCorrecta="Opcion4";
        }
        return OpcionCorrecta;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NuevaP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Preguntas = new javax.swing.JTextField();
        Boton1 = new javax.swing.JRadioButton();
        Boton2 = new javax.swing.JRadioButton();
        Boton3 = new javax.swing.JRadioButton();
        Boton4 = new javax.swing.JRadioButton();
        Respuesta2 = new javax.swing.JTextField();
        Respuesta3 = new javax.swing.JTextField();
        Respuesta4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Respuesta1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese Pregunta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 40, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese respuestas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 92, -1, -1));

        Preguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreguntasActionPerformed(evt);
            }
        });
        getContentPane().add(Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 61, 184, -1));

        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 116, 20, -1));

        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 145, -1, -1));

        Boton3.setText(" ");
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 176, 21, -1));
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 208, -1, -1));

        Respuesta2.setText(" ");
        getContentPane().add(Respuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 153, -1));

        Respuesta3.setText(" ");
        getContentPane().add(Respuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 177, 153, -1));

        Respuesta4.setText(" ");
        getContentPane().add(Respuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 208, 153, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 21, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 244, -1, -1));

        jButton3.setText("Terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 273, -1, -1));

        jButton4.setText("Volver al menú principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 302, -1, -1));

        Respuesta1.setText(" ");
        Respuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Respuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 153, -1));

        jButton5.setText("Ingresar Nueva Pregunta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    
        
        try {

                    Connection con=DriverManager.getConnection("jdbc:ucanaccess:"  
                    + "//C:/Users/enzodsdsad/Desktop/ProyectoPoo/"
                    + "MysterionKid/Base.accdb");
               
                    Statement s = con.createStatement();
                       
      
                    System.out.println(EsteNombre);
                    this.Eleccion();
                    String sql = "insert into preguntas(Preguntas,Respuesta1,"
                        + "Respuesta2,Respuesta3,Respuesta4,NombrePartida)values"+""
                        + "('"+ this.Preguntas.getText()+"', '"
                        + this.Respuesta1.getText()+"' ,"
                        + " '"+ this.Respuesta2.getText()+"' , '"
                        + this.Respuesta3.getText()+"' , '"
                        +this.Respuesta4.getText()+"' , '"         
                        +EsteNombre+"')";  
                
              
                        System.out.println(EsteNombre);
                       
                    s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(rootPane,"Datos Guardados");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error en "+e);
            
        }
        

            Menu obj=new Menu();
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
      
        
        try {

                    Connection con=DriverManager.getConnection("jdbc:ucanaccess:"  
                    + "//C:/Users/enzodsdsad/Desktop/ProyectoPoo/"
                    + "MysterionKid/Base.accdb");
               
                    Statement s = con.createStatement();
                       
      
                    System.out.println(EsteNombre);
                   
                    String sql = "insert into preguntas(Preguntas,Respuesta1,"
                        + "Respuesta2,Respuesta3,Respuesta4,NombrePartida)values"+""
                        + "('"+ this.Preguntas.getText()+"', '"
                        + this.Respuesta1.getText()+"' ,"
                        + " '"+ this.Respuesta2.getText()+"' , '"
                        + this.Respuesta3.getText()+"' , '"
                        +this.Respuesta4.getText()+"' , '" 
                        +EsteNombre+"')";  
                
              
                        System.out.println(EsteNombre);
                
                    s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(rootPane,"Datos Guardados");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error en "+e);
            
        }
        
        Menu obj=new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Personalizacion obj=new Personalizacion();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            
      
        
        try {

                    Connection con=DriverManager.getConnection("jdbc:ucanaccess:"  
                    + "//C:/Users/enzodsdsad/Desktop/ProyectoPoo/"
                    + "MysterionKid/Base.accdb");
               
                    Statement s = con.createStatement();
                    Identificador2++;
                    System.out.println(EsteNombre);
                    Eleccion();
                    String sql = "insert into preguntas(Preguntas,Respuesta1,"
                        + "Respuesta2,Respuesta3,Respuesta4,OpcionC,Id2,NombrePartida)values"+""
                        + "('"+ this.Preguntas.getText()+"', '"
                        + this.Respuesta1.getText()+"' ,"
                        + " '"+ this.Respuesta2.getText()+"' , '"
                        + this.Respuesta3.getText()+"' , '"
                        +this.Respuesta4.getText()+"' , '" 
                        +OpcionCorrecta+"' , '"
                        +Identificador2+"' , '" 
                        +EsteNombre+"')";  
                
              
                        System.out.println(EsteNombre);
                        System.out.println(Identificador2);
                    s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(rootPane,"Datos Guardados");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error en "+e);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreguntasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PreguntasActionPerformed

    private void Respuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Respuesta1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            Preguntas.setText("");
            Respuesta1.setText("");
            Respuesta2.setText("");
            Respuesta3.setText("");
            Respuesta4.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PreguntasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreguntasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreguntasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreguntasC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreguntasC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Boton1;
    private javax.swing.JRadioButton Boton2;
    private javax.swing.JRadioButton Boton3;
    private javax.swing.JRadioButton Boton4;
    private javax.swing.JLabel NuevaP;
    private javax.swing.JTextField Preguntas;
    private javax.swing.JTextField Respuesta1;
    private javax.swing.JTextField Respuesta2;
    private javax.swing.JTextField Respuesta3;
    private javax.swing.JTextField Respuesta4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
