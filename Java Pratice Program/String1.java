public class String1 {
    public static void main(String[] args)
    {
      String name1=new String("kunal");
      String name2=new String("kunal");

      String s1="kunal";
      String s2="kunal";

       System.out.println(s1==s2);  // checks  only variable not value  or reference variable
        System.out.println(name1==name2);
        System.out.println(s1.equals(s2));
        System.out.println(name1.equals(name2));  //it actually checks value
    }
}
