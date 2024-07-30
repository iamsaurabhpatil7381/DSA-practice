public class Finalize {
       

    public static void main(String[] args) {
        
          A obj;
          for (int i = 0; i < 100000000; i++) {
            obj=new A("raju");
          }

       System.out.println(10);
    
    
    }

    
          

}

 class A{
   final int a=10;
    String name;

   public A(String name)
     {
        this.name=name;
        
     }
     @Override
     protected void finalize() throws Throwable {
         System.out.println("object is destroyed");
     }
}