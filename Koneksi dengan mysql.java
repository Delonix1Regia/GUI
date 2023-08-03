// Koneksi dengan mysql


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/dbsatu";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass); 
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal "+e.getMessage());
        }
        return MySQLConfig;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}