public class Patter1 {
    public static void main(String[] args)
    {
        int n=5;
        star(n);
        star1(n);
        star2(n);
        star3(n);
        star6(n);
        star7(n);
        star8(n);
    }
    static void star(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
    static void star1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
    }


        static void star2(int n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i;j++)
                {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        static void star3(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(j +"  ");
                }
                System.out.println();
            }
        }


        static void star6(int n)
        {
           for (int row = 0; row<2* n; row++) {
             int totalRows= row>n ? 2*n-row:row;
            for (int col = 0; col < totalRows; col++) {

                System.out.print("* ");
            }
            System.out.println();
           }
        }


           static void star7(int n)
        {
           for (int row = 0; row<2* n; row++) {
             int totalColsRows= row>n ? 2*n-row:row;
             int noOfSpaces=n-totalColsRows;
              for (int s = 0; s <noOfSpaces; s++) {
                 System.out.print( " ");
              }
            for (int col = 0; col < totalColsRows; col++) {

                System.out.print("* ");
            }
            System.out.println();
           }


        }
        static void star8(int n)
        {
           for (int row = 1; row<2* n; row++) {
             int c= row>n ? 2*n-row:row;
            
              for (int s = 0; s <n-c; s++) {
                 System.out.print( "  ");
              }
            for (int col = c; col >=1; col--) {

                System.out.print(col+" ");
            }
            for (int col = 2; col <=c; col++) {

                System.out.print(col+" ");
            }
            System.out.println();
           }


        }
    
}
