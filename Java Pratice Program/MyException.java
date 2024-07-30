public class MyException  extends Exception{
    
       public MyException(String message)
        {
            super(message);
        }

        public static void main(String[] args)throws Exception {
            
        
        String  name="kunal";
        if(name.equals("kunal"))
        {
           throw new  MyException("name is kunal");
        }
    

    }
 }


