import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc22 {
    public static void main(String[] args) {
           //try with resources
           try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/Spring", "root", "");
               Statement  statement=connection.createStatement(); ) 
               
               {
                  //statement.execute("create table ram(id int(2),name varchar(6),salary int(5))");
                  System.out.println("table created successfully");


            
           } 
           catch (Exception e) {
            e.printStackTrace();
           }
    }
    
}
