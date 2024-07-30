public class Consturctor {
    
    int size;
    Consturctor()
    {

        super();
        System.out.println("hi");
    }
    Consturctor(int size)
    {
        super();
       this.size=size;
       System.out.println(size);
    }


    Consturctor(int l,int w,int b)
    {
        l=10;
        w=70;
        b=80;

        
       
        System.out.println(l*w*b);
    }
    
}


