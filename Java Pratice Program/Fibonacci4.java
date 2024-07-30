public class Fibonacci4 {
    public static void main(String[] args) {
    
        System.out.println(fibo1(7));
       // print(1);
        
    }
    static int fibo1(int n)
    {
        //base condition
        if(n<2)
        {
            return n;
        }
               //recursie call
        return fibo1(n-1)+fibo1(n-2);
    }

    static void  print(int m)
    {
       if(m==5)
       { 
         System.out.println(m);
         return;
       }
       System.out.println(m);
       print(m+1);
    }
    
}