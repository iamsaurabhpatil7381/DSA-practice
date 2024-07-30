import java.sql.*;

public class Demo {
    public static void main(String[] args)//throws ClassNotFoundException,SQLException
     {

        Connection connection=null;
        Statement statement=null;
      try{ Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is successful ");
        //create conncetion
         connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", null);
        System.out.println("connected"+connection);

        //create statement
         statement=connection.createStatement();

        //execute the command
        statement.execute("create table manager(eid int(10),ename varchar(40),esalary int(6))");
        System.out.println("table created successfully...");

    }
    catch(Exception e)
    {
       e.printStackTrace();
    }


}

    
}
