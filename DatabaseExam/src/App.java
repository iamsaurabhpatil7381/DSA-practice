public class App {
    public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Connection is established..");
    }
}
