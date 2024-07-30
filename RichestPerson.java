public class RichestPerson {

    public static void main(String[] args) {
     int[][] accounts={{1,2,3},{1,2,3}};
    
        RichestPerson r=new RichestPerson();
        r.maximumWealth(accounts);


        
    }

    public  int maximumWealth(int [][] accounts)
    {
        int max=Integer.MIN_VALUE;
   
       int sumofwealth=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<=accounts[i].length;j++)
            {
               sumofwealth+=accounts[i][j];
              
            }
            if(sumofwealth>max)
           {
            max=sumofwealth;
           }
        }
        return sumofwealth;
     }
    
}
