import java.sql.*;

public class FirstJDBC
{
    public static void main(String  args[])
    {
        try
          {
               //load the driver
               Class.forName("com.mysql.cj.jdbc.Driver");
              //create connection
              String url="jdbc:mysql://localhost:3307/employee";
              String username="root";
              String password= "";
 
               Connection con=DriverManager.getConnection (url,username,password);
                 if(con.isClosed())
                 {
                    System.out.println("Connection is closed");
                  }
                    else
                 {
                    System.out.println("Connection  created");
                  }

           }
      catch(Exception e)
          {
             e.printStackTrace();
 
           }
    }
}