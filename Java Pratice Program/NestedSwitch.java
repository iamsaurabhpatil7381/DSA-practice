import java.util.*;
public class NestedSwitch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int department=sc.nextInt();
        switch(day){
         case 1:
         {
            System.out.println("monday");
            break;
         }
         case 2:
         {
            System.out.println("wensday");
            break;
         }
         case 3:
         {

            switch(department)
            {
                case 1:
                {
                    System.out.println("IT");
                   break;    
                }
                case 2:
                {
                    System.out.println("management");
                 break;
                }
                default:
                {
                    System.out.println("management");
                 break;
                }
                
            }
         }
         default:
         break;

        }

    }
    
}
