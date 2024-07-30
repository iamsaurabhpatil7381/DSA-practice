import java.io.*;
public class File7 {
    public static void main(String args[]) throws IOException
    {
        String s="Hello i am fine";
       /* File f=new File("g.txt");
        f.createNewFile();
        f.exists(); */
       
       FileOutputStream f1=new FileOutputStream("g.txt",true);
       char []c1=s.toCharArray();
         for(int i=0;i<c1.length;i++)
         {
            f1.write(c1[i]);
         }
         f1.close();
       
    }
    
}
