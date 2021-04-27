import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GARV
 */
public class JavaConnect {
    
    Connection con;
   
    public static Connection connecrDB(){
        try
        {
          Class.forName("org.sqlite.JDBC");
          Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Manohar\\Documents\\NetBeansProjects\\Library Management System\\Library.sqlite");
           return con;
        }catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
