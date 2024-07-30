 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
    
    public static void main(String[] args)//throws ClassNotFoundException,SQLException 
    {
        Connection connection=null;
        Statement statement=null;
        try{
        //load the driver 
           Class.forName("com.mysql.cj.jdbc.Driver");
        
        //create the connection

            connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee", "root", null);

           System.out.println("connected");

          //create the statement
           statement=connection.createStatement();

          //insert values into table
          statement.executeUpdate("insert into student values(1,'ram',10000)");
          statement.executeUpdate("insert into student values(2,'mam',13000)");
          statement.executeUpdate("insert into student values(3,'sham',30000)");
          System.out.println("record insreted successfully");

        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //close the connection
            try{
            if(statement!=null)
            statement.close();
            if(connection!=null)
            connection.close();
            }
            catch(Exception e)
        
            {
                e.printStackTrace();
            }

        }
    }
}


    

