public class GuessGame {
    public static void main(String[] args) {
       int n=10;
       System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {
        
          int start=1;
          int end=n;
          while (start<=end) {
            
              int mid=start+(end-start)/2;
               int g=mid;
                if(mid==pick)
                {
                    return mid;
                }
                else if(mid>pick)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            
          }
         
    }
}

    

