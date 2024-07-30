import java.io.*;
public class File3 {
    public static void main(String[] args) throws IOException {
    File f=new File("a.txt");
   
    f.createNewFile();
    System.out.println(f.exists());
      FileOutputStream h1=new FileOutputStream(f);
        h1.write('a');
        h1.close();

    }
}
