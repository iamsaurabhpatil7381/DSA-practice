public class MissingNumber {
    public static void main(String[] args)
    {
        int[] arr={1,2};
       System.out.println( miss(arr));
    }
      
    static int miss(int[] arr)
    {
        int ans=0;
        int i=0;
          while(i<arr.length)
          {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }


         }
         
         for(int index=0;index<arr.length;index++)
         {
           if(arr[index]!=index+1)
           {
               //return new int[]{arr[index],index+1};
              ans= index+1;
           }
         }
        return ans;
     
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
