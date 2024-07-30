public interface InnerInterFaces222 {
   public void show();
   public void make();

    
}
public class InterFaces222 implements InnerInterFaces222 {
  @Override
  public void show() {
    System.out.println("show me something ");
  }

  @Override
  public void make() {
      System.out.println("show me something ");
  }
      
    public static void main(String[] args) {
        int x=10;
        System.out.println(x++);
        System.out.println(--x);
    
           InterFaces222 faces222=new InterFaces222();
           faces222.make();
           faces222.show();

    }

   
    
    
}
