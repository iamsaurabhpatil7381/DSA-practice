public class MethodOverloading {
    public static void main(String args[])
    { 
        fun(90);
        fun(80,70);
        int ans=sum(11,90,80);
        System.out.println(ans);

    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    static void fun(int a){
      System.out.println(a);
    }
    static void fun(int b,int c){
        System.out.println(b);
        
        System.out.println(c);
    }

    
}
