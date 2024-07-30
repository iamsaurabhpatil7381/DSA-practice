abstract class Same1{
    int x;
    int y=90;
    void run(){
        System.out.println("hi");
            }
        abstract void play();
    }

 class Hello111  extends Same1
{
    int g=10;
   
    public void play()
    {
       System.out.println(g+" "+y +" "+x);
    }
    
    
}
class P1 {
    public static void main(String args[])
    {
        Hello111 h1=new Hello111();
        h1.play();
        
    }
}
