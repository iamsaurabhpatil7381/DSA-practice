public class Son extends Parent{

    int age;
    Son(int age)
    {
        super(age);
       
    }
    @Override
    void career(String name)
    {
            System.out.println("He is going to be "+name);
    }
     @Override
    void partner(String name,int age)
    {
            System.out.println("He is going to be "+name+" "+age); 
    }


}
