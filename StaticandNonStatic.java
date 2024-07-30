public class StaticandNonStatic {
    public   static void main(String[] args) {
      
        System.out.println(10);

        fun();
       StaticandNonStatic obj=new StaticandNonStatic();

        obj.fun("ram");
    }

       StaticandNonStatic()
       {
        
          fun();
       }

     static  void fun()
          {
          System.out.println("hello");
           StaticandNonStatic obj=new StaticandNonStatic();
             obj.fun( "xx");
         }
     void fun(String x)
          {
           //fun();
           fun1();
            System.out.println(" hello hi   " + x);
          }
      void fun1()
      {
        System.out.print("jay shree ram");
      }
}
