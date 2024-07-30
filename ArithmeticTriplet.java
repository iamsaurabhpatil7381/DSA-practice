import java.util.ArrayList;

public class ArithmeticTriplet {
     
    public static int arithmeticTriplets(int[] arr, int diff) 
    {
        int count=0;
             
           
        //  for ( int i = 0; i< arr.length-2; i++) {
        //     for (int j = i+1; j <arr.length-1 ; j++) {
        //          for(int k=j+1;k<arr.length;k++)
        //          {
        //               if(arr[j]-arr[i]==diff && arr[k]-arr[j]==diff)
        //               {
        //                 count++;
        //               }
        //          }
        //       }   
        //      }

              ArrayList<Integer> list=new ArrayList<>();
                  for (int i = 0; i < arr.length; i++) {
                         list.add(arr[i]);
                       
                       
                  }
                   for (int i :list) {
                      if( list.contains(i+diff) && list.contains(i+diff+diff))
                      {
                        count++;
                      }
                   }
        return count;
    }


    public static void main(String[] args) {

       int[] arr = {0,1,4,6,7,10};
       int diff = 3;
       System.out.println("hello world");
             System.out.println(arithmeticTriplets(arr, diff));
            
            }
    
}
