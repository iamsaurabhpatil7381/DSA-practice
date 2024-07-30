public class EquivalentString {
    public static void main(String[] args)
    {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static  boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str=null;
        for(int i=0;i<word1.length;i++)
        {
            str+=word1[i];
        }
        String str1=null;
        for(int i=0;i<word2.length;i++)
        {
            str1+=word2[i];
        }
        if(str.equals(str1))
        {
            return true;
        }
        return false;
    }
    
}
