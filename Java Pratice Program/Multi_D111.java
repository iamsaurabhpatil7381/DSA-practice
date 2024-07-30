import java.util.*;
public class Multi_D111 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int [][]a=new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] b:a)
        {
            System.out.println(Arrays.toString(b));
        }

    }
    
}
