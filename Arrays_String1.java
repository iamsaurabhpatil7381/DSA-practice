import java.util.*;
public class Arrays_String1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String []arr=new String[5];
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr));
        arr[1]="Sshd";
        System.out.println(Arrays.toString(arr));

    }
    
}