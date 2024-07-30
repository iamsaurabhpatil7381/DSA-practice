

class Solution {
        public static void main(String args[])
        {
            int[] arr = {10,2,5,8,6};
            int result=check(arr);
            System.out.println(result);

}
    
        public static int check (int[] arr) {
        
            
           for (int i = 0; i < arr.length; i++) 
           {
             for (int j = 0; j < arr.length; j++)
              {
                  if(arr[i] != arr[j] && arr[i]==2*arr[j])
                    {
                      return j;

                     }
               }
             }
               return -1;
          }
        
        
}
    
