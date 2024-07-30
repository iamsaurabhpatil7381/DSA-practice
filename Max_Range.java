public class Max_Range {
    public static void main(String args[])
    {
      int a[]={100000,3,34,55,5555};
    //System.out.println(maxi(a));
    System.out.println(max(a,0,4));

    }
    // static int maxi(int a[])
    // {
    //     int maximum= a[0];
    //     for(int i=1;i<a.length;i++)
    //     {
    //         if(a[i]>maximum)
    //         {
    //             maximum=a[i];
    //         }
    //     }
    //   return maximum;
    // }

    static int max(int a[],int start,int end)
    {
    //    if (end>start) {
    //     return -1;
        
    //    }
       if(a==null)
       {
        return -1;
       }

       int maximum=a[start];
       
        for(int i=start;i<=end;i++)
        {
          if(a[i]>maximum)
          {
            maximum=a[i];
          }
        }
       return maximum;
     

    }


    
}
