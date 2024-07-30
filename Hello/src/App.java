import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    
        public static void main(String args[])throws ClassNotFoundException,SQLException
        {
          //step 1:load the driver
    
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Driver loading completed ...");

          //step 2: create the  Connection

  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/student",  "root", null);
     System.out.println("connection is created successfully .."+connection);
            
    
        }
    
        
    
    
}
