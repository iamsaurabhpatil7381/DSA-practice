public class ObjectPrint {

    int num=10;
    ObjectPrint()
    {
    
        this.num=10;
    }
   @Override
   public String toString() {
       return "ObjectPrint{"+"num"+num+'}';
   }
    public static void main(String[] args) {
       ObjectPrint obj=new ObjectPrint();
         System.out.println(obj);
    }
    
}
