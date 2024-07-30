import java.sql.*;
class JBDC11
{
  public static void main(String args[])
  {

     try{
           //load the driver
          Class.forName("org.postgresql.Driver");
          //create a connection]
          String url="jdbc:postgresql://localhost:5432/postgres";
          String username="postgres";
          String password="7381";
          Connection con=DriverManager.getConnection(url,username,password);
          if(con.isClosed()){
            System.out.println("Connection is closed");
          }
          else
          {
            System.out.println("Connection is created");
          }
           
     }
     catch(Exception e)
     {
        e.printStackTrace();
     }

  }

}