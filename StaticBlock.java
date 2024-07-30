public class StaticBlock {
    
        static int a=4;
        static int b;
        //will only run once ,when the first obj is created i.e. when the class is loaded first times
        static{
            System.out.println("I am in static block");
            b=a*5;
        }
    
    public static void main(String[] args) {
       StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a +" " +StaticBlock.b);

         // System.out.println(obj.a +" " +obj.b);   you cannot access it via references
            
         StaticBlock.b+=3;
           
         StaticBlock obj1=new StaticBlock();
         System.out.println(StaticBlock.a +" " +StaticBlock.b);
        }

}
