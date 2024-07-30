public class MethodOverloading1 {
   int sum=0;
     void sum(int a,int b)
     {
        System.out.println( a+b);
     }
     int sum(int a,int b,int c)
     {
        return a+b+c;
     }
     MethodOverloading1()
     {
        super();
        this.sum=10;
        System.out.println(sum);
     }
        
    public static void main(String[] args) {
         MethodOverloading1 obj=new MethodOverloading1();
         obj.sum(100,20);

         obj.sum(100,20,30);
         

    }
    
}
