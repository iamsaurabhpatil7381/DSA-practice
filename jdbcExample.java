public class jdbcExample {
    public static void main(String args[])throws ClassNotFoundException
    {
      //step 1:load the driver

      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver loading completed ...");

    }

    
}
