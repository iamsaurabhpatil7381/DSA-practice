public class Exception1 {
    
    public static void main(String[] args) {
        int a=10; 
        int b=90;
        try{
            int c=a/b;
           
        }
        catch(ArithmeticException e)
        {
               System.out.println("cannot be divived");
        }
        catch(Exception e)
        {
               System.out.println("cannot be divived");
        }
        
        finally
         {
            System.out.println("nonethinf");
         }

        divide(10,0);
        
    }
    static   int divide(int a,int b)throws ArithmeticException{
        if(b==0)
        {
            throw new ArithmeticException("hi Sy");
        }
        return a/b;
    } 

 }

