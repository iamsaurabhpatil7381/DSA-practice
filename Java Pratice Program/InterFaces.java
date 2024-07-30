
    interface D{

        void fun();
    
      
  
}
   interface B extends D {
        void greet();

       
   }
       
   
   public class InterFaces implements B {
    
       @Override
       public void fun() {
           System.out.println("Have a fun");
       }
   
       @Override
       public void greet() {
           System.out.println("Hello good morning");
       }



       public static void main(String[] args) 
       {

        
        InterFaces interF2=new InterFaces();
   
              interF2.fun();
              interF2.getClass();
              interF2.greet();
              
       }
   
      
          
   }
   
    

