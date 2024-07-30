public class SearchInRange {
    public static void main(String args[])
    {
int arr[]={1,2,3,4,5,6,7};
int target=44;
System.out.println(search(arr,target,1,4));



    }

    static int search(int[] arr,int target,int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
                int element=arr[i];
                if(element==target)
                {
                    return i;
                }
            
            }
        return -1;    
            
    }
    
}
