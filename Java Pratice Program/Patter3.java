public class Patter3 {
    public static void main(String args[])
    {
        int n=5;
        int m=5;
       patter1(n);
       patter2(m);
    }
    static void patter1(int n)
    {
        int original=n;
         n=2*n;

        for(int  row=1;row<n;row++)
        {
            for(int col=1;col <n;col++)
            {
                int indexNo=original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(indexNo +" ");
            }
            System.out.println();
        }
    }
    static void patter2(int m)
    {
        
        

        for(int  row=0;row<2*m;row++)
        {
           int totalRows=row>m? 2*m-row:row;
             int noOfSpace=m-totalRows;
             for(int s=5 ;s>=noOfSpace;s--){
                System.out.print( " ");
                }
            for(int col=5;col>=totalRows;col--)
            {
                
                System.out.print("*"+" ");
             }
            
                 
            System.out.println();
        }
    }
    
}
