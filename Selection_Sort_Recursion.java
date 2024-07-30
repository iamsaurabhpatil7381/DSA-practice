import java.util.*;
public class Selection_Sort_Recursion {
    public static void main(String[] args) 
    {
         int[] arr={3,4,6,12,8,9,133};
      

        //  sort(arr,arr.length-1,0,0);
        //  System.out.print(Arrays.toString(arr));
    }




//       static void selectionSort(int[] arr)
//       {
//         for(int i=0;i<arr.length;i++)
//         {
//             int last=arr.length-i-1;
//             int maximum=maxi(arr, 0,last);

//             swap(arr,last,maximum);

//         }
          
//     }
//      static void swap(int[] arr,int first,int second)
//         {
//             int temp=arr[first];
//             arr[first]=arr[second];
//             arr[second]=temp;

        
//       }
// // static int maxi(int[] arr,int start,int end)
//     {
//         int max=start;
//         for (int i = start; i <= end; i++) {
//              if(arr[i]>arr[max])
//              {
//                 max=i;
//              }
//         }
//         return max;
//     }
    
    static void sort(int[] arr,int r,int c ,int max)
    {
        if(r==0)
        {
            return;
        }
        
        if(r>c)
        {  
            if(arr[c]>arr[max])
            {
                sort(arr,r,c+1,c);
            }
            else{
                sort(arr,r,c+1,max);
            }
        }
        else
        {
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
        }
          
           sort(arr,r-1,0,0);
           
        }

       
    
}
