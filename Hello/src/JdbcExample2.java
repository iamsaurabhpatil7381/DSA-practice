import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcExample2 {
    public static void main(String[] args)throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/information", "root", null);

             Statement statement=connection.createStatement();
           //` statement.execute("create table emp(eid int(4),ename char(10),esalary int(5))");

             System.out.println("table created successfully");

             Scanner sc=new Scanner(System.in);

             while (true) {
               
                System.out.println("enter your eid");
                int eid=sc.nextInt();

                System.out.println("enter your ename");
                String ename=sc.next();

                System.out.println("enter your esalary");
                int esalary=sc.nextInt();

                statement.executeUpdate("insert into emp values("+eid+","+ename+","+esalary+")");

                System.out.println("do u want to add some record (yes/no)");
                 String options=sc.next();

                 if(options.equals("no"))
                break;
                
             }



              sc.close();
             connection.close();
             statement.close();


        
    }
    
}
