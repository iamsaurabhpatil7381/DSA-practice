
public class Scope {
    public static void main(String args[])
    {
      int a=10;
      int b=90;
      String name="rahul";
         {
            int c=80;
            a=100;
            name="rahul";
            System.out.println(name);
            System.out.println(c);
         }
         System.out.println(a);
         System.out.println(b);
         System.out.println(name);

         for(int i=0;i<=4;i++)
        {
            System.out.println(i);
            a=10000;

        }
        System.out.println(a);
        
       
    }
    
}
