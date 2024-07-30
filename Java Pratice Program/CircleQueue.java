public class CircleQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

   

    protected  int end=0;
    protected int front=0;
    protected int size=0;
    public CircleQueue()
    {
        this(DEFAULT_SIZE);
    }

   public CircleQueue(int  size)
    {
      this.data=new int[size];
    }

    public boolean isFull()
    {
        return  size==data.length;
    }
    public boolean isEmpty()
    {
        return  size==0;
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end]=item;
        end++;

        end=end % data.length;
        size++;
        //data[end++]=item;
        return true;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
      int removed=data[front++];
       
        
         front=front%data.length;
         size--;
      return removed;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
      return data[front];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return;
        }
         int i=front;
          do{
            System.out.print(data[i]+" -> ");
           i++;
            i%=data.length;
        } while(i!=end);
        System.out.println("end");

    }
     public static void main(String[] args) throws Exception{
       CircleQueue queue=new CircleQueue(5);
       queue.insert(5);
       queue.insert(15);
       queue.insert(53);
       queue.insert(45);
       queue.insert(576);
         queue.display();
 
         System.out.println(queue.remove());
         queue.insert(133);
         queue.display();
        
         System.out.println(queue.remove());
         queue.insert(1);
         queue.display();
 
     }
    
}
