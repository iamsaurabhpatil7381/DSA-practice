public class Shadowing {
   static int x;  //this  will be shadowed at line 8 or hided
    public static void main(String args[])
    {
        x=100;  //modifying
      System.out.println(x);
      int x=800;
      System.out.println(x);
      
      fun();
    }
    static  void fun()
    {  
       x=90; 
      System.out.println(x);
    }
    
}
