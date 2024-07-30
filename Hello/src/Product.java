import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Product {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", null);

        Statement   statement=con.createStatement();
       // statement.execute("create table product(pid int(4),pname varchar(10),pcost int(7),mfgdate date,expdate date)");
        System.out.println("table created successfully");
      
        statement.executeUpdate("insert into product values(2,'pen',120,'2021-01-01','2023-01-01')");
        statement.executeUpdate("insert into product values(3,'lamp',220,'2023-01-01','2024-01-01')");
        statement.executeUpdate("insert into product values(4,'gar',203,'2024-01-01','2024-02-01')");

        statement.close();
        con.close();

        
    }
    
}
