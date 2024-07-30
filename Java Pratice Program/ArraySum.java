public class ArraySum {
    public static void main(String args[])
    {
    {
        int arr[][]={{1,5,3},{3,2,1}};
        //ArraySum r=new ArraySum();
        rich(arr);
        
    }
    static void rich(int arr[][]){
        int sum=0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
           sum+=arr[0][j];
          
        }
       
      }
      System.out.println(sum);
    }

  


}
