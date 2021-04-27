
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GARV
 */
public class SplashClass {
    
        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        
    
    public SplashClass() {
        con = JavaConnect.connecrDB();
    }
        
    public static void main(String args[])
    {   
        Splash s = new Splash();
        Login li = new Login();
        s.setVisible(true);
        try
        {
            for(int i=1;i<=100;i++)
            {
                Thread.sleep(40);
                s.l1.setText(Integer.toString(i)+"%");
                s.p1.setValue(i);
                
                if(i==100)
                {
                   
                   s.setVisible(false);
                   li.setVisible(true);
                }
            }
        }catch(Exception e)
        {
            
        }
    }
    
}
