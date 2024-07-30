public class PowerOfTwo {
    public static void main(String[] args)
    {
        int n=12;
       if(n>0 && n!=0)
       {

           boolean ans=(n&(n-1))==0;

           System.out.println(ans);
       }
        else{
         System.out.println(false);
        }
    
   }
}
