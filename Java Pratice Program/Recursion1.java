public class Recursion1 {
     public static void main(String args[])
     { 
          
        print(1);
       // print1("saurabh");
     }

    static void print(int n)
     {
        //base condition
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
        //recursive call
     }
    //  static void print1(String n)
    //  {
    //     System.out.println(n);
    //     print1(n);
    //  }
}
