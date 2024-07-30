import java.io.*;
public class File4 {
    public static void main(String args[]) throws IOException
    {
        
        File f1=new File("a.txt");
        System.out.println(f1.exists());
        //FileOutputStream  h1=new FileOutputStream(f1,true);
        
        
       f1.createNewFile();
      

    }
    
}
