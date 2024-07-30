import java.util.Arrays;

public class NonZeroArray {
    public static void main(String[] args) {
       int[]  arr={1,2,5,4,0,7,0,0,11,2};

       //nonZero(arr);

       nonZero1(arr);
    }
    static void nonZero(int[] arr)
    {
        int n=arr.length;
      int[]  temp=new int[n];
      int index=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0)
            {
                temp[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
    
    }
    
    static void nonZero1(int[] arr)
    {
        int j=-1;

        
       for (int i = 0; i < arr.length; i++) {
             if(arr[i]==0)
             {
                j=i;
                break;
             }
             
       }
      
        
    

        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0)
            {
                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        
    }
}

