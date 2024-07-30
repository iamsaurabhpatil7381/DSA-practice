import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcExample {
    public static void main(String args[])throws ClassNotFoundException,SQLException
    {
      //step 1:load the driver

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/student ","","root");



    con.close();

    

    }

    
}
