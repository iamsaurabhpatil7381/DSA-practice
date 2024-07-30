import java.io.*;
public class File2 {
    public static void main(String args[]) throws IOException
    {
        File f1=new File("b.txt");
        
        
          f1.createNewFile();
          System.out.println(f1.exists());
          System.out.println(f1.canWrite());
          System.out.println(f1.length());
          
    }
}
