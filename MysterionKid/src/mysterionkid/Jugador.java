package mysterionkid;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




//
//http://balusoft.net/2010/07/05/how-to-como-llenar-un-jcombobox-con-una-bd/
//https://www.youtube.com/watch?v=v8zKLCec-Tk
//


public class Jugador extends javax.swing.JFrame {

    public Jugador() 
    {
        initComponents();
        con2= hola.conectarme();
        NombrePartidas.removeAllItems();
        CargarComboBox();
    }

        
    
    Connection con2;
    Statement orden;
    ResultSet r;
    DefaultComboBoxModel tm;
    Conector hola =new Conector();
    String NombreDePartidas;
    Object categoria1=1;
    String NombreSeleccionado;
    
    
public ArrayList<NombrePartidaC> obtenerLista()
{
   
        try {
            String query ="Select NombrePartida2 From Preguntas";
            orden=con2.createStatement();
            r=orden.executeQuery(query);
            ArrayList<NombrePartidaC> info =new ArrayList<NombrePartidaC>();
            if(r.next()){
                do{
                    NombrePartidaC listaTemporal=new NombrePartidaC(r.getString(1));
                    info.add(listaTemporal);
                }while(r.next());
                return info;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
   

private void CargarComboBox()
{
    ArrayList<NombrePartidaC> lista =obtenerLista();
    for(int x=0;x<lista.size();x++)
    {
        NombrePartidaC obj=new NombrePartidaC(lista.get(x).getNombreDeLaPartida());
        NombrePartidas.addItem(obj);
    }

}
 



public String NombreVariable()

{
    Object z = NombrePartidas.getSelectedItem(); 
    NombreSeleccionado = String.valueOf(z);
    
return NombreSeleccionado;    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombrePartidas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Jugar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 238, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, -1, -1));

        Nombre.setText(" ");
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 70, 189, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese nombre del jugador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione partida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        NombrePartidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NombrePartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePartidasActionPerformed(evt);
            }
        });
        getContentPane().add(NombrePartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu obj=new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        this.NombreVariable();
        
        System.out.println(NombreSeleccionado);

        try {

                Connection con=DriverManager.getConnection("jdbc:ucanaccess:"   
                    + "//C:/Users/enzodsdsad/Desktop/ProyectoPoo/"
                    + "MysterionKid/Base.accdb");
                Statement s = con.createStatement();
                String sql = "insert into jugador(Nombre)values"+"('"+ this.Nombre.getText()+"')";  
                s.executeUpdate(sql);
            
            Jugar obj=new Jugar();   
            
            obj.NombrePartidaJugar=String.valueOf(NombreSeleccionado);    
            

               
                
                obj.setVisible(true);
                dispose();

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error en "+e);//ERROR EN EL CASO DE QUE NO FUNCIONE
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombrePartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePartidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePartidasActionPerformed

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
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox NombrePartidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
