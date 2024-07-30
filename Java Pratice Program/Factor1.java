import java.util.*;
public class Factor1 {
    public static void main(String [] args)
    {
        int n=20;
        //fact(n);
        fact1(n);
        fact2(n);
    }
    // static void fact(int n)
    // {
    //     // for(int i=1;i<=n;i++)
        // {
        //     if(n%i==0)
        //     {
        //         System.out.print(i+" ");
        //     }
        //O(n)
        // int i=1;
          
        //    while(i<=n)
        //    {
              
        //        if(n%i==0)
        //        {
        //          System.out.println(i+" ");
        //        }
               
        //       i++;
        //    }
        // }

        static void fact1(int n)
        {
            for(int i=1;i<=Math.sqrt(n);i++)
            {
                  if(n%i==0)
                  {
                
                   if(n/i==i)
                   {
                    System.out.print(i+" ");
                   }

                   else{
                System.out.print(i+ " "+ n/i+" ");
                   }
                }
               
            }
            System.out.println();
        }

         //both time and space will be sqrt of n
         static void fact2(int n)
        {

            ArrayList<Integer> list=new ArrayList<>();
            for(int i=1;i<=Math.sqrt(n);i++)
            {
                  if(n%i==0)
                  {
                
                   if(n/i==i)
                   {
                    System.out.print(i+" ");
                   }

                   else{
                       System.out.print(i+ " ");
                       list.add(n/i);
                   
                   }
                }
                  
            }
           // System.out.println(list);
            //revese the array
            for(int i=list.size()-1;i>=0;i--)
            {
                System.out.print(list.get(i)+" ");
            }

        }
    }
    

