package mysterionkid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conector {
      Connection con1;
      
      
        public Conector(){
        
        try {
            
     
            con1=DriverManager.getConnection("jdbc:ucanaccess:"   //DIRECCION DE LA BASE DE DATOS
                  + "//C:/Users/enzodsdsad/Desktop/ProyectoPoo/"
                    + "MysterionKid/Base.accdb");
                   
                    
           Statement s=con1.createStatement();
            System.out.println("conectado");
           
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Connection conectarme()
    
    {
    
        return con1;
    }
 
}
