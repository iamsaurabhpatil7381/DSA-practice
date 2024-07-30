import java.util.*;
public class Maximum11 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
     int ans=maximum(x,y,z);
     System.out.println(ans);

     int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
     int hi=minimum(a,b,c);
     System.out.println(hi);
    }
    static int maximum(int x,int y,int z)
    {
       if(x>y && x>z)
       {
        return x;
       }
       else if(y>x && y>z)
       {
        return y;
       }
       return z;
    }

    static int minimum(int a,int b,int c)
    {
       if(a<b && a<c)
       {
        return a;
       }
       else if(b<c && b<a)
       {
        return b;
       }
       return c;
    }
}
