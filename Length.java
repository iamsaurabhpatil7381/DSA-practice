public class Length {
    String s="Hello World";
   int count=0;
    
    public  int lengthOfLastWord(String s)
    { 

        for(int i=0;i<s.lastIndexOf(s);i++)
        {
          count=i;

        }
         System.out.println(count++);
      return -1;  

    }
    public static void main(String  args[])
    {

       Length l=new Length();
       l.lengthOfLastWord("Hello World");
    }
    
}
