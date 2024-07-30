public interface  Engine
{
    static final int price=78000;
    void start();
    void stop();
 
    void acc();
 

}
public interface  Brake
{
    
    void brake();
    
}
public interface Media {
  
    void start();
    void stop();
 
    

}


public class Car1 implements Engine ,Brake{
       @Override    
      public void start()
       {
        System.out.println("this is new start");
       }
       @Override    
       public void stop()
       {
        System.out.println("this is new stop");
       }

       @Override    
       public void brake()
       {
        System.out.println("this is new brake");
       }
       @Override    
       public void acc()
       {
        System.out.println("this is new acc");
       }
}
