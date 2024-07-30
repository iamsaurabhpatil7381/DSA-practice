import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Student_DB {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/information", "root", null);
        
        //create statement
        Statement statement=connection.createStatement();
       // statement.execute("create table student(sid int(4),sname varchar(15),smarks int(3))");
           
        //statement.execute("create table student(sid int(4),sname varchar(15),smarks int(3))");
        System.out.println("table created sucessfully");
        statement.executeUpdate("insert into student values(1,'ram',90),(2,'shree',32),(3,'mahesh',30),(4,'raju',60)");
    
        System.out.println("record  inserted sucessfully");
        statement.executeUpdate("update student set smarks= smarks+3    where smarks<35");
        ResultSet set=statement.executeQuery("select * from student");

           
        while (set.next()) {
            System.out.println(set.getString(1)+" "+set.getString(2)+" "+set.getInt(3));
            
        }
        statement.execute("drop table student");
      System.out.println("table dropped successfully");
        statement.close();
        connection.close();
     

           
   


    }
    
}
