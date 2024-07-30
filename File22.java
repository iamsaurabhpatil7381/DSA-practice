import java.io.*;
public class File22 {
    public static void main(String args[]) throws IOException
    {
        String s1="are you kidding";
        FileOutputStream g1=new FileOutputStream("c.txt");
        char []m=s1.toCharArray();
        for(int i=0;i<m.length;i++)
        {
           g1.write(m[i]);
        }
        g1.close();
    }
    
}
