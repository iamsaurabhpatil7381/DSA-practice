public interface Engine
{  

   // interface has only abstarct method
     void start();
     void stop();
   
          void acc();
   
}
public class Car1 implements Engine {

    public void start()
    {
        System.out.println("this is new start");
    }
    public void stop()
    {
        System.out.println("this is new stop");
    }
    public void acc()
    {
        System.out.println("this is new acc");
    }
}
