
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author urksi
 * 
 */
public class DBC {

    Connection conexion;
    Statement st;
    
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver was succesfully charger");
        } catch (Exception e) {
            System.out.println("Error Code 36: " + e);
        }

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/inventarios", "root", "01Uriel2016?");
            System.out.println("Driver connection was estableshed");

        } catch (SQLException ex) {
            System.err.println("Error Code 44: " + ex);
        }
    }
    public void close(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Code 40: In the closing operation");
        }
    }
    public void createStatement(){
        try {
            st = conexion.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Code 48: In the statement operation");
        }
    }
    public void update(String sql){
        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Succesfull!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Code 56: In the Update Operation "+ex.toString());
        }
    
    }
    public ResultSet query(String sql){
         try {
            
            return st.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Code 64: In the Query Operation");
            return null;
        }
    }

}
