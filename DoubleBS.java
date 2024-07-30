public class DoubleBS {

    public static void main(String[] args)
    {
        int[] arr = {-4,8,0,0};
        System.out.println(checkIfExist(arr));
    }

    static  boolean checkIfExist(int[] arr) {
         
          for(int i=0;i<arr.length;i++)
          {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] == 2 * arr[j] && i!=j)
                {
                    return true;
                }
            }
          }
          return false;

    }
    
}
