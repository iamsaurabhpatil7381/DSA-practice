public class ObjectDemp {

    int num;
    float no;
    ObjectDemp(int num,float no)
    {
        this.num=num;

    }
     @Override
     public boolean equals(Object obj) {
         
        return this.num==((ObjectDemp)obj).num;
        // return super.equals(obj);
     }
     @Override
     protected Object clone() throws CloneNotSupportedException {
        
         return super.clone();
     }
   
     @Override
     public String toString() {
        
         return super.toString();
     }
     @Override
     public int hashCode() {
          return super.hashCode();
     }

     @Override
     protected void finalize() throws Throwable {
        
         super.finalize();
     }
    
    public static void main(String[] args) {
      ObjectDemp objectDemp=new ObjectDemp(34,12);
      // System.out.println( objectDemp.hashCode());

      
       ObjectDemp objectDemp1=new ObjectDemp(34,20);
       //System.out.println( objectDemp1.hashCode());
       System.out.println((objectDemp==objectDemp1));
       System.out.println((objectDemp.equals(objectDemp1)));


       System.out.println(objectDemp.getClass().getName());
    }
}