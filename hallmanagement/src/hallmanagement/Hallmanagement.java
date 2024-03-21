
package hallmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

public class Hallmanagement {
    
    
    public static void main(String[] args) {
        FrontPage f = new FrontPage();
        f.setVisible(true);
    
    }
    public Connection getConnection()
    {
        Connection c = null;
        try{
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/RHALLCUPON","USER1","1234");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return c;
    }
}
