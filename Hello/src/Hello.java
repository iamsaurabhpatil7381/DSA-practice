import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Hello {
    public static void main(String[] args) {
          Connection connection=null;
        Statement statement=null;
        try{
        //load the driver 
           Class.forName("com.mysql.cj.jdbc.Driver");
        
        //create the connection

            connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/student", "root", null);


             statement=connection.createStatement();


            //  statement.execute("create table manage(id int(4),name varchar(10),age int(3))");
            //  System.out.println("table successfully" );
            // int x=statement.executeUpdate("update student set esalary=esalary+500 where esalary>13000");

            // System.out.println("recored successfully" +" " +x);

        //    int y= statement.executeUpdate("delete from student where eid=3");
        //     System.out.println("recored successfully" +" " +y);

         statement.executeUpdate("drop table manager");
         System.out.println("table dropped ");
        }

        catch(Exception e)


        {
            e.printStackTrace();
        }
        finally{
            try{
            statement.close();
            connection.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }

    }
    
}
