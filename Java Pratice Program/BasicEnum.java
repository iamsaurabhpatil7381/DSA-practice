public interface InnerBasicEnum {
    void A();

    
}
public class BasicEnum implements InnerBasicEnum {
    enum Week{
        Monday,tuesday,thursday,friday,saturday,sunday;
    

    //enums are constants 
    //public and static ,final
    //since it is finalu cannot craete child of it
    Week()
    {
      System.out.println("constructor called for " +this);
    }
    //not public or protected,only private or defualt
    //why?we donnot want create new objects 
    //this is not enum concepts,thats why
    public void A()
    {
      System.out.println("helo how are u");
    }
    
    

}

    public static void main(String[] args) {
        Week week;
        week=Week.thursday;
        for (Week day : Week.values()) {
            System.out.println(day);
            
        }
        System.out.println(week.ordinal());
        System.out.println(week);
     
        week.A();

        System.out.println(week.valueOf("Monday"));
        
    }
    
}
