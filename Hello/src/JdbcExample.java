import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {
    public static void main(String[] args) {

        //try with resources ,no need to close connection
        try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", null);
           Statement statement=connection.createStatement();)
        {

            ResultSet set=statement.executeQuery("select * from employe");

            //by passing column name

           while (set.next()) 
        {
         //System.out.println(set.getInt("eid")+" "+set.getString("ename")+" "+set.getDouble("esalary"));
         
         System.out.println(set.getInt("eid"));
        }

        ////by passing column index 
        
        // while ( set.next()){
        //     System.out.println(set.getInt(1)+" " +set.getString(2)+" "+set.getDouble(3));
            
        // }
            
        }
       
        catch(SQLException e)
        {

        }
        catch(Exception e)
        {

        }
    }
    
}
