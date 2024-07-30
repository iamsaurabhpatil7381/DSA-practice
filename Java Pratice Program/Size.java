public class Size extends  Consturctor{
       int weidth;
     Size(int weidth)
     {
       
        this.weidth=100;
        System.out.println(weidth);
     }
     
     Size(int weidth,int l,int w,int b)
     {
        super(l,w,b);   //call  the parent class constructor
        //used to initialise values present in parent class

        this.weidth=1000;
        System.out.println(weidth+l+w+b);

     }
    
}

