import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class jdbcExample1 {
    public static void main(String args[])throws ClassNotFoundException,SQLException
    {
      //step 1:load the driver

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=Driver.getConnection("jdbc:mysql://localhost:3307/student ");
     


    con.close();
     
    

    }

    
}
