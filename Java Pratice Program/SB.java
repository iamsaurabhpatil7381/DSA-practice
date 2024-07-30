public class SB {
    public static void main(String[] args)    
    {

        StringBuilder st=new StringBuilder();
       // char ch='a';
        for(int i=0;i<26;i++)
        {
           char ch=(char)('a'+i);

            st.append(ch +" ");


        }
        System.out.println(st);
     
           st.deleteCharAt(1);
           System.out.println(st);
        st.reverse();
        System.out.println(st);

       
    }
}
