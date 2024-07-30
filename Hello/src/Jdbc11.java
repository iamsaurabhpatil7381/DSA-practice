import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc11 {
    public static void main(String[] args) {
           //try with resources
           try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee", "root", null);
               Statement  statement=connection.createStatement(); ) 
               
               {
                //   statement.execute("create table ram(id int(2),name varchar(6),salary int(5))");
                //   System.out.println("table created successfully");

                  statement.executeUpdate("insert into ram values(1,'shree',90000),(2,'ganesh',70000),(3,'hari',60000)");
                  System.out.println("record  created successfully");

                  ResultSet set=statement.executeQuery("select salary,name from ram");
                 while (set.next()) {
                    System.out.println(set.getInt(1)+" "+set.getString(2));
                    
                 }



            
           } 
           catch (Exception e) {
            e.printStackTrace();
           }
    }
    
}
