public class SmallestCharacter {
    public static void main(String args[])
    {
        char[] letters={'c','f','j','k','l','m','n'};
        char target='j';

    char ans=smaller(letters,target);
   System.out.println(ans);

//    int x=3;
//    System.out.println(++x*8);

    }

    static char smaller(char[] letters,char target) 
    {
        int start=0;
        int end=letters.length-1;

        while(start<=end)
        {
          
            int mid=(start+(end-start)/2);
           if(target<letters[mid])  
           {
             end=mid-1;
           }
           else
           {
              start=mid+1;
           }


        }

       
        return letters[start% letters.length];
    }
}
