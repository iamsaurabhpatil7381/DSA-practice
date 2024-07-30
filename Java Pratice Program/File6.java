import java.io.*;
public class File6 {
    public static void main(String args[]) throws IOException
    {
        String s1="Hello how are you";
        FileOutputStream f1=new FileOutputStream("a.txt");
        char m[]=s1.toCharArray();
        for(int i=0;i<m.length;i++)
        {
            f1.write(m[i]);
        }
        f1.close();


    }
    
}
